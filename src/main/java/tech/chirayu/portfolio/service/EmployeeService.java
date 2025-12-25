package tech.chirayu.portfolio.service;

import org.springframework.stereotype.Service;

import tech.chirayu.portfolio.Dto.EmployeeDto;
import tech.chirayu.portfolio.entity.Employee;

@Service
public interface EmployeeService {

	public Employee saveEmployee(EmployeeDto employeeDto);

	

	
}
