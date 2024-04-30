package EmployeeSystem.EMPSystem;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;



public class Employee_Impl{
	private HibernateTemplate hibernateTemplate;
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional(readOnly=false)
	public int insert(Employee e) {
		int i = (Integer) this.hibernateTemplate.save(e);
		return i;
	}

	public Employee getEmployee(int emp_id) {
		Employee em=hibernateTemplate.get(Employee.class, emp_id);
		return em;
	}

	public List<Employee> getAllEmployee() {
		List<Employee> list=hibernateTemplate.loadAll(Employee.class);
		return list;
	}
	@Transactional
	public void update(Employee e) {
		hibernateTemplate.update(e);
		
	}
	@Transactional
	public void delete(int emp_id) {
		Employee em=hibernateTemplate.get(Employee.class, emp_id);
		
	}

}
