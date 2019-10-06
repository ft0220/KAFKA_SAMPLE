package com.kafka.sample.kafka_sample;

import com.kafka.sample.kafka_sample.Producer.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties
@RequestMapping("/kafka-sample")
public class Controller {

    @Autowired
    private Producer producer;

    @GetMapping
    public void sendMessage(@RequestParam("message") String message){
        producer.sendKafka(message);
    }
}