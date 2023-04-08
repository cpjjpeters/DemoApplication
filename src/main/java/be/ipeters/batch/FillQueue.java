package be.ipeters.batch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.scheduling.annotation.Scheduled;
/* carlpeters created on 08/04/2023 inside the package - be.ipeters.batch */
@Service
@Slf4j
public class FillQueue {

    @Autowired
    RandomGenerator randomGenerator;

//    @Sheduled(cron="0 01 01 * * MON-FRI", zone = "Europe/Brussels")
    @Sheduled(cron="*/30 * * * * *", zone = "Europe/Brussels")
    public void fillQueueOne(){
        log.debug(". {}" randomGenerator.produceString());

    }

}
