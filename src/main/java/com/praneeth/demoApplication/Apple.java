package com.praneeth.demoApplication;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

public class Apple {
    void EatApple() {
        System.out.println("Eating Apple");
    }

    @PostConstruct
    void callThisBeforeAppleIsused() {
        System.out.println("callThisBeforeAppleisUsed");
    }
    @PreDestroy
    void callThisAfterAppleisUsed() {
        System.out.println("callThisAfterAppleisUsed");
    }
}
