package com.sparta.spring_auth;

import com.sparta.spring_auth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class BeanTest {

    @Autowired
    @Qualifier("pizza")
    Food food;

    @Test
    @DisplayName("Primary Qulifier")
    void test1(){
        food.eat();
    }

}
