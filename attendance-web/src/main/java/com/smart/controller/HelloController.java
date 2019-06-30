package com.smart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * class
 *
 * @author wsh
 * @date 2019-06-30 23:50
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {


    @RequestMapping(value = "/world")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}