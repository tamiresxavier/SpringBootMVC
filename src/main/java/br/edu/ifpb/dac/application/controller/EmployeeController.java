package br.edu.ifpb.dac.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.ifpb.dac.application.model.Employee;
import br.edu.ifpb.dac.application.model.service.EmployeeService;


@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	public void create(Employee employee) {
		employee.setName(employee.getName());
		employee.setLastName(employee.getLastName());
		employee.setOffice(employee.getOffice());
		employeeService.create(employee);
	}
	
	public void update(Employee employee) {
		employee.setName(employee.getName());
		employee.setLastName(employee.getLastName());
		employee.setOffice(employee.getOffice());
		employeeService.update(employee);
	}
	
	public void delete(Integer id) {
		employeeService.delete(id);
	}
	
	public List<Employee> list() {
		return employeeService.list();
	}
	
}
