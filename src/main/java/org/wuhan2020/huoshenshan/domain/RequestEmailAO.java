package org.wuhan2020.huoshenshan.domain;


/**
 * @program: email_admin
 * @description:
 * @author: Nou
 * @create: 2020-02-23 21:49
 **/
public class RequestEmailAO {

    private String emailSendString;

    private String uid;

    private String userName;

    private String sendType;

    public String getEmailSendString() {
        return emailSendString;
    }

    public void setEmailSendString(String emailSendString) {
        this.emailSendString = emailSendString;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
    }
}
