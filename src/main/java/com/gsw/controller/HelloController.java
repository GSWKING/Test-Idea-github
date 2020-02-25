package com.gsw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/info")
    public String info(){
        return "Hello SpringBoot Info";
    }
}
