package com.lnt.core.services;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.lnt.core.daos.EmpDAO;
import com.lnt.core.exception.EmpException;
import com.lnt.core.model.Employee;

/*
 * Transactions as per API
 * 		Declarative:Annotations or in XML. Simple,Versatile and always prefered.
 * 		Programmatic:Transactional API of different tools is different.
 * 
 * Types of Transactions
 * 		1. Local Transactions: JDBC,Hibernate.A Transaction with only one database.
 * 		2.Global Transactions: JPA, Servers:JBoss,WebLogic
 * 			can deal with multiple databases.,JMS,NoSQL like data communications and sources.
 * 
 * REQUIRED:Creates new Transaction if not existing or otherwise goes with propagated Transaction.
 * REQUIRED_NEW :Always creates a new transactions.
 * MANDATORY:the code must be executed in propagated transaction.Can not create new transaction
 * 
 * NEVER:it must not get a transaction and code
 */

@Service
@Transactional(propagation= Propagation.REQUIRED)
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpDAO dao;

	@Override
	public Employee joinNewEmployee(Employee emp) throws EmpException {
		
		return dao.insertNewEmp(emp);
	}
	
	

}
