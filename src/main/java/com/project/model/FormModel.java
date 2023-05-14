package com.project.model;

import java.sql.Blob;
import java.sql.Date;

import com.project.entities.LoginEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FormModel {
	
	//login
	private String username;
	private String password;
	private String empType;
	
	//self
	private String name;
	private Date birthDate;
	private int age;
	private long mobileNo;
	private String inhabitant;
	private long aadharNo;
	private String cast;
	private String email;
	private String languages;
	private String address;
	
	//professional
	private Blob dp;
	private Date onboardedDate;
	private String position;
	private String assignedGroup;
	private long salary;
	private String panNo;
	private String education;
	private String almaMater;
	private int yop;
	private String priorCompaniesName;

	//bank
	private String bankName;
	private long accountNo;
	private String branchCode;
	private String ifscCode;
	private String cifNo;
	
	//generalise
	private LoginEntity loginEntity;
}
