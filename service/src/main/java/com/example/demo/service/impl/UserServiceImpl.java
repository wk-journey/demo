package com.example.demo.service.impl;

import com.example.demo.persist.entity.user.UserEntity;
import com.example.demo.persist.mapper.user.UserMapper;
import com.example.demo.utils.redis.service.RedisService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.concurrent.*;


/**
 * Created by wangkai on 2018/9/8.
 */
@Service
public class UserServiceImpl implements UserService {
    private static final ExecutorService executorService = Executors.newFixedThreadPool(10);
    private static final BlockingQueue<Future<String>> queue = new LinkedBlockingDeque<Future<String>>
            (10);
    // 实例化CompletionService
    private static final CompletionService<String> completionService = new ExecutorCompletionService<String>
            (executorService, queue);

    @Autowired
    private UserMapper userMapper;

    @Resource
    @Qualifier(value = "redisService")
    private RedisService redisService;

    @Override
    public UserEntity getUserInfoById(Integer userId) {
//        System.out.println("===== test =====");
//        // 提交10个任务
//        for (int i = 0; i < 10; i++) {
//            final int j = i;
//            executorService.submit(new Callable<String>() {
//                public String call() {
//                    try {
//                        int sleepTime = new Random().nextInt(1);
//                        Thread.sleep(sleepTime);
//                        return "线程" + j + "睡了" + sleepTime + "秒";
//                    } catch (InterruptedException e) {
//                        e.getStackTrace();
//                        return "";
//                    } finally {
//                        return "";
//                    }
//                }
//            });
//        }
//
//        try {
//            // 输出结果
//            for (int i = 0; i < 10; i++) {
//                // 获取包含返回结果的future对象（若整个阻塞队列中还没有一条线程返回结果，那么调用take将会被阻塞，当然你可以调用poll，不会被阻塞，若没有结果会返回null，poll和take返回正确的结果后会将该结果从队列中删除）
//                Future<String> future = completionService.take();
//                // 从future中取出执行结果，这里存储的future已经拥有执行结果，get不会被阻塞
//                String result = future.get();
//                System.out.println(result);
//            }
//        } catch (Exception e) {
//            e.getStackTrace();
//        }

        Assert.notNull(userId, "Required param is null!");
//        redisService.set("aaa", "ml");
        String aaa = redisService.get("aaa");
        System.out.println(aaa);
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public void updateUserInfoAsy(UserEntity entity) {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        completableFuture.supplyAsync(() -> this.updateUserInfoByPrimary(entity))
                .thenAccept(id -> this.addCount4Update(id));
    }

    private int updateUserInfoByPrimary(UserEntity entity) {
        return userMapper.updateByPrimaryKey(entity);
    }

    private void addCount4Update(int id) {
        redisService.increment("user:" + id + ":count");
    }
}
