package ru.aynur.springboot.cruddemo.services;

import ru.aynur.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(Long id);

    void save(Employee employee);

    void delete(Long id);
}
