package cn.coolwang.springboot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一个应用程序
 * @author 邓军
 * @email dengjun@coolwang
 * @since V1.0 2023/7/10 23:22
 */

@RestController
@SpringBootApplication
public class MyApplication {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
