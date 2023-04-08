package be.ipeters.batch;

import be.ipeters.activemq.service.RandomGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@Component
@Slf4j
public class FillQueue {

    @Autowired
    RandomGenerator randomGenerator;

//    @Scheduled(cron="0 01 01 * * MON-FRI", zone = "Europe/Brussels")
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
//        log.info("The time is now {}", dateFormat.format(new Date()));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        log.debug(dtf.format(now));
    }

    @Scheduled(cron="*/30 * * * * *")
    public void fillQueueOne(){
        log.debug(". {}", randomGenerator.produceString());
    }

    @Scheduled(cron="*/10 * * * * *")
    public void fillQueueOneWithEmployee(){
        log.debug(". {}", randomGenerator.produceEmployee());


    }

}
