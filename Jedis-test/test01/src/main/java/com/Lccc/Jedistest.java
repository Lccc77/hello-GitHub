package com.Lccc;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @ClassName Jedistest
 * @Author: Lccc.
 * @Description: TODO
 * @DateTime: 2022/10/14$ 20:30$
 * @Version 1.0f
 */
public class Jedistest {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.117.128", 6380);
        String ping = jedis.ping();
        System.out.println(ping);

        Set<String> keys = jedis.keys("*");
        for(String key:keys) {
            System.out.println(key);
        }

            Boolean ret = jedis.exists("sadjkfksa");
            System.out.println(ret);

            Long k1 = jedis.move("k2", 1);
            System.out.println(k1);

            String set = jedis.set("kh", "kh");
            System.out.println(set);

        Long append = jedis.append("kh", "fdsa");
        System.out.println(append);


    }
}
