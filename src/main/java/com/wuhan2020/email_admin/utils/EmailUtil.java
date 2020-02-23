package com.wuhan2020.email_admin.utils;

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

}
