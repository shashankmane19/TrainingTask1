package com.basic.springboot.entity;

import javax.persistence.Entity;

@Entity
public class Student {
	
	String studName;

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	@Override
	public String toString() {
		return "Student [studName=" + studName + "]";
	}
	
	

}
