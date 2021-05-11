package ru.aynur.springboot.cruddemo.dao;

import org.springframework.stereotype.Repository;
import ru.aynur.springboot.cruddemo.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class EmployeeDaoJpaImpl implements EmployeeDao {

    private EntityManager entityManager;

    public EmployeeDaoJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query =
                entityManager.createQuery("from Employee", Employee.class);
        return query.getResultList();
    }

    @Override
    public Employee findById(Long id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public void save(Employee employee) {
        Employee dbEmployee = entityManager.merge(employee);
        employee.setId(dbEmployee.getId());
    }

    @Override
    public void delete(Long id) {
        Query query = entityManager.createQuery("delete from Employee where id=:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}
