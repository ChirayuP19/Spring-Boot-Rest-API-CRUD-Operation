package tech.chirayu.portfolio.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.chirayu.portfolio.Dto.EmployeeDto;
import tech.chirayu.portfolio.entity.Employee;
import tech.chirayu.portfolio.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private  EmployeeService employeeService;

	@PostMapping("/employee")
	public ResponseEntity<?> saveData(@RequestBody EmployeeDto employeeDto) {
	Employee employee=employeeService.saveEmployee(employeeDto);
	// return ResponseEntity.status(HttpStatus.CREATED).body(employee);
	return new ResponseEntity<Employee>(employee,HttpStatus.CREATED);
	}
	
	@GetMapping("/employee")
	public ResponseEntity<?> realAllData() {
	List<Employee> list=employeeService.readAllData();
	return ResponseEntity.status(HttpStatus.OK).body(list);
	}

}
