package com.loan.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.main.data.LoanDataTransformation;
import com.loan.main.enumconstant.CommonMessageEnum;
import com.loan.main.model.LoanT;
import com.loan.main.requestBean.LoanRequest;
import com.loan.main.responseBean.LoanResponseFields;

@Service
public class LoanServiceImpl implements LoanService {

	@Autowired
	LoanDataTransformation loanDataTransformation;
	
	@Override
	public void addLoan(LoanRequest loanRequest, LoanResponseFields loanResponseFields) {
		
		try {
			
			
			loanDataTransformation.loanDataRequestTransformation(loanRequest, loanResponseFields);
			
			loanResponseFields.setCode(200);
			loanResponseFields.setMessage(CommonMessageEnum.RECORD_INSERT_SUCCESS.getValue());
			loanResponseFields.setStatus(1);
			
		}
		catch(Exception e) {
		
			loanResponseFields.setCode(500);
			loanResponseFields.setMessage(CommonMessageEnum.RECORD_INSERT_ERROR.getValue());
			loanResponseFields.setStatus(0);
			
			
			
		}
		
	}

	

	@Override
	public void geLoanDetailsById(int loan_id, LoanResponseFields loanResponseFields) {
		
       try {

			
			loanDataTransformation.getLoanDetails(loan_id,loanResponseFields);
			loanResponseFields.setStatus(1);
			loanResponseFields.getFname();
			loanResponseFields.getLname();
			loanResponseFields.getEmployee_catg();
			loanResponseFields.getIndustry();
			loanResponseFields.getCompany_name();
			loanResponseFields.getSalary_amt();
			loanResponseFields.getLoan_amt();
			loanResponseFields.getLoan_tenure();
			loanResponseFields.getEmi_amt();
			
		

		} catch (Exception e) {
			//logger.error("UserServiceImpl:following error occurred in the getUserDetailsByUserId function :", e);
			loanResponseFields.setCode(500);
			loanResponseFields.setStatus(1);
			loanResponseFields.setMessage(CommonMessageEnum.DATA_FETCHED_ERROR.getValue());
			
		}
		
		
		
		
	}

	
	
}
