package ru.aynur.springboot.cruddemo.dao;

import ru.aynur.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> findAll();

    Employee findById(Long id);

    void save(Employee employee);

    void delete(Long id);
}
