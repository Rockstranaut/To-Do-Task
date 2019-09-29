package com.lnt.core.daos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Propagation;
import com.lnt.core.exception.EmpException;
import com.lnt.core.model.Employee;

@Repository
@Transactional(propagation=Propagation.REQUIRED)
public class EmpDAOImpl implements EmpDAO {
	@PersistenceContext // This DI is mandatory for Entity MAnager of JPA
	private EntityManager entityManager;
	
	
	@Override
	public Employee insertNewEmp(Employee emp) throws EmpException {
		
		entityManager.persist(emp);
		return emp;
	}
	
	

	/*@Resource  ///without name it may go 'byType' by default. no need of autowired.but  very complicated annotation
	private JdbcTemplate template;
	//Connection connect = dataSource.getConnection();
	@Override
	public ArrayList<Employee> getTodoList() throws EmpException {
		
		String qry="select * from todo";
		
		List<Map<String,Object>> list= template.queryForList(qry, new Object[] {});
		ArrayList<Employee> List= new ArrayList<>();
		
		
		for(Map<String,Object> item:list)
		{
			
			BigDecimal bdID= (BigDecimal)item.get("id");
			int id= bdID.intValue();
			String task=(String)item.get("task");
			BigDecimal bdstatus= (BigDecimal)item.get("status");
			float status= bdID.intValue();
			
			Employee list1= new Employee(id,task,status);
			List.add(list1);
	}
		return List;
	}
	
	*/
	

}
