package com.raincoat.springmvc.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class HelloWorld {

    @RequestMapping("/helloworld")
    public String hello() {
        System.out.println("hello world");
        return "success";
    }
}
