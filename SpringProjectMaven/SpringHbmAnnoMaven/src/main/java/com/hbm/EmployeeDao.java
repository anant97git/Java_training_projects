package com.hbm;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;  
@Component("edao")
public class EmployeeDao {  
	@Autowired
    private SessionFactory template;
 	public void setTemplate(SessionFactory template) {  this.template = template;  	}  
	@Transactional(readOnly = false)
	public void saveEmployee(Employee e){  	template.getCurrentSession().persist(e); 	}  
	@Transactional(readOnly = false)  
	public void updateEmployee(Employee e){  	template.getCurrentSession().update(e); }  
	@Transactional(readOnly = false)  
	public void deleteEmployee(Employee e){  template.getCurrentSession().delete(e);  }  
	@Transactional(readOnly = false)
	public Employee getById(int id){  Employee e=(Employee)template.getCurrentSession().get(Employee.class,id);	return e; 	}  
	@Transactional(readOnly = false) 
	public List<Employee> getEmployees(){  
		@SuppressWarnings("unchecked")
		List<Employee> list = template.getCurrentSession().createQuery("from Employee").getResultList();
		return list; 	}  }
