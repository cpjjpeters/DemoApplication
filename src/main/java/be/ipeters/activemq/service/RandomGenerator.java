package be.ipeters.activemq.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

/* carlpeters created on 08/04/2023 inside the package - be.ipeters.activemq.service */
@Service
@Slf4j
public class RandomGenerator {

    public String produceString(){
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
        log.debug(generatedString);
        return generatedString;
    }
}
