package com.training.model;

import com.training.annotaion.DataTable;
import com.training.annotaion.Example;
@DataTable(tableName = "student")
@Example(value = "dcccd")
public class Student {
   private int id;
   private String name;
  
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
   
}
