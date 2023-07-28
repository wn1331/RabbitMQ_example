package com.example.rabbitmq_example.infrastructure.rabbitMQ;

import com.example.rabbitmq_example.domain.example.Exobject;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleMessageProducer {

    //생성자 주입
    private final RabbitTemplate rabbitTemplate;


    public void publishObject(Exobject obj){
        //토픽발송
        rabbitTemplate.convertAndSend("example.topic","example.exkey.#", obj);
        System.out.println("객체 obj가 RabbitMQ로 발행됨 : " + obj);
    }
}
