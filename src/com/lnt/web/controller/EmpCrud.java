package com.lnt.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lnt.core.exception.EmpException;
import com.lnt.core.model.Employee;
import com.lnt.core.services.EmpService;
import com.sun.tracing.dtrace.ModuleAttributes;


/*
 * ModelANdView:
 * 		Represents Data and JSP name both.
 * 		Always to be created,return with return type of method.
 * 
 * Model:
 * 
 * 		Represents only data and never JSP name.
 * 		Never to be created but is received as propagated.
 * 		Name is returned as String.
 */


//URL :http://localhost:9092/Springweb040_BindValid/app/crud/home

@Controller
@RequestMapping("/crud")

public class EmpCrud {
	
	@Resource
	private EmpService service;
	
	@RequestMapping("/home")
	public String getHomePage()
	{
		return "Home";
	}
	
	
	@RequestMapping("/showForm")
	public ModelAndView showRegistrationForm()
	{
		ModelAndView mnv =new ModelAndView("Registration1");
		
		//This is0 command object.The @ModelAttribute will bind jsp fields with this object
		Employee emp=new Employee();
		mnv.addObject("emp",emp);
		return mnv;
	}

	@RequestMapping("/submitForm")
	public String joinNewEmployee(@ModelAttribute Employee emp,Model model) throws EmpException
	{
		
		/*String strEmpNo= request.getParameter("empNo"); //received from registration form
		String empName= request.getParameter("empName");
		String strFloat=request.getParameter("salary");
		
		int empNo=Integer.parseInt(strEmpNo);
		float empSal=Integer.parseInt(strFloat);
		
		Employee emp =new Employee(empNo,empName,empSal);
		*/
		model.addAttribute("emp",emp);
		emp=service.joinNewEmployee(emp);
		return "SucessJoinEmp";
		
	}
	
	
	
	
}
