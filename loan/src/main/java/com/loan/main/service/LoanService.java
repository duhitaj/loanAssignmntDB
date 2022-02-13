package com.loan.main.service;

import org.springframework.stereotype.Service;

import com.loan.main.model.LoanT;
import com.loan.main.requestBean.LoanRequest;
import com.loan.main.requestBean.UserRequest;
import com.loan.main.responseBean.LoanResponseFields;
import com.loan.main.responseBean.UserResponseFields;

@Service
public interface LoanService {

	void addLoan(LoanRequest loanRequest , LoanResponseFields loanResponseFields);
	
	void geLoanDetailsById(int loan_id,LoanResponseFields loanResponseFields);
	
	
}
