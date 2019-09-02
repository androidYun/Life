package com.gy.life.controller;

import com.google.gson.Gson;
import com.gy.life.common.ResultEntity;
import com.gy.life.service.impl.QiniuUploadFileServiceImpl;
import com.gy.life.utils.FileUtils;
import com.qiniu.http.Response;
import com.qiniu.storage.model.DefaultPutRet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@Component
@RequestMapping(value = "/file")
public class FileController {
    @Value("${qiniu.cdn.prefix}")
    private String cdn;

    @Autowired
    QiniuUploadFileServiceImpl qiniuUploadFileService;

    @RequestMapping(value = "/imageUpdate", method = RequestMethod.POST)
    @ResponseBody
    private ResultEntity updateImage(HttpSession session, @RequestParam("uploadFile") MultipartFile[] uploadFile) {

        List<String> updatePathList = new ArrayList<String>();
        for (int i = 0; i < uploadFile.length; i++) {
            String insertPath = updateFile(session, uploadFile[i]);
            if (insertPath != null) {
                updatePathList.add(insertPath);
            }
        }
        return ResultEntity.getSuccessResult(updatePathList);
    }

    @RequestMapping(value = "/singleImageUpdate", method = RequestMethod.POST)
    @ResponseBody
    private ResultEntity updateImage(@RequestParam("uploadFile") MultipartFile uploadFile) {
        try {
            FileInputStream inputStream = (FileInputStream) uploadFile.getInputStream();
            Response response = qiniuUploadFileService.uploadFile(inputStream);
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println(putRet.key + "   " + response.bodyString());
            System.out.println(putRet.hash);
            return ResultEntity.getSuccessResult("http://" + cdn + "/" + putRet.key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResultEntity.getSuccessResult("上传失败");
    }

    private String updateFile(HttpSession session, MultipartFile file) {
        //获取要上传的目标文件夹绝对路径、webapp下
        String realPath = System.getProperty("xhsImages");
        //重新定义文件名、避免名称重复
        String fileName = "xhsImages/" + UUID.randomUUID().toString() + FileUtils.getFileSuffix(file.getOriginalFilename());
        String parentFilePath = new File(realPath).getParent();
        File currentFile = new File(parentFilePath + "/" + fileName);

        try {
            if (!currentFile.exists()) {
                currentFile.mkdirs();
            }
            if (!currentFile.exists()) {
                currentFile.createNewFile();
            }
            //上传文件至指定位置
            file.transferTo(currentFile);
            return fileName;
        } catch (IOException e) {
            System.out.println("错误日志" + e);
            e.printStackTrace();
            return null;
        }
    }
}
