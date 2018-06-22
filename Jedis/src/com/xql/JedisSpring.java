package com.xql;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisSpring {

    private ApplicationContext applicationContext;
    @Before
    public void setup() throws Exception{
        String path = "classpath:ApplicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(path);
    }

    @Test
    public void JedisTest() throws Exception{
        JedisPool jedisPool = (JedisPool) applicationContext.getBean("jedisPool");
        Jedis jedis = jedisPool.getResource();
        jedis.set("key4","love");
        System.out.println(jedis.get("key4"));
    }

}
