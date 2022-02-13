package com.loan.main.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.loan.main.requestBean.UserRequest;
import com.loan.main.responseBean.UserResponse;
import com.loan.main.responseBean.UserResponseFields;
import com.loan.main.service.UserService;



@RestController
@CrossOrigin(origins="*",allowedHeaders ="*")
@RequestMapping(value="/v1/user")

public class ControllerUser {

	
	
	@Autowired
	UserService userService;
	
	@ResponseBody
	@PostMapping(value = "/add" , produces="application/json",consumes="application/json")
	UserResponse addUser(@RequestBody UserRequest userRequest) {
		
		UserResponse userResponse = new UserResponse();
		UserResponseFields userResponseFields = new UserResponseFields();
		userResponse.setResponse(userResponseFields);
		userService.addUser(userRequest, userResponseFields);
		
		return userResponse;
		
	}
	
	
	@ResponseBody
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class) public Map<String,String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex)
	{
		Map<String,String> errors = new HashMap<>();
		
		ex.getBindingResult().getFieldErrors().forEach(error ->
		errors.put(error.getField(), error.getDefaultMessage()));
       // logger.error("Error occurred in the request json :", errors);
        return errors;
	}
	
}
