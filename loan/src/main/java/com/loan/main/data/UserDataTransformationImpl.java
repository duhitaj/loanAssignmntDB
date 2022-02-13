package com.loan.main.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.main.model.UserT;
import com.loan.main.repository.UserTRepo;
import com.loan.main.requestBean.UserRequest;
import com.loan.main.requestBean.UserRequestFields;
import com.loan.main.responseBean.UserResponseFields;

@Service
public class UserDataTransformationImpl implements UserDataTrannsformation{

	
	@Autowired
	UserTRepo userTRepo;
	
	
	@Override
	public void userDataRequestTransformation(UserRequest userRequest, UserResponseFields userResponseFields) {
		// TODO Auto-generated method stub
		
		
 
           UserT userT = new UserT();
		
    	UserRequestFields userRequestFields = userRequest.getUserRequestFields();
    	createUserT(userRequestFields , userT);
		
	}
	private void createUserT(UserRequestFields userRequestFields , UserT userT) {
		
		
		try {
		userT.setFname(userRequestFields.getFname());
		userT.setLname(userRequestFields.getLname());
		userT.setEmail(userRequestFields.getEmail());
		userT.setMobile(userRequestFields.getMobile());
		userT.setDob(userRequestFields.getDob());
		userT.setCity(userRequestFields.getCity());
		userT.setGender(userRequestFields.getGender());
		userT.setStatus(userRequestFields.getStatus());
		
		
		userT = userTRepo.save(userT);
	}
		
	
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
