package com.example.demo.utils.redis;

import com.example.demo.utils.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Created by wangkai on 2018/9/26.
 */
@Component("redisUtils")
public class RedisUtils {
    @Resource
    @Qualifier(value = "redisService")
    private RedisService redisService;

    /**
     * 原子计数器限流
     * @param limitSeconds
     * @param requireAmounts
     */
    public void limitFlow(int limitSeconds, int requireAmounts) {
        String LIMIT_KEY = "t:limit";
        Integer amount = redisService.get(LIMIT_KEY);
        // 限流key尚且不存在
        if (Objects.isNull(amount)) {
            redisService.getAndSet(LIMIT_KEY, 1);
            redisService.expire(LIMIT_KEY, limitSeconds, TimeUnit.SECONDS);
            System.out.println("====== 头彩 ======");
            return;
        }
        // 限流key已存在，但超限了
        if (amount > requireAmounts) {
            System.out.println("====== 超限 ======");
            return;
        }

        // 限流key已存在，但没有超限
        redisService.increment(LIMIT_KEY);
        Long expire = redisService.getExpire(LIMIT_KEY);
        if (expire.longValue() == -1l) {
            redisService.expire(LIMIT_KEY, limitSeconds, TimeUnit.SECONDS);
            System.out.println("====== ttl:-1 -> " + limitSeconds + " ======");
        }
        System.out.println("====== ok ======");
    }
}
