package com.techgeeknext.emp.task.EmpTask.repository;
import com.techgeeknext.emp.task.EmpTask.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}