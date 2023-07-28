package com.example.rabbitmq_example.api.controller;

import com.example.rabbitmq_example.domain.example.Exobject;
import com.example.rabbitmq_example.infrastructure.rabbitMQ.ExampleMessageProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController @RequiredArgsConstructor
public class ExampleController {

    private final ExampleMessageProducer emp;

    @GetMapping("/send")
    public String send(){
        Exobject object1 = new Exobject("객체이름1","객체내용1", new Date());
        emp.publishObject(object1);
        return "발송 성공!";
    }
}
