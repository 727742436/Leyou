package com.leyou.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class LeyouUserServiceApplicationTests {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    public void testRedis(){
        //存储数据
        this.redisTemplate.opsForValue().set("key1","value1");
        //获取数据
        String val = this.redisTemplate.opsForValue().get("key1");
        System.out.println("value="+val);

    }

}
