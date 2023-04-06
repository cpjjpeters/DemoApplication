package be.ipeters.crud.mapper;


import be.ipeters.activemq.model.Employee;
import be.ipeters.crud.persistence.EmployeeJpaEntity;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author tersc
 */
//@Qualifier("EmployeeJpaDaoMapper")
//@Component
@Mapper(componentModel = "spring")
public interface EmployeeJpaDaoMapper {
    EmployeeJpaEntity modelToJpaEntity(Employee employee);

    Employee jpaEntityToModel(EmployeeJpaEntity employeeJpaEntity);
}
