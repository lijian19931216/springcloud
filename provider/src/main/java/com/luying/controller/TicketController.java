package com.luying.controller;

import com.luying.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-09
 **/
@RestController
public class TicketController {
    @Autowired
    TicketService service;
    @RequestMapping("hello")
    public String getTicket(){
        return  service.getTicket();
    }
}
