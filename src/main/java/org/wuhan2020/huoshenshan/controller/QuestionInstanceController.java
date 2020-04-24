package org.wuhan2020.huoshenshan.controller;

import com.alibaba.fastjson.JSONObject;
import org.wuhan2020.huoshenshan.aop.RequestLog;
import org.wuhan2020.huoshenshan.entity.QuestionInstance;
import org.wuhan2020.huoshenshan.entity.RequestInstanceAO;
import org.wuhan2020.huoshenshan.service.QuestionInstanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @program: email_admin
 * @description: 问题实例
 * @author: Nou
 * @create: 2020-01-15 17:20
 **/

@RestController
@RequestMapping("/question")
@CrossOrigin
public class QuestionInstanceController {

    private static final Logger LOG = LoggerFactory.getLogger(QuestionInstanceController.class);

    @Resource
    private QuestionInstanceService questionInstanceService;


    @ResponseBody
    @PostMapping("/insert_question_instance")
    @RequestLog
    public String insertQuestionInstance(RequestInstanceAO requestInstanceAO){
        String logId = UUID.randomUUID().toString();

        if (requestInstanceAO.getQuestionId() == null || StringUtils.isEmpty(requestInstanceAO.getQuestionSelectContent()) || StringUtils.isEmpty(requestInstanceAO.getQuestionContent())) {
            LOG.info("request some params invalid logId = {}", logId);
            return new JSONObject().toString();
        }
        QuestionInstance questionInstance = new QuestionInstance(requestInstanceAO.getQuestionId(), requestInstanceAO.getQuestionContent(), requestInstanceAO.getQuestionSelectContent());
        int success = questionInstanceService.addQuestionInstance(questionInstance);

        JSONObject jsonObject =  new JSONObject();

        if(success > 0){
            LOG.info("insert questionInstance success logId = {}", logId);
            jsonObject.put("code", 0);
            jsonObject.put("message", "success");
            return jsonObject.toString();
        }else {
            LOG.error("insert questionInstance error logId = {}", logId);
            jsonObject.put("code", -1);
            jsonObject.put("message", "error");
            return jsonObject.toString();
        }
    }

}
