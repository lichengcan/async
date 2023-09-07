package com.example.async.controller;

import com.example.async.service.TestAsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Thread.sleep;

/**
 * @author: lichengcan
 * @date: 2023-09-05 15:59
 * @description
 **/
@RestController
@RequestMapping("/async")
public class TestAsyncController {

    @Autowired
    TestAsyncService testAsync2;


    @GetMapping("/test")
    public Object test() throws InterruptedException {
        testAsync2.test1();
        test1();
        return "123";
    }

    @Async
    public void test1() throws InterruptedException {
        sleep(3000);
        System.out.println("奔雷1");
    }

}
