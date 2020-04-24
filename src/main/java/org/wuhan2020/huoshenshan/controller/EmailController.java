package org.wuhan2020.huoshenshan.controller;


import com.alibaba.fastjson.JSONObject;
import org.wuhan2020.huoshenshan.aop.RequestLog;
import org.wuhan2020.huoshenshan.entity.RequestEmailAO;
import org.wuhan2020.huoshenshan.utils.EmailUtil;
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
public class EmailController {

    private static final Logger LOG = LoggerFactory.getLogger(QuestionController.class);

    @ResponseBody
    @PostMapping("/check")
    @RequestLog
    public String emailCheck(RequestEmailAO requestEmailAO){
        String logId = UUID.randomUUID().toString();
        JSONObject jsonObject =  new JSONObject();
        if(EmailUtil.isEmail(requestEmailAO.getEmailSendString())){
            LOG.info("a");
            jsonObject.put("code", 0);
            jsonObject.put("err", "");
            jsonObject.put("data", "true");
            return jsonObject.toString();
        }else {
            jsonObject.put("code", 0);
            jsonObject.put("err", "");
            jsonObject.put("data", "true");
            return jsonObject.toString();
        }
    }


    @ResponseBody
    @PostMapping("/send")
    @RequestLog
    public String emailSend(RequestEmailAO requestEmailAO){
        String logId = UUID.randomUUID().toString();
        JSONObject jsonObject =  new JSONObject();

        //TODO 常量需要配置
        String myEmailSMTPHost = "";
        String myEmailAccount = "";
        String myEmailPassword = "";
        String sendTitle = "";
        String text = "";
        String sendType = "";
        String photoSrc = "";
        String receiveEmail = "";

        try {
            EmailUtil.sendEmail(myEmailSMTPHost, myEmailAccount, myEmailPassword, sendTitle, text, sendType, photoSrc, receiveEmail);
        } catch ( Exception e ) {
            LOG.error("send exception error logId = {}", logId, e);
            jsonObject.put("code", -1);
            jsonObject.put("err", e + "");
            jsonObject.put("data", "false");
            return jsonObject.toString();
        }
        LOG.info("send success userName = {}, logId = {}", requestEmailAO.getUserName(), logId);
        jsonObject.put("code", 0);
        jsonObject.put("err", "");
        jsonObject.put("data", "success");
        return jsonObject.toString();

    }
}
