package com.luying.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-09
 **/
@RestController
public class BuyController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("buy")
    public String buyTicket(String name){
        String object = restTemplate.getForObject("http://PROVIDER/hello", String.class);
        return name+"购买了"+object;

    }
}
