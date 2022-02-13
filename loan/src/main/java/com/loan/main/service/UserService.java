package com.loan.main.service;

import org.springframework.stereotype.Service;

import com.loan.main.requestBean.UserRequest;
import com.loan.main.responseBean.UserResponseFields;

@Service
public interface UserService {

	void addUser(UserRequest userRequest , UserResponseFields userResponseFields);
}
