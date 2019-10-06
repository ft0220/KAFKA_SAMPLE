package com.kafka.sample.kafka_sample.Producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer{

    //log出力用
    private static final Logger LOGGER=LoggerFactory.getLogger(Producer.class);

    //送り先のTOPICを定義
    private static final String TOPIC="test";

    //KafkaのkeyとValueの型を設定できます。
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;


    public void sendKafka(String message) {
        LOGGER.info("kafka send message is {}",message);
        //指定したTOPICにmessageを送信できる。
        kafkaTemplate.send(TOPIC,message);
        
    }
}