package tech.chirayu.portfolio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tech.chirayu.portfolio.Dto.EmployeeDto;
import tech.chirayu.portfolio.entity.Employee;

@Service
public interface EmployeeService {

	public Employee saveEmployee(EmployeeDto employeeDto);

	public List<Employee> readAllData();
	
}
