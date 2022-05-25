package com.kingland.neusoft.course.controller;

import org.springframework.boot.system.ApplicationHome;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import com.kingland.neusoft.course.util.tools;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

@RestController
public class PluginsController {

    @PostMapping("/upload")//浏览器输入地址
    @ResponseBody
    public Map<String, Object> upload(HttpServletRequest request){
        MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multiRequest.getFile("file");
        ApplicationHome applicationHome = new ApplicationHome(this.getClass());
        String fileSavePath = applicationHome.getDir().getParentFile().getParentFile().getParentFile().getParentFile().getAbsolutePath() + "\\src\\main\\resources\\static\\img";
        if(file == null){
            return tools.responseJson(false, null, "文件为空");
        }
        if (file.isEmpty()) {
            return tools.responseJson(false, null, "文件为空");
        }
        // 给文件重命名
        String fileName = UUID.randomUUID() + "." + Objects.requireNonNull(file.getContentType())
                .substring(file.getContentType().lastIndexOf("/") + 1);
        try {
            File files = new File(fileSavePath, fileName);
            File parentFile = files.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdir();
            }
            file.transferTo(files);
        } catch (IOException e) {
            return tools.responseJson(false, null, e.getMessage());
        }
        return tools.responseJson(true, null, fileName);
    }
}
