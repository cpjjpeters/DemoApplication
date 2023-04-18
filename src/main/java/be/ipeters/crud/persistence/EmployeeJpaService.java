package be.ipeters.crud.persistence;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* carlpeters created on 06/04/2023 inside the package - be.ipeters.crud.persistence */
@Service
@Slf4j
public class EmployeeJpaService {
    @Autowired
    EmployeeJpaRepository employeeJpaRepository;

    public EmployeeJpaEntity save(EmployeeJpaEntity employee){
        log.debug("saving {}",employee.toString());
        return employeeJpaRepository.save(employee);

    }

//    public HashMap<String, Integer> countDaily(){
//
//        return this.employeeJpaRepository.countDaily();
//    }
//
//    public Integer number(){
//        return this.employeeJpaRepository.number();
//    }
}
