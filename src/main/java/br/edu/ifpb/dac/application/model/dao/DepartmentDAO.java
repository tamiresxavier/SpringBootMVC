package br.edu.ifpb.dac.application.model.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.dac.application.model.Department;

@Repository
public interface DepartmentDAO extends PagingAndSortingRepository <Department, Integer> {
	
	List<Department> findByName (String name);
	Page<Department> findByCodeLessThan (Integer code, Pageable page);
	
}