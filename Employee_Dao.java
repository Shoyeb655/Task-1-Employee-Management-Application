package EmployeeSystem.EMPSystem;

import java.util.List;

public interface Employee_Dao {
	public int insert(Employee e);
	public Employee getEmployee (int emp_id);
	public List<Employee> getAllEmployee();
	public void update(Employee e);
	public void delete(int emp_id);

}
