package com.Lccc;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;

import java.util.List;

/**
 * @ClassName JedisTransaction
 * @Author: Lccc.
 * @Description: TODO
 * @DateTime: 2022/10/15$ 11:06$
 * @Version 1.0f
 */
public class JedisTransaction {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.117.128", 6380);
        System.out.println(jedis.ping());

        Transaction multi = jedis.multi();
        Response<String> set = multi.set("as", "as");
        System.out.println(set);
        Response<Long> listJedis = multi.lpush("listJedis", "01", "02", "03", "04", "05");
        System.out.println(listJedis);
        List<Object> exec = multi.exec();
        System.out.println(exec);
    }
}
