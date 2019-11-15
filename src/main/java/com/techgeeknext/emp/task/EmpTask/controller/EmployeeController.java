package com.techgeeknext.emp.task.EmpTask.controller;

import com.techgeeknext.emp.task.EmpTask.model.Employee;
import com.techgeeknext.emp.task.EmpTask.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(value = "/get/employees", method = RequestMethod.GET)
    public String getEmployees() {
        final List<Employee> employees = employeeService.getAllEmployees();
        StringBuilder empDetails = new StringBuilder();
        if(employees !=null){
            for (Employee employee:employees) {
                empDetails.append(employee.getEmpName());
                empDetails.append("\n");
            }
        }
        return empDetails.toString();
    }
}
