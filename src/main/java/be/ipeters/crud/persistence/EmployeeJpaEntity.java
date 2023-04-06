package be.ipeters.crud.persistence;

/* carlpeters created on 06/04/2023 inside the package - be.ipeters.crud.persistence */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "EMPLOYEE")
@Entity
public class EmployeeJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeId;

//    private String employeeId;
    @Column(name = "FULL_NAME")
    private String employeeFullName;
    private String employeeFirstName;
    private String employeeMiddleName;
    private String employeeLastName;

    public EmployeeJpaEntity(long employeeId, String employeeFullName, String employeeFirstName, String employeeMiddleName, String employeeLastName) {
        this.employeeId = employeeId;
        this.employeeFullName = employeeFullName;
        this.employeeFirstName = employeeFirstName;
        this.employeeMiddleName = employeeMiddleName;
        this.employeeLastName = employeeLastName;
    }

    public EmployeeJpaEntity() {
    }

    public long getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "employeeId=" + employeeId +
                ", employeeFullName='" + employeeFullName + '\'' +
                ", employeeFirstName='" + employeeFirstName + '\'' +
                ", employeeMiddleName='" + employeeMiddleName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                '}';
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeFullName() {
        return employeeFullName;
    }

    public void setEmployeeFullName(String employeeFullName) {
        this.employeeFullName = employeeFullName;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeMiddleName() {
        return employeeMiddleName;
    }

    public void setEmployeeMiddleName(String employeeMiddleName) {
        this.employeeMiddleName = employeeMiddleName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }
}
