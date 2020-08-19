package com.teksenz.jmsdemo.sender;

import com.teksenz.jmsdemo.config.JmsConfig;
import com.teksenz.jmsdemo.model.OrderMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.UUID;

//@Component
@RequiredArgsConstructor
public class OrderSender {
    private final JmsTemplate jmsTemplate;

    @Scheduled(fixedRate = 4000)
    public void placeOrder(){
        OrderMessage orderMessage = OrderMessage.builder()
                .id(UUID.randomUUID())
                .product("iPhone11 Pro")
                .build();
        System.out.println("Order placed -> "+orderMessage);
        jmsTemplate.convertAndSend(JmsConfig.ORDERS_QUEUE,orderMessage);
    }

}
