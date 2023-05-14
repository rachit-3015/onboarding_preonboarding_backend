package com.project.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.entities.LoginEntity;
import com.project.model.LoginModel;
import com.project.repositories.LoginRepo;
import com.project.services.LoginService;

@Component
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginRepo loginRepo;	
	
	@Override
	public void saveLoginDetails(LoginEntity loginEntity) {
		this.loginRepo.save(loginEntity);
	}

	@Override
	public Object getLoggedInUserInfo(String username, String token) {
		LoginEntity login = this.loginRepo.findByUsername(username);
		if(login!=null) {
			return parseLoginEntity(login,token);
		}
		return null;
	}
	
	private Object parseLoginEntity(LoginEntity loginEntity, String token) {
		LoginModel loginModel = new LoginModel();
		if(loginEntity.getUsername()!=null) {
			loginModel.setUsername(loginEntity.getUsername());
		}
		if(loginEntity.getPassword()!=null) {
			loginModel.setPassword(loginEntity.getPassword());
		}
		if(loginEntity.getEmpType()!=null) {
			loginModel.setEmpType(loginEntity.getEmpType());
		}
		return loginModel;
	}
}
