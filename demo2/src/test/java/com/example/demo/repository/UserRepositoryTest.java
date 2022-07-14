package com.example.demo.repository;

import com.example.demo.DemoApplication;
import com.example.demo.DemoApplication;
import com.example.demo.DemoApplicationTests;
import com.example.demo.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends DemoApplicationTests {

    //Depedency injection(DI)_
    @Autowired
    private UserRepository userRepositorys;

    @Test
    public void create(){
        User user =new User();
        user.setAccount("Testuser");
        user.setEmail("Testuser@gmail.com");
        user.setPhoneNumber("010-1111-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin");

        User newUser = userRepositorys.save(user);
        System.out.println("number:"+newUser);
    }
    public void read(){

    }
    public void update(){

    }

    public void delete(){

    }

}

