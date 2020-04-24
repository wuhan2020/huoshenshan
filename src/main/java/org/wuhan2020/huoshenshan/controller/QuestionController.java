package org.wuhan2020.huoshenshan.controller;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import org.wuhan2020.huoshenshan.aop.RequestLog;
import org.wuhan2020.huoshenshan.entity.QuestionModel;
import org.wuhan2020.huoshenshan.entity.QuestionModelVo;
import org.wuhan2020.huoshenshan.entity.RequestAO;
import org.wuhan2020.huoshenshan.service.QuestionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @program: email_admin
 * @description: 问题模版api
 * @author: Nou
 * @create: 2020-01-14 16:09
 **/
@Controller
@RequestMapping(value = "/question")
@CrossOrigin
public class QuestionController {

    @Resource
    private QuestionService questionService;

    private static final Logger LOG = LoggerFactory.getLogger(QuestionController.class);

    @ResponseBody
    @PostMapping("/get_question")
    @RequestLog
    public String getQuestion(RequestAO requestAO){
        String logId = UUID.randomUUID().toString();

        if (requestAO.getGroupId() == null || requestAO.getQuestionId() == null) {
            LOG.info("request some params invalid logId = {}", logId);
            return new JSONObject().toString();
        }
        QuestionModel questionModel = new QuestionModel(Integer.valueOf(requestAO.getGroupId()), Integer.valueOf(requestAO.getQuestionId()));
        questionModel = questionService.getQuestionModel(questionModel);

        QuestionModelVo vo = new QuestionModelVo();
        BeanUtils.copyProperties(questionModel, vo);

        LOG.info("get questionModel from db questionModel = {} logId = {}", vo, logId);
        JSONObject jsonObject =  new JSONObject();

        try {
            JSONObject data = new JSONObject();
            data.put("questionModel", vo);
            jsonObject.put("code", 0);
            jsonObject.put("err", "");
            jsonObject.put("data", data);
        } catch ( JSONException e ) {
            LOG.error("jsonObject exception error logId = {}", logId, e);
        }
        return jsonObject.toString();
    }

    @ResponseBody
    @PostMapping("/get_question_group")
    @RequestLog
    public String getQuestionGroup(RequestAO requestAO){
        String logId = UUID.randomUUID().toString();

        if (requestAO.getGroupId() == null) {
            LOG.info("request some params invalid logId = {}", logId);
            return new JSONObject().toString();
        }
        QuestionModel questionModel = new QuestionModel(Integer.valueOf(requestAO.getGroupId()), Integer.valueOf(requestAO.getQuestionId()));
        List<QuestionModel> modelList = questionService.getQuestionModelList(questionModel);


        LOG.info("get questionModelList from db questionModel = {} logId = {}", modelList, logId);
        JSONObject jsonObject =  new JSONObject();

        try {
            JSONObject data = new JSONObject();
            data.put("questionModelList", modelList);
            jsonObject.put("code", 0);
            jsonObject.put("err", "");
            jsonObject.put("data", data);
        } catch ( JSONException e ) {
            LOG.error("jsonObject exception error logId = {}", logId, e);
        }
        return jsonObject.toString();
    }

    @ResponseBody
    @PostMapping("/add_question")
    @RequestLog
    public String addQuestion(RequestAO requestAO){
        String logId = UUID.randomUUID().toString();

        if (requestAO.getGroupId() == null || requestAO.getQuestionId() == null) {
            LOG.info("request some params invalid logId = {}", logId);
            return new JSONObject().toString();
        }
        QuestionModel questionModel = new QuestionModel(Integer.valueOf(requestAO.getGroupId()), Integer.valueOf(requestAO.getQuestionId()));

        //TODO 增加 QuestionModel 其他属性
        int result = questionService.addQuestionModel(questionModel);
        JSONObject data = new JSONObject();
        if(result > 1 ){
            LOG.info("add QuestionModel success logId = {}", logId);
            data.put("code", 0);
            data.put("err", "");
            data.put("data", "success");
        }else {
            data.put("code", -1);
            data.put("err", "");
            data.put("data", "fail");
        }
        return data.toString();
    }




}
