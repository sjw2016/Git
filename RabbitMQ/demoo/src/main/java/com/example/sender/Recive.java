package com.example.sender;

import lombok.extern.java.Log;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
@Log
public class Recive {

    /**
     * 监听
     * @param s
     */
    //队列名字
    @RabbitListener(queues = "queue")
    public void jiji(String s){
        log.info(s);
    }
}
