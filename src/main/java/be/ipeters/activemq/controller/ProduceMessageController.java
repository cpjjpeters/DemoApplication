package be.ipeters.activemq.controller;

import be.ipeters.activemq.jms.JmsProducer;
import be.ipeters.activemq.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/* carlpeters created on 06/04/2023 inside the package - be.ipeters.activemq */
@RestController
@Slf4j
public class ProduceMessageController {

    @Autowired
    JmsProducer jmsProducer;

    @PostMapping(value="/api/employee")
    public Employee sendMessage(@RequestBody Employee employee){

        jmsProducer.sendMessage(employee);
        return employee;
    }
}
