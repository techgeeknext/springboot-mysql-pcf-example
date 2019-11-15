package com.techgeeknext.emp.task.EmpTask.service;
import com.techgeeknext.emp.task.EmpTask.model.Employee;
import com.techgeeknext.emp.task.EmpTask.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	/**
	 * Get all employees
	 * @return object
	 */
	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}
}
