package com.example.mimall.mi.util;
/**
 * @Author: kotori
 * @Date: 2020/10/19 17:09
 * @Description:
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;
import io.minio.MinioClient;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @ClassName MinioUtil
 * @Description TODO
 * @Author kotori
 */
@Slf4j
public class MinioUtil {

    private static MinioUtil minioUtil;

    private MinioClient minioClient;

    /**
     * 获取MinIO工具类实例
     *
     * @return 返回实例
     */
    public static MinioUtil getInstance() {
        if (null != minioUtil) {
            return minioUtil;
        }
        synchronized (MinioUtil.class) {
            if (null == minioUtil) {
                minioUtil = new MinioUtil();
            }
        }
        return minioUtil;
    }

    private MinioUtil() {
        init();
    }

    private void init() {
        String url = "http://182.92.208.18:9000/";
        String username = "admin";
        String password = "admin0704";
        String region = "project";
        try {
            minioClient = new MinioClient(url, username, password);
        } catch (Exception e) {
            log.error("restClient.close occur error", e);
        }

    }

    /**
     *  上传文件——通过流的方式进行上传
     *
     * @param file 待操作文件
     * @return 文件全地址
     */
    public String upLoadFile(MultipartFile file) {
        String url = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String ymd = sdf.format(new Date());
        String objectName = ymd + "/" + UUID.randomUUID().toString();
        try {
            minioClient.putObject("project", objectName, file.getInputStream(), file.getContentType());
            url = minioClient.getObjectUrl("project", objectName);
        } catch (Exception e) {
            log.error("restClient.close occur error", e);
        }
        return url;
    }
}