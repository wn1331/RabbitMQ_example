package com.example.rabbitmq_example.infrastructure.rabbitMQ;

import com.example.rabbitmq_example.domain.Exobject;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;



@Component
public class ExampleMessageConsumer {

    @RabbitListener(queues = "example.queue")
    public void receiveMessage(Exobject obj){
        System.out.println("RabbitMQ Consumer(Listener)가 받은 객체 : "+obj);
    }
}
