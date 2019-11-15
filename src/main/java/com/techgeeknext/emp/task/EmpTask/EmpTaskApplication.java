package com.techgeeknext.emp.task.EmpTask;
import com.techgeeknext.emp.task.EmpTask.model.Employee;
import com.techgeeknext.emp.task.EmpTask.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class EmpTaskApplication implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(EmpTaskApplication.class, args);
	}
	@Override
	public void run(String... arg0) throws Exception {
		Employee employee = new Employee();
		employee.setEmpName("TechGeekNext Employee 1");
		employeeRepository.save(employee);
	}
}
