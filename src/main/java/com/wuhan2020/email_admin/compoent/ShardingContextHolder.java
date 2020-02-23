package com.wuhan2020.email_admin.compoent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: email_admin
 * @description:
 * @author: Nou
 * @create: 2020-01-15 11:32
 **/
public class ShardingContextHolder {
    private static final Logger LOG = LoggerFactory.getLogger(ShardingContextHolder.class);
    private static final ThreadLocal<String> contextHolder = new ThreadLocal();

    public ShardingContextHolder() {
    }

    public static String getShardingKey() {
        return (String)contextHolder.get();
    }

    public static void setShardingkey(String shardingkey) {
        contextHolder.set(shardingkey);
    }
}
