package vn.its.o7planningspringcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import vn.its.o7planningspringcloudconfigclient.repository.EmployeeRepository;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employee/{id}")
    public String getAllOrders(@PathVariable("id") Long id) {
        return employeeRepository.getOne(id).toString();
    }
}
