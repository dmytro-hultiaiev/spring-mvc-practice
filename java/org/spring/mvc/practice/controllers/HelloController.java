package org.spring.mvc.practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-java")
    public String sayHelloJava(){
        return "hello-java";
    }
}
