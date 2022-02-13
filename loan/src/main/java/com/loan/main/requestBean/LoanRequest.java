package com.loan.main.requestBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoanRequest {

	@JsonProperty("request")
	LoanRequestFields loanRequestFields;
	
    boolean validate;
	
	public boolean isValidate() {
		return validate;
	}
	
	public void setValidate(boolean validate) {
		this.validate = validate;
	}
	
	public LoanRequestFields getLoanRequestFields() {
		return loanRequestFields;
	}
	public void setLoanRequestFields(LoanRequestFields loanRequestFields) {
		this.loanRequestFields = loanRequestFields;
	}
	
}
