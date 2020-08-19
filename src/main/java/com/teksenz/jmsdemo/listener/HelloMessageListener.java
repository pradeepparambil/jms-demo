package com.teksenz.jmsdemo.listener;

import com.teksenz.jmsdemo.config.JmsConfig;
import com.teksenz.jmsdemo.model.HelloWorldMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
@Slf4j
@Component
public class HelloMessageListener {
    //Detailed implementation
//    @JmsListener(destination = JmsConfig.MY_QUEUE)
//    public void listen(@Payload HelloWorldMessage helloWorldMessage,
//                       @Headers MessageHeaders headers, Message message){
//        System.out.println("I got a message !!!");
//        System.out.println(helloWorldMessage);
////        throw new RuntimeException("foo");
//    }


    //Simple implementation
    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listenHello(HelloWorldMessage helloWorldMessage){
        log.info("I got a message - " + helloWorldMessage);
    }

}
