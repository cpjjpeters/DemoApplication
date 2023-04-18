package be.ipeters.crud.persistence;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeJpaRepository extends CrudRepository<EmployeeJpaEntity, Long> {

//    @Query(value = "SELECT emp.employee_last_name , count(*) from EMPLOYEE as emp group by emp.employee_last_name", nativeQuery = true)
//    HashMap<String, Integer> countDaily();

//    @Query(value = "SELECT count(*) from EMPLOYEE as emp ", nativeQuery = true)
//    Integer number();

}
