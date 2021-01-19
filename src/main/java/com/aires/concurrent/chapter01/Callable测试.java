package com.aires.concurrent.chapter01;


import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @desc:
 * @author: fan zhengxiang
 * @create: 2021/1/14 16:52
 */
@Slf4j(topic = "c.Callable测试")
public class Callable测试 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                log.info("running...");
                Thread.sleep(1000);
                return 11;
            }
        });


        Thread thread = new Thread(task, "t1");
        thread.start();


        Thread.sleep(2000);
        // 获取FutureTask任务的返回结果
        log.info("get result ....{}", task.get());
    }
}
