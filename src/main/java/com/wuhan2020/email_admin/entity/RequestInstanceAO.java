package com.wuhan2020.email_admin.entity;

import lombok.Data;

/**
 * @program: email_admin
 * @description:
 * @author: Nou
 * @create: 2020-01-15 17:28
 **/

@Data
public class RequestInstanceAO {

    private Integer questionId;

    private String questionContent;

    private String questionSelectContent;

    private String status;

}
