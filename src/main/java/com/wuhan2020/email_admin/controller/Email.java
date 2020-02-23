package com.wuhan2020.email_admin.controller;


import com.wuhan2020.email_admin.aop.RequestLog;
import com.wuhan2020.email_admin.entity.RequestEmailAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.UUID;

/**
 * @program: email_admin
 * @description:
 * @author: Nou
 * @create: 2020-02-23 21:45
 **/
@Controller
@RequestMapping(value = "/email")
@CrossOrigin
public class Email {

    private static final Logger LOG = LoggerFactory.getLogger(QuestionController.class);

    @ResponseBody
    @PostMapping("/check")
    @RequestLog
    public String emailCheck(RequestEmailAO requestEmailAO){
        String logId = UUID.randomUUID().toString();


        return null;
         
    }
}
