package com.lnt.core.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;

import com.lnt.core.exception.EmpException;
import com.lnt.core.model.Employee;

public interface EmpService {
	
	public Employee joinNewEmployee(Employee emp) throws EmpException;



}
