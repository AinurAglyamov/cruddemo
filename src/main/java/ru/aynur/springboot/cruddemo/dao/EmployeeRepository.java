package ru.aynur.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aynur.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
