package com.aires.concurrent.chapter01;

import lombok.extern.slf4j.Slf4j;

/**
 * @desc:
 * @author: fan zhengxiang
 * @create: 2020-01-19 22:36
 */
@Slf4j(topic = "栈与栈帧查看")
public class 栈与栈帧查看 {
    public static void main(String[] args) {
        method1(10);
    }

    private static void method1(int x) {
        int y = x + 1;
        Object m = method2();
        System.out.println(m);
    }

    private static Object method2() {
        return new Object();
    }
}
