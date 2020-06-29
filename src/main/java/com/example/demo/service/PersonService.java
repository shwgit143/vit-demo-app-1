package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Employee;
import com.example.demo.repository.PersonRepository;
@Service
public class PersonService {
@Autowired
 PersonRepository personRepository;
public String save(Employee emp) {
	personRepository.save(emp);
	return "saved";
}
public List<Employee> findAll(){
	//return (List<Employee>) personRepository.findAll();
	List<Employee> employees = new ArrayList<Employee>();
	personRepository.findAll().forEach(employees1 -> employees.add(employees1));
	return employees;
}
}
