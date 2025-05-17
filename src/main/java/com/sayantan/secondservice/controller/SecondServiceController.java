package com.sayantan.secondservice.controller;

import com.sayantan.secondservice.service.FirstServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondServiceController {
    @Autowired
    private FirstServiceClient firstServiceClient;
    @GetMapping("/caller")
    public String caller(){
        return firstServiceClient.getCalling();
    }
    @GetMapping("/calling")
    public String calling(){
        return "Hi I am Second Service";
    }
}
