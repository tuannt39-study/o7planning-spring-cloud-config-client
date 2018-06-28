package vn.its.o7planningspringcloudconfigclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.its.o7planningspringcloudconfigclient.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
