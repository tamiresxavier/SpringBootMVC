package br.edu.ifpb.dac.application.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.application.model.Employee;
import br.edu.ifpb.dac.application.model.dao.EmployeeDAO;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	public void create(Employee employee) {
		employeeDAO.save(employee);
	}
	
	public void update(Employee employee) {
		employeeDAO.save(employee);
	}
	
	public void delete(Integer id) {
		employeeDAO.deleteById(id);
	}
	
	public List<Employee> list() {
		return (List<Employee>) employeeDAO.findAll();
	}

}
