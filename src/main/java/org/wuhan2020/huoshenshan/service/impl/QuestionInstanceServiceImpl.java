package org.wuhan2020.huoshenshan.service.impl;

import org.wuhan2020.huoshenshan.dao.QuestionInstanceMapper;
import org.wuhan2020.huoshenshan.entity.QuestionInstance;
import org.springframework.stereotype.Service;
import org.wuhan2020.huoshenshan.service.QuestionInstanceService;

import javax.annotation.Resource;

/**
 * @program: email_admin
 * @description:
 * @author: Nou
 * @create: 2020-01-14 17:54
 **/
@Service
public class QuestionInstanceServiceImpl implements QuestionInstanceService {
    @Resource
    private QuestionInstanceMapper questionInstanceMapper;
    @Override
    public QuestionInstance getQuestionInstance(QuestionInstance questionInstance) {
        return questionInstanceMapper.getQuestionInstance(questionInstance);
    }

    @Override
    public int updateQuestionInstance(QuestionInstance questionInstance) {
        return questionInstanceMapper.updateQuestionInstance(questionInstance);
    }

    @Override
    public int deleteQuestionInstance(QuestionInstance questionInstance) {
        return questionInstanceMapper.deleteQuestionInstance(questionInstance);
    }

    @Override
    public int addQuestionInstance(QuestionInstance questionInstance) {
        return questionInstanceMapper.insertSelective(questionInstance);
    }
}
