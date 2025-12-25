package tech.chirayu.portfolio.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.chirayu.portfolio.Dto.EmployeeDto;
import tech.chirayu.portfolio.entity.Employee;
import tech.chirayu.portfolio.repository.EmployeeRepository;

@Service
public class EmployeeServiceaImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	private Employee employeedtotoEntity(EmployeeDto employeeDto) {
		Employee employee = new Employee();
		employee.setId(employeeDto.getId());
		employee.setName(employeeDto.getName());
		employee.setSalary(employeeDto.getSalary());
		employee.setAddress(employeeDto.getAddress());
		employee.setDate(LocalDate.now().toString());

		return employee;
	}

	@Override
	public Employee saveEmployee(EmployeeDto employeeDto) {
		Employee employee = employeedtotoEntity(employeeDto);
		Employee save = employeeRepository.save(employee);
		return save;
	}

}
