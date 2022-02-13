package com.loan.main.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.main.model.LoanT;
import com.loan.main.repository.LoanTRepo;
import com.loan.main.requestBean.LoanRequest;
import com.loan.main.requestBean.LoanRequestFields;
import com.loan.main.responseBean.LoanResponseFields;


@Service
public class LoanDataTransformationImpl implements LoanDataTransformation {
	
	@Autowired
	LoanTRepo loanTRepo;

	@Override
	public void loanDataRequestTransformation(LoanRequest loanRequest, LoanResponseFields loanResponseFields) {
		//here creation of loan will take place 
		
		LoanT loanT = new LoanT();
		LoanRequestFields loanRequestFields = loanRequest.getLoanRequestFields();
		createLoanT(loanT , loanRequestFields);
		
	}
	private void createLoanT(LoanT loanT , LoanRequestFields loanRequestFields) {
		
		try {
		
		loanT.setEmployee_catg(loanRequestFields.getEmployee_catg());	
		loanT.setIndustry(loanRequestFields.getIndustry());
		loanT.setCompany_name(loanRequestFields.getCompany_name());
		loanT.setSalary_amt(loanRequestFields.getSalary_amt());
		loanT.setLoan_amt(loanRequestFields.getLoan_amt());
		loanT.setLoan_tenure(loanRequestFields.getLoan_tenure());
		loanT.setEmi_amt(loanRequestFields.getEmi_amt());
		//loanT.setFname(loanRequestFields.get);
	//	loanT.setStatus(loanRequestFields.get);
		
		
		loanT = loanTRepo.save(loanT);
		
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}

}
	@Override
	public void getLoanDetails(Integer loan_id, LoanResponseFields loanResponseFields) {
		
		
		LoanT loanT = loanTRepo.getById(loan_id);
		loanResponseFields.setEmployee_catg(loanT.getEmployee_catg());
		loanResponseFields.setIndustry(loanT.getIndustry());
		loanResponseFields.setCompany_name(loanT.getCompany_name());
		loanResponseFields.setSalary_amt(loanT.getSalary_amt());
		loanResponseFields.setLoan_amt(loanT.getLoan_amt());
		//loanResponseFields.setLoan_tenure(loanT.getLoan_tenure());
		loanResponseFields.setCode(200);
		loanResponseFields.setStatus(1);

		
	}
	
	
	
	}
