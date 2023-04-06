package be.ipeters.activemq.jms;

/* carlpeters created on 06/04/2023 inside the package - be.ipeters.activemq */

import be.ipeters.activemq.model.Employee;

import be.ipeters.activemq.service.QueueMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

@Component
@Slf4j
public class JmsConsumer implements MessageListener {

    private final QueueMessageService queueMessageService;

    public JmsConsumer(QueueMessageService queueMessageService) {
        this.queueMessageService = queueMessageService;
    }

    @Override
    @JmsListener(destination = "${active-mq.topic}")
    public void onMessage(Message message) {
        try{
            ObjectMessage objectMessage = (ObjectMessage)message;
            Employee employee = (Employee)objectMessage.getObject();
            //do additional processing
            queueMessageService.receiveMessage(employee);

            log.info("Received Message from Topic: "+ employee.toString());
        } catch(Exception e) {
            log.error("Received Exception while processing message: "+ e);
        }

    }
}
