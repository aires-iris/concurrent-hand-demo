package com.aires.concurrent.chapter01;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @desc:
 * @author: fan zhengxiang
 * @create: 2021/1/14 17:36
 */
@Slf4j(topic = "c.线程被打断")
public class 线程被打断 {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                log.info("enter sleep....");
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                log.info("wake up....");
                e.printStackTrace();
            }
        }, "t1");

        t1.start();
        Thread.sleep(1500);
        log.info("interrupt....");
        t1.interrupt();
    }
}
