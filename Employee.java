package EmployeeSystem.EMPSystem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeesysytem")
public class Employee {
	@Id
	@Column(name="Employee_Id")
	private int emp_id;
	@Column(name="Employee_Name")
	private String emp_name;
	@Column(name="Employee_age")
	private int age;
	@Column(name="Employee_Desiganation")
	private String dsg;
	@Column(name="Employee_Department")
	private String dpat;
	@Column(name="Employee_Salary")
	private double sal;
	
	public Employee() {
		super();
		
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", age=" + age + ", dsg=" + dsg + ", dpat="
				+ dpat + ", sal=" + sal + "]";
	}
	public Employee(int emp_id, String emp_name, int age, String dsg, String dpat, double sal) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.age = age;
		this.dsg = dsg;
		this.dpat = dpat;
		this.sal = sal;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDsg() {
		return dsg;
	}
	public void setDsg(String dsg) {
		this.dsg = dsg;
	}
	public String getDpat() {
		return dpat;
	}
	public void setDpat(String dpat) {
		this.dpat = dpat;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}

}
