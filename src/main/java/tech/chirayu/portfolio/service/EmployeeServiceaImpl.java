package tech.chirayu.portfolio.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Employee> readAllData() {
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> readSingleData(long id) {
		return employeeRepository.findById(id);
	}

	public Optional<Employee> readDataByName(String name) {
		return employeeRepository.findByName(name);
	}

	@Override
	public Employee updateAllData(Long id, EmployeeDto employeeDto) {
		Optional<Employee> byId = employeeRepository.findById(id);
		if(byId.isPresent()) {
			Employee employee = employeedtotoEntity(employeeDto);
			Employee save = employeeRepository.save(employee);
			return save;	
		}
		
		return null;
	}

}
