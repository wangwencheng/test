package com.ztjy.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}