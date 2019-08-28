package com.gy.life.controller;

import com.gy.life.common.ResultEntity;
import com.gy.life.utils.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "/file")
public class FileController {


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
