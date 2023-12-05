package com.tidal.testprojects.thread;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.server.Cookie;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Description 线程测试
 * @Version 1.0.0
 * @Date 2023/11/27 17:48
 * @Created by 张宏杰
 */
@Slf4j
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                log.info(Thread.currentThread().getName()+":"+i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.wait(1000);

    }
}

