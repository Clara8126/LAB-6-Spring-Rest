package com.greatLearning.studentManagement.model;

public class Student {
int id;
String firstname;
String lastname;
String country , course;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id; 
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
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
	
}
}
