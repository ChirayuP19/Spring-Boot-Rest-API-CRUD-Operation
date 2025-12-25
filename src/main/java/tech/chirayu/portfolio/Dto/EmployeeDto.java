package tech.chirayu.portfolio.Dto;

import javax.persistence.Id;

import org.springframework.core.type.filter.AbstractClassTestingTypeFilter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

	@Id
	private long id;
	private String name;
	private String address;
	private double salary;
	
}
