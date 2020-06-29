package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Employee {
@Id
private String fName;
private String lName;
private int age;
public Employee() {
	super();
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public int getAge() {
	return age;
}
public Employee(String fName, String lName, int age) {
	super();
	this.fName = fName;
	this.lName = lName;
	this.age = age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Employee [fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
}
}
