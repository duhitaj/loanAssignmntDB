package com.loan.main.data;

import com.loan.main.model.LoanT;
import com.loan.main.requestBean.LoanRequest;
import com.loan.main.requestBean.UserRequest;
import com.loan.main.responseBean.LoanResponseFields;
import com.loan.main.responseBean.UserResponseFields;

public interface LoanDataTransformation {

	void loanDataRequestTransformation(LoanRequest loanRequest , LoanResponseFields loanResponseFields);

	void getLoanDetails(Integer loan_id, LoanResponseFields loanResponseFields );
	
	//public LoanT deleteloanid(Integer loan_id);
}
