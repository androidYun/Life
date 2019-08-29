package com.gy.life.service;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import java.io.File;
import java.io.InputStream;

public interface IQiniuUploadFileService {
    Response uploadFile(File file) throws QiniuException;

    Response uploadFile(InputStream inputStream) throws QiniuException;

    Response delete(String key) throws QiniuException;

}
