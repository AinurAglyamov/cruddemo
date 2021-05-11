package ru.aynur.springboot.cruddemo.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.aynur.springboot.cruddemo.dao.EmployeeDao;
import ru.aynur.springboot.cruddemo.entity.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;

    public EmployeeServiceImpl(@Qualifier("employeeDaoJpaImpl") EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    @Transactional
    public Employee findById(Long id) {
        return employeeDao.findById(id);
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        employeeDao.delete(id);
    }
}
