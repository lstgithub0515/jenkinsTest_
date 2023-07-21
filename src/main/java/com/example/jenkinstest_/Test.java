package com.example.jenkinstest_;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lst
 * @Date: 2023/7/21
 * @Description: TODO
 **/
@RestController
public class Test {

    @GetMapping
    public String get() {
        return "Hello Jenkins!";
    }
}
