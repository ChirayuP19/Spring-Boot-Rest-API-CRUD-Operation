package tech.chirayu.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import tech.chirayu.portfolio.Dto.EmployeeDto;
import tech.chirayu.portfolio.entity.Employee;

@Service
public interface EmployeeService {

	public Employee saveEmployee(EmployeeDto employeeDto);

	public List<Employee> readAllData();

	public Optional<Employee> readSingleData(long id);

	public Optional<Employee> readDataByName(String name);

	public Employee updateAllData(Long id, EmployeeDto employeeDto);

	
	
}
