package com.sparta.spring_auth.food;

import org.springframework.stereotype.Component;

@Component
public class Chicken implements Food {
    @Override
    public void eat() {
        System.out.println("치킨을 먹습니다.");
    }
}