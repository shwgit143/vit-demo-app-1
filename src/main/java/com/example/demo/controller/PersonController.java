package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Employee;
import com.example.demo.service.PersonService;
@Controller
public class PersonController {
	@Autowired
	PersonService personService;
@RequestMapping("/PersonForm")
public String personForm() {
	return "PersonJsp";
}
@ResponseBody
@RequestMapping(value="/save",method=RequestMethod.POST)
public String save(@ModelAttribute("fName")String fName,@ModelAttribute("lName")String lName,@ModelAttribute("age")int age) {
	System.out.println(fName);
	System.out.println(lName);
	System.out.println(age);
	return personService.save(new Employee(fName,lName,age));
}
@ResponseBody
@RequestMapping(path ="/displayAll")
public List<Employee> showAll(){
	return personService.findAll();
}
}
