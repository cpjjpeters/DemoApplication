package be.ipeters.activemq.controller;

import be.ipeters.activemq.service.DispatcherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/* carlpeters created on 11/04/2023 inside the package - be.ipeters.activemq.controller */
@RestController
@Slf4j
public class MessageController {
    @Autowired
    DispatcherService dispatcherService;

    public ResponseEntity<String> send(@RequestBody String message){
        dispatcherService.sendMessage(message);
        return new  ResponseEntity<>("Message sent: "+ message, HttpStatus.OK);
    }

}
