package com.loan.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.main.data.UserDataTrannsformation;
import com.loan.main.enumconstant.CommonMessageEnum;
import com.loan.main.requestBean.UserRequest;
import com.loan.main.responseBean.UserResponseFields;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDataTrannsformation dataTransformation;

	@Override
	public void addUser(UserRequest userRequest, UserResponseFields userResponseFields) {
		// TODO Auto-generated method stub
		

			
			try {
				
				dataTransformation.userDataRequestTransformation(userRequest, userResponseFields);
				
				userResponseFields.setCode(200);
				userResponseFields.setMessage(CommonMessageEnum.RECORD_INSERT_SUCCESS.getValue());
				userResponseFields.setStatus(1);
				
				
				
			}
			catch(Exception e) {
				
				userResponseFields.setCode(500);
				userResponseFields.setMessage(CommonMessageEnum.RECORD_INSERT_ERROR.getValue());
				userResponseFields.setStatus(0);
				
				
				
			}
			
			
		}
		
		

		
	}


