package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author YunXueJian
 * @Date 2022/11/21 20:52
 * @email yunxuejian@htdf.cc
 * @Version 1.0
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        //return restTemplate.getForEntity("http://provider-service/echo/" + str, String.class).getBody();
        return restTemplate.getForObject("http://provider-service/echo/" + str, String.class);
    }
}
