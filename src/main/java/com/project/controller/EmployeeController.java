package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entities.EmployeeInfo;
import com.project.entities.LoginEntity;
import com.project.model.FormModel;
import com.project.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
	public String saveEmployeeData(@RequestBody FormModel formModel)
	{
		EmployeeInfo info = new EmployeeInfo();
		LoginEntity loginEntity = new LoginEntity();
		loginEntity.setEmpType(formModel.getEmpType());
		loginEntity.setUsername(formModel.getUsername());
		loginEntity.setPassword(formModel.getPassword());
		info.setLoginEntity(loginEntity);
		employeeService.saveEmployeeData(info);
		
		return "Employee data saved into database";
	}
	
	@GetMapping("/getAllEmployees")
	public List<EmployeeInfo> getAllEmpls() {
		return employeeService.getAllEmployees();
	}
}
