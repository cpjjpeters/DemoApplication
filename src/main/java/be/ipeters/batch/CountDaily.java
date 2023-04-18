package be.ipeters.batch;

import be.ipeters.crud.persistence.EmployeeJpaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* carlpeters created on 17/04/2023 inside the package - be.ipeters.batch */
@Service
@Slf4j
public class CountDaily {
    @Autowired
    EmployeeJpaService employeeJpaService;

//    @Scheduled(cron="* * * * * *")
//    public void fillQueueOneWithEmployee(){
//        System.out.println("*/10*******. \n"+ employeeJpaService.countDaily());
//
//    }

//    @Scheduled(fixedRate = 8000)
//    public void scheduleFixedRateTask() {
//        System.out.println(
//                "Fixed rate task - " + System.currentTimeMillis() / 1000);
//    }
}
