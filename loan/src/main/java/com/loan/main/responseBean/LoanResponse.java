package com.loan.main.responseBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoanResponse {

	@JsonProperty("response")
	Object response;
	
	public Object getResponse() {
		return response;
		
	}
	
	public void setResponse(LoanResponseFields response) {
		this.response = response;
	}

}
