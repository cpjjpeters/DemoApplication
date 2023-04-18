package be.ipeters.activemq.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ReceiverService {

    @JmsListener(destination = "${jms.queue}")
    public void receiveMessage(String message){
        log.info("received message: {}", message);
    }
}
