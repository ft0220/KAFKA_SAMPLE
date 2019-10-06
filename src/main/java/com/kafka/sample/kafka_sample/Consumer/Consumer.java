package com.kafka.sample.kafka_sample.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer{

     //log出力用
     private static final Logger LOGGER=LoggerFactory.getLogger(Consumer.class);

    //kafkaListenerによってどのTopicの情報を取得するのか、
    //どのgroupIdの情報を取得するのかを設定でき、エラーが発生した場合のハンドリングなども可能。
    @KafkaListener(topics = "test",groupId = "sample")
    public void consumer(String message) {
        LOGGER.info("received message is {}",message);
    }

}