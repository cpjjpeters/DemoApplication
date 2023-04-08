package be.ipeters.activemq.service;

import be.ipeters.activemq.model.Employee;
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

    public Employee produceEmployee(){
        Employee employee = new Employee();
        employee.setEmployeeFirstName(RandomStringUtils.random(5, true, false));
        employee.setEmployeeLastName(RandomStringUtils.random(10, true, true));
        employee.setEmployeeFullName(employee.getEmployeeFirstName() + " " + employee.getEmployeeLastName());
        employee.setEmployeeMiddleName("middle");
        return employee;
//        "employeeId": "51",
//                "employeeFullName": "Brigitte Bardot",
//                "employeeFirstName": "Brigitte",
//                "employeeMiddleName": "bb@unknown.org",
//                "employeeLastName": "Bardot"

    }
}
