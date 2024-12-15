package com.example.hello_spring.boot.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringController {
    @GetMapping("/hello")
    String sayHello(){
        return "Hello spring boot, again!!";
    }
}
