package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wangkai on 2018/9/19.
 */
public class TestUtils {

    public static void main(String[] args) {
        TestUtils testUtils = new TestUtils();
        // 1. wait for get
        System.out.println("============ test1 start ============");
        try {
            testUtils.test1();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("============= test1 end =============");

        // 2. complete by exception
        System.out.println("============ test2 start ============");
        try {
            testUtils.test2();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("============= test2 end =============");

        Long start = System.currentTimeMillis();
        // 结果集
        List<String> list = new ArrayList<>();
        ExecutorService executors = Executors.newFixedThreadPool(10);

        List<Integer> taskList = Arrays.asList(2, 1, 3, 4, 5, 6, 7, 8, 9, 10);

        CompletableFuture[] cpf = taskList.stream()
                .map(integer -> CompletableFuture.supplyAsync(() -> calc(integer), executors)
                .thenApply(h -> Integer.toString(h))
                .whenComplete((s, e) -> {
                    System.out.println("任务"+s+"完成!result="+s+"，异常 e="+e+","+new Date());
                    list.add(s);
                }))
                .toArray(CompletableFuture[]::new);

        CompletableFuture.allOf(cpf).join();
        System.out.println("list="+list+",耗时="+(System.currentTimeMillis()-start));
    }

    private static Integer calc(Integer i) {
        try {
            if (i == 1) {
                Thread.sleep(3000);
            } else if (i == 5) {
                Thread.sleep(5000);
            } else {
                Thread.sleep(1000);
            }
            System.out.println("task线程：" + Thread.currentThread().getName()
            + "任务i=" + i + "，完成！" + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i;
    }

    /**
     * CompletableFuture 单个任务正常执行
     * @throws ExecutionException
     * @throws InterruptedException
     */
    private void test1() throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        new Thread(() -> {
            System.out.println("task starting...");
            try {
                Thread.sleep(3000);
//                // if exception, Daemon thread waiting
//                int i = 1 / 0;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            completableFuture.complete("ok!");
        }).start();

        String result = completableFuture.get();
        System.out.println(result);
    }

    /**
     * CompletableFuture 单个任务异常捕获
     * @throws ExecutionException
     * @throws InterruptedException
     */
    private void test2() throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        new Thread(() -> {
            System.out.println("exception task starting...");
            try {
                Thread.sleep(3000);
                int i = 1 / 0;
            } catch (Exception e) {
                e.printStackTrace();
                completableFuture.completeExceptionally(e);
            }
            completableFuture.complete("ok!");
//            System.out.println(completableFuture.isCompletedExceptionally());
//            System.out.println(completableFuture.isDone());
        }).start();

        String result = completableFuture.get();
        System.out.println(result);
    }


}
