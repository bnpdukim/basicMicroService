package com.bnpinnovation.hello.controller;

import com.bnpinnovation.hello.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {
    @Autowired
    MessageService messageService;
    @GetMapping
    public String hello() {
        return "hello" + messageService.message();
    }
}
