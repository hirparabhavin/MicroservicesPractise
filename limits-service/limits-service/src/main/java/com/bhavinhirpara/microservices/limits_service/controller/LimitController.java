package com.bhavinhirpara.microservices.limits_service.controller;

import com.bhavinhirpara.microservices.limits_service.bean.Limits;
import com.bhavinhirpara.microservices.limits_service.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retriveLimits(){

        return new Limits(configuration.getMinimum(), configuration.getMaximum());

        //return new Limits(1,1000);
    }
}
