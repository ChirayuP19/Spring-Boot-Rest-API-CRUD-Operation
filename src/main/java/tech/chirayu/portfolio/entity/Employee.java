package tech.chirayu.portfolio.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.chirayu.portfolio.Dto.EmployeeDto;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	private long id;
	private String name;
	private String address;
	private double salary;
	private String date;
}
