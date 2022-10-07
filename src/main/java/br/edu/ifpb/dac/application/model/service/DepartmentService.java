package br.edu.ifpb.dac.application.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.application.model.Department;
import br.edu.ifpb.dac.application.model.dao.DepartmentDAO;


@Service
public class DepartmentService {
	
	@Autowired
	DepartmentDAO departmentDAO;
	
	public void create(Department department) {
		departmentDAO.save(department);
	}
	
	public void update(Department department) {
		departmentDAO.save(department);
	}
	
	public void delete(Integer code) {
		departmentDAO.deleteById(code);
	}
	
	public List<Department> list() {
		return (List<Department>) departmentDAO.findAll();
	}


}
