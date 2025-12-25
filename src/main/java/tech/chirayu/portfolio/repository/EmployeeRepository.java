package tech.chirayu.portfolio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.chirayu.portfolio.entity.Employee;

@Repository
// here we must have to give me entityt name. 
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Optional<Employee> findByName(String name);

}
