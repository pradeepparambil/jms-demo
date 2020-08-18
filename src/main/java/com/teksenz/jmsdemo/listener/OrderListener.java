package com.teksenz.jmsdemo.listener;

import com.teksenz.jmsdemo.config.JmsConfig;
import com.teksenz.jmsdemo.model.OrderMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
public class OrderListener {

    @JmsListener(destination = JmsConfig.ORDERS_QUEUE)
    public void listenOrder(@Payload OrderMessage orderMessage,
                            @Headers MessageHeaders headers,
                            Message message){
        System.out.println("Received an order -> "+ orderMessage);
    }
}
