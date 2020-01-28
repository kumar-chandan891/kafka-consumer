package com.coder.kafka.listener;

import com.coder.kafka.document.UserDetails;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListenerService {

    @KafkaListener(topics="code_test", groupId = "group_id")
    public void consume(UserDetails userDetails) throws InterruptedException {
        System.out.println(userDetails.toString());
        Thread.sleep(2000);
    }
}
