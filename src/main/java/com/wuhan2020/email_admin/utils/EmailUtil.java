package com.wuhan2020.email_admin.utils;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Date;
import java.util.Properties;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: email_admin
 * @description: 邮箱正则验证
 * @author: Nou
 * @create: 2020-02-23 21:53
 **/
public class EmailUtil {

    public static boolean isEmail(String email){
        if (null==email || "".equals(email)){
            return false;
        }
        String regEx1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern p = Pattern.compile(regEx1);
        Matcher m = p.matcher(email);
        if(m.matches()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String msg = "1dasd23424@qq.com";
        System.out.println(isEmail(msg));
    }

    public static void sendEmail(String myEmailSMTPHost, String myEmailAccount, String myEmailPassword, String sendTitle, String text, String sendType, String photosrc, String receiveEmail) throws Exception {
        Properties props = new Properties();
        props.setProperty("mail.transport.protocol", "smtp");
        props.setProperty("mail.smtp.host", myEmailSMTPHost);
        props.setProperty("mail.smtp.auth", "true");
        final String smtpPort = "994";
        props.setProperty("mail.smtp.port", smtpPort);
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.socketFactory.port", smtpPort);
        Session session = Session.getDefaultInstance(props);
        // 设置为debug模式, 可以查看详细的发送 log
        session.setDebug(true);
        MimeMessage message = null;

        if("img".equals(sendType)){
             message = createImageMail(session, myEmailAccount, receiveEmail, sendTitle, text, photosrc);
        }
        if("text".equals(sendType)){
            message = createMimeMessage(session, myEmailAccount, receiveEmail,text);
        }
        Transport transport = session.getTransport();
        transport.connect(myEmailAccount, myEmailPassword);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }

    public static MimeMessage createMimeMessage(Session session, String sendMail, String receiveMail, String text) throws Exception {
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(sendMail, "*****", "UTF-8"));
        message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail,"", "UTF-8"));
        message.setSubject("邮箱验证", "UTF-8");
        message.setContent(text, "text/html;charset=UTF-8");
        message.setSentDate(new Date());
        message.saveChanges();
        return message;
    }

    /**
     * @Method: createImageMail
     * @Description: 生成一封邮件正文带图片的邮件
     * @param session
     * @return
     * @throws Exception
     */
    public static MimeMessage createImageMail(Session session, String mailFrom, String mailTo, String mailTittle, String mailText, String photoSrc) throws Exception {
        // 创建邮件
        MimeMessage message = new MimeMessage(session);
        // 设置邮件的基本信息

        message.setFrom(new InternetAddress(mailFrom)); // 发件人

        message.setRecipient(Message.RecipientType.TO, new InternetAddress(mailTo)); // 收件人
        // 邮件标题
        message.setSubject(mailTittle);

        // 准备邮件数据
        // 准备邮件正文数据
        MimeBodyPart text = new MimeBodyPart();
        text.setContent(mailText + "<img src='cid:wuhanjiayou2020.jpg'>", "text/html;charset=UTF-8");// 需要修改
        // 准备图片数据
        MimeBodyPart image = new MimeBodyPart();
        DataHandler dh = new DataHandler(new FileDataSource(photoSrc));// 需要修改
        image.setDataHandler(dh);
        image.setContentID(UUID.randomUUID().toString() +".jpg");// 需要修改
        // 描述数据关系
        MimeMultipart mm = new MimeMultipart();
        mm.addBodyPart(text);
        mm.addBodyPart(image);
        mm.setSubType("related");

        message.setContent(mm);
        message.saveChanges();
        // 将创建好的邮件写入到F盘以文件的形式进行保存
//        message.writeTo(new FileOutputStream("F:/Program Files/TestMail/ImageMail.eml"));// 需要修改
        // 返回创建好的邮件
        return message;
    }


}
