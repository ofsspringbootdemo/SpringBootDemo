package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public void saveEmployee(List<Employee> employees) {
//		Session session = entityManager.unwrap(Session.class);
//		Transaction transaction = session.beginTransaction();
//		employees.forEach(employee -> session.save(employee));
//		transaction.commit();
//		entityManager.close();
		entityManager.persist(employees.get(0));
		System.out.println("#########");
		System.out.println(employees.get(0).getId());
		
	}

}
