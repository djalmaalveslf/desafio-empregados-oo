package entities;

import java.util.List;
import java.util.ArrayList;

public class Department {
	private String name;
	private Integer payDay;
	
	private Address address;
	
	private List<Employee> employees = new ArrayList<>();
	
	public Department() {
	}

	public Department(String name, Integer payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public Double payroll() {
		double sum = 0;
		for(Employee employee : employees) {
			sum += employee.getSalary();
		}
		return sum;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployees() {
		return employees;
	}
}
