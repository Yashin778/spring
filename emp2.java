package com.jdbctemp.model;

public class emp2 {
int eid;
String firstname;
String lastname;
int age;
int salary;
int departmentid;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "emp2 [eid=" + eid + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", salary="
			+ salary + ", departmentid=" + departmentid + "]";
}
public int getDepartmentid() {
	return departmentid;
}
public void setDepartmentid(int departmentid) {
	this.departmentid = departmentid;
}
public emp2() {
	super();
}

}
