package br.com.ane.kafkaconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    private final Logger logger;

    public ConsumerListener() {
        this.logger = LoggerFactory.getLogger(ConsumerListener.class);
    }


    @KafkaListener(topics = "${config.kafka.topic.testando}", groupId = "consumidor")
    public void processMessage(String message){
        logger.info("consumindo mensagem {}" , message);
    }
}
