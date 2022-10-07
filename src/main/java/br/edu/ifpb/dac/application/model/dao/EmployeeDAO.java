package br.edu.ifpb.dac.application.model.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.dac.application.model.Employee;

@Repository
public interface EmployeeDAO extends PagingAndSortingRepository <Employee, Integer> {
	
	List<Employee> findByName (String name);
	Page<Employee> findByIdLessThan (Integer id, Pageable page);
	
}
