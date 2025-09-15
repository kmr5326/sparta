package com.sparta.spring_auth.food;

import org.springframework.stereotype.Component;

@Component
public class Pizza implements Food {
    @Override
    public void eat() {
        System.out.println("피자를 먹습니다.");
    }
}