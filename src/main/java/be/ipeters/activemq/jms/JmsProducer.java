package be.ipeters.activemq.jms;

import be.ipeters.activemq.model.Employee;
import be.ipeters.activemq.service.RandomGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/* carlpeters created on 06/04/2023 inside the package - be.ipeters.activemq */
@Component
@Slf4j
public class JmsProducer {

    @Autowired
    JmsTemplate jmsTemplate;
    @Autowired
    RandomGenerator randomGenerator;

    @Value("${active-mq.topic}")
    private String topic;

    public void sendMessage(Employee message){
        for(int i = 1;i<50;i++) {
            try {
                log.info("Attempting Send message {} to Topic: {}", randomGenerator.produceString(), topic);
                Employee generated = randomGenerator.produceEmployee();
                jmsTemplate.convertAndSend(topic, message);
                jmsTemplate.convertAndSend(topic, generated);
            } catch (Exception e) {
                log.error("Received Exception during send Message: ", e);
            }
        }
    }
}
