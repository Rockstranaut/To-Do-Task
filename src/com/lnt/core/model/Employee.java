package com.lnt.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//this is an entity class/model class

@Entity
@Table(name="todo")
public class Employee {
	
	@Id
	@Column(name="id")
	private int empNo;
	
	@Column(name="task")
	private String empName;
	
	@Column(name="status")
	private float empSal;

	// it is for spring jdbc and hibernate
	public Employee() {
		super();
	}

	public Employee(int empNo, String empName, float empSal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}
