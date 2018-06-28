package vn.its.o7planningspringcloudconfigclient.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INTERN0601_EMPLOYEE")
public class Employee {

    @Id
    @Column(name = "EM_ID")
    private Long emId;

    @Column(name = "EM_FIRSTNAME")
    private String firstName;

    @Column(name = "EM_LASTNAME")
    private String lastName;

    public Employee() {
    }

    public Employee(Long emId, String firstName, String lastName) {
        this.emId = emId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getEmId() {
        return emId;
    }

    public void setEmId(Long emId) {
        this.emId = emId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return emId + " - " + firstName + " " + lastName;
    }
}
