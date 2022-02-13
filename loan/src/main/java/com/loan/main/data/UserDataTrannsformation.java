package com.loan.main.data;

import com.loan.main.requestBean.UserRequest;
import com.loan.main.responseBean.UserResponseFields;

public interface UserDataTrannsformation {

	void userDataRequestTransformation(UserRequest userRequest , UserResponseFields userResponseFields);
}
