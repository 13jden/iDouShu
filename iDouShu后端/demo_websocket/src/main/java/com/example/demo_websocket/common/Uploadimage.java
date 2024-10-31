package com.example.demo_websocket.common;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

public class Uploadimage {
    public static final String ALI_YUN="https://yuebaimage.oss-rg-china-mainland.aliyuncs.com/";


    public static String uploadImage(MultipartFile file) throws IOException {
        String oldname = file.getOriginalFilename();
        String ext ="." + oldname.split("\\.")[1];
        String uuid = UUID.randomUUID().toString().replace("-","");
        String fileName = uuid + ext;
        //地域节点
        String endpoint="http://oss-rg-china-mainland.aliyuncs.com";

        String accesskeyId =Your_Id;
        String accesskeySecret =Your_Secret;

        OSS ossClient = new OSSClientBuilder().build(endpoint,accesskeyId,accesskeySecret);
        ossClient.putObject(
                "yuebaimage",
                fileName,
                file.getInputStream()
        );
        ossClient.shutdown();
        return ALI_YUN+fileName;

    }

}
