package be.ipeters.crud.persistence;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeJpaRepository extends CrudRepository<EmployeeJpaEntity, Long> {

}
