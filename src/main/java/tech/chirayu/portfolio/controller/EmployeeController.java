package tech.chirayu.portfolio.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tech.chirayu.portfolio.Dto.EmployeeDto;
import tech.chirayu.portfolio.entity.Employee;
import tech.chirayu.portfolio.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee")
	public ResponseEntity<?> saveData(@RequestBody EmployeeDto employeeDto) {
		Employee employee = employeeService.saveEmployee(employeeDto);
		// return ResponseEntity.status(HttpStatus.CREATED).body(employee);
		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
	}

	@GetMapping("/employee")
	public ResponseEntity<?> realAllData() {
		List<Employee> list = employeeService.readAllData();
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}

	@GetMapping("/employee/{id}")
	public ResponseEntity<?> readSingleData(@PathVariable long id) {
		Optional<Employee> singleData = employeeService.readSingleData(id);
		if (singleData.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(singleData.get());
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@GetMapping("/employee/name/{name}")
	public ResponseEntity<?> readDataByName(@PathVariable String name) {
		Optional<Employee> optional = employeeService.readDataByName(name);

		if (optional.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(optional.get());
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

}
