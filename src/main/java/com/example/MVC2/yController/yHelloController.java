package com.example.MVC2.yController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class yHelloController {
	@RequestMapping("/hello")
    public String message() {
        return "Hello, World!";
    }
}