package com.lnt.core.daos;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.lnt.core.exception.EmpException;
import com.lnt.core.model.Employee;

public interface EmpDAO {
	
	public Employee insertNewEmp(Employee emp) throws EmpException;


}
