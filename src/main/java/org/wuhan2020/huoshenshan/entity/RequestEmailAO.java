package org.wuhan2020.huoshenshan.entity;

import lombok.Data;

/**
 * @program: email_admin
 * @description:
 * @author: Nou
 * @create: 2020-02-23 21:49
 **/
@Data
public class RequestEmailAO {

    private String emailSendString;

    private String uid;

    private String userName;

    private String sendType;

}
