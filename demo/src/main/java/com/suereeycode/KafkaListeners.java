package com.suereeycode;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    //have a listener to listen to the topics
    @KafkaListener(topics = "suereeycode", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received: " + data + "!!!");
    }
}
