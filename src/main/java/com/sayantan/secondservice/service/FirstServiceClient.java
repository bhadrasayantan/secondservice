package com.sayantan.secondservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="${firstServiceSVCNAME}/firstservice")
public interface FirstServiceClient {
    @GetMapping("/first/calling")
    public String getCalling();
}
