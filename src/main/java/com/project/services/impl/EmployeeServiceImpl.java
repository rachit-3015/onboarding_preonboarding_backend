package com.project.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.EmployeeInfo;
import com.project.repositories.EmployeeRepo;
import com.project.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public void saveEmployeeData(EmployeeInfo employeeInfo) {
		employeeRepo.save(employeeInfo);
	}

	@Override
	public List<EmployeeInfo> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

}
