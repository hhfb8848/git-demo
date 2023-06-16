package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sjh
 * @version 1.0
 * @date 2023/6/16 8:37
 * @description: TODO
 */
@RestController
@RequestMapping("/demo")
public class DemoController {


    @GetMapping("/1")
    public String getDemo(){
        return "demo";
    }

    @GetMapping("/2")
    public String getDemo2(){
        return "demo2";
    }
}
