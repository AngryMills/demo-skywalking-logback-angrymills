package com.maggie.demos.demoskywalkinglogfile.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value = "test")
    public String test4Log(){
        logger.info("this is a test for logback fileappender");
        return "success";
    }
}
