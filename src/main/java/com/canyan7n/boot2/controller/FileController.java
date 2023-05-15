package com.canyan7n.boot2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :FileController
 * @date ：2023/5/15 12:39
 * @description：TODO
 */
@Controller
@Slf4j
public class FileController {

    @PostMapping("/upload")
    public String fileUpload(@RequestPart("headerImg") MultipartFile headerImg,
                             @RequestPart("photos") MultipartFile[] photos) throws IOException {
        log.info("头像大小{},生活照数{}",headerImg.getSize(),photos.length);
        if (!headerImg.isEmpty()){
            String filename = headerImg.getOriginalFilename();
            UUID preName = UUID.randomUUID();
            String postName = filename.substring(filename.lastIndexOf("."));
            filename = preName + postName;
            headerImg.transferTo(new File("E:\\springboot\\" + filename));
        }

        if (photos.length > 0){
            for (MultipartFile photo : photos) {
                if (!photo.isEmpty()){
                    String filename = photo.getOriginalFilename();
                    UUID preName = UUID.randomUUID();
                    String postName = filename.substring(filename.lastIndexOf("."));
                    filename = preName + postName;
                    photo.transferTo(new File("E:\\springboot\\" + filename));
                }
            }
        }
        return "main";
    }
}
