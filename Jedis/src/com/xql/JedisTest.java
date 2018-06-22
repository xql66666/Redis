package com.xql;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisTest {

    @Test
    public void testJedis1() throws Exception{
        //创建和redis的连接
        Jedis jedis = new Jedis("120.79.247.154",6379);
        //存入
        jedis.set("key2","2");
        //取出
        System.out.println(jedis.get("key2"));
        //关闭
        //啦啦阿拉啊啊啊
        //分支提交
        jedis.close();
    }


    @Test
    public void testJedis2() throws Exception{
        JedisPool pool = new JedisPool("120.79.247.154",6379);
        Jedis jedis = pool.getResource();
        jedis.set("key3","aaaaa");
        System.out.println(jedis.get("key3"));
        jedis.close();
    }
}
