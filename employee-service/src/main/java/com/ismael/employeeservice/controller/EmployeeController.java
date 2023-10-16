package com.ismael.employeeservice.controller;

import com.ismael.employeeservice.model.Employee;
import com.ismael.employeeservice.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private static final Logger LOGGER
            = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    EmployeeRepository repository;



    @PostMapping
    public Employee add(@RequestBody Employee employee) {
        LOGGER.info("Employee add: {}", employee);
        return repository.add(employee);
    }

    @GetMapping
    public List<Employee> findAll() {
        LOGGER.info("Employee find");
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") Long id) {
        LOGGER.info("Employee find: id={}", id);
        return repository.findById(id);
    }

    @GetMapping("/department/{departmentId}")
    public ResponseEntity<List<Employee>> findByDepartment(@PathVariable("departmentId") Long departmentId) {
        LOGGER.info("Employee find: departmentId={}", departmentId);

        if (departmentId != null) {
            List<Employee> employees = repository.findByDepartment(departmentId);
            return ResponseEntity.ok(employees);
        } else {
            // Handle the case where departmentId is null. You can return a bad request response.
            return ResponseEntity.badRequest().build();
        }
    }
}
