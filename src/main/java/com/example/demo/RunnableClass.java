package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RunnableClass implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(RunnableClass.class);

    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName());
    }
}
