package br.edu.ifpb.dac.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.ifpb.dac.application.model.Department;
import br.edu.ifpb.dac.application.model.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	public void create(Department department) {
		department.setName(department.getName());
		departmentService.create(department);
	}
	
	public void update(Department department) {
		department.setName(department.getName());
		departmentService.update(department);
	}
	
	public void delete(Integer code) {
		departmentService.delete(code);
	}
	
	public List<Department> list() {
		return departmentService.list();
	}

}
