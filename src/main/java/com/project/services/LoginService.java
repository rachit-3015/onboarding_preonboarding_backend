package com.project.services;

import org.springframework.stereotype.Service;

import com.project.entities.LoginEntity;

@Service
public interface LoginService {

	public void saveLoginDetails(LoginEntity loginEntity);
	Object getLoggedInUserInfo(String userName, String token);
}
