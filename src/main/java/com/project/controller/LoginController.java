package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.services.LoginService;


@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	/*
	 * @Autowired private AuthenticationManager authenticationManager;
	 */
	
	@Autowired
	private ObjectMapper objectMapper;
	
	/*
	 * @Autowired private JwtUtility jwtUtility;
	 */
	
	/*
	 * @CrossOrigin( origins = "http://localhost:3000", methods =
	 * {RequestMethod.POST}, allowedHeaders = {"*"}, allowCredentials = "true")
	 * 
	 * @PostMapping("/") public ResponseEntity<String> getLoginDetails (@RequestBody
	 * LoginEntity loginEntity) throws Exception{ try {
	 * authenticationManager.authenticate(new
	 * UsernamePasswordAuthenticationToken(loginEntity.getUsername(),
	 * loginEntity.getPassword())); }catch(Exception e) { e.printStackTrace(); }
	 * String token = this.jwtUtility.generateToken(loginEntity.getUsername());
	 * Object object =
	 * this.loginService.getLoggedInUserInfo(loginEntity.getUsername(), token);
	 * String json = ""; if(object!=null) { json =
	 * this.objectMapper.writeValueAsString(object); } return new
	 * ResponseEntity<String>(json,HttpStatus.OK); }
	 */

}
