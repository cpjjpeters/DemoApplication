package be.ipeters.activemq.service;

/* carlpeters created on 06/04/2023 inside the package - be.ipeters.activemq.service */

import be.ipeters.activemq.model.Employee;
import be.ipeters.crud.mapper.EmployeeJpaDaoMapper;
import be.ipeters.crud.persistence.EmployeeJpaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class QueueMessageService {

    private final EmployeeJpaService employeeJpaService;
//    private final EmployeeJpaDaoMapper employeeJpaDaoMapper;

    public QueueMessageService(EmployeeJpaService employeeJpaService ) {
        this.employeeJpaService = employeeJpaService;

    }

    @Autowired
    EmployeeJpaDaoMapper mapper;


    public void receiveMessage(Employee mqMessage) throws Exception {
        log.debug("mqMessage = {}", mqMessage.toString());
        employeeJpaService.save(mapper.modelToJpaEntity(mqMessage));
    }

}
