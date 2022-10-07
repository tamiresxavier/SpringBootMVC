package br.edu.ifpb.dac.application;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifpb.dac.application.controller.DepartmentController;
import br.edu.ifpb.dac.application.controller.EmployeeController;
import br.edu.ifpb.dac.application.model.Department;
import br.edu.ifpb.dac.application.model.Employee;

@SpringBootApplication
public class SpringBootMvcApplication implements CommandLineRunner{

	@Autowired
	EmployeeController employeeController;
	
	@Autowired
	DepartmentController departmentController;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sn = new Scanner (System.in);
		Employee employee = new Employee();
		Department department = new Department();
		boolean close = false;
		int op; // Saving user option
		while (! close) {
			System.out.println("[1] create employee" + "\n" + "[2] list of employees" + "\n" + "[3] close");
			op = sn.nextInt ();
			switch(op) {
				case 1: 
					department.setName(sn.nextLine());
					departmentController.create(department); 
					employee.setName(sn.nextLine());
					employee.setLastName(sn.nextLine());
					employee.setOffice(sn.nextLine());
					employee.setDepartment(department);
					employeeController.create(employee);
					System.out.println("Created employee!");
				break;
				case 2:
					List<Employee> employees = employeeController.list();
					for(Employee e: employees) {
						System.out.println(e);
					}
				break;
				default:
					close = true;
			}
		 }
	}
}
