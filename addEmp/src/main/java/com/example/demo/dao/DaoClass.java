package com.example.demo.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.demo.entites.Employee;

@Repository
public class DaoClass {
	 @PersistenceContext
	    private EntityManager em;
	 public DaoClass() {
		// TODO Auto-generated constructor stub
	}
	 public Employee createEmployee(Employee emp)
	 {
		 System.out.println(emp.getId());
		 emp=em.merge(emp);
		 return emp;
	 }
}
