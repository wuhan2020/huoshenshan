package com.wuhan2020.email_admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

@MapperScan("com.wuhan2020.email_admin.dao")
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
public class EmailAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailAdminApplication.class, args);
    }

}
