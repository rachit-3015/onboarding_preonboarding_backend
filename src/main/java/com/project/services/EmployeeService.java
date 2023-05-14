package com.project.services;

import java.util.List;

import com.project.entities.EmployeeInfo;

public interface EmployeeService {
	
	public void saveEmployeeData(EmployeeInfo employeeInfo);

	public List<EmployeeInfo> getAllEmployees();

}
