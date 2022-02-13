package com.loan.main.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.loan.main.model.LoanT;
import com.loan.main.requestBean.LoanRequest;
import com.loan.main.requestBean.UserRequest;
import com.loan.main.responseBean.LoanResponse;
import com.loan.main.responseBean.LoanResponseFields;
import com.loan.main.responseBean.UserResponse;
import com.loan.main.service.LoanService;

@RestController
@CrossOrigin(origins="*",allowedHeaders ="*")
@RequestMapping(value="/v1/loan")


public class ControllerLoan {

	@Autowired 
	LoanService loanService;
	
	
	@ResponseBody
	@PostMapping(value = "/add" , produces="application/json",consumes="application/json")
	LoanResponse addLoan(@RequestBody LoanRequest loanRequest) {
		
		LoanResponse loanResponse = new LoanResponse();
		
		LoanResponseFields loanResponseFields = new LoanResponseFields();
		
		loanResponse.setResponse(loanResponseFields);
		loanService.addLoan(loanRequest, loanResponseFields);
		
		return loanResponse;
		
	}
	
	@GetMapping(value = "/loanid/{loan_id}", produces = "application/json")
	LoanResponse getuserById(@PathVariable("loan_id") int loan_id) {
		
		LoanResponse loanResponse = new LoanResponse();
		LoanResponseFields loanResponseFields = new LoanResponseFields();
		loanResponse.setResponse(loanResponseFields);
		loanService.geLoanDetailsById(loan_id, loanResponseFields);
		return loanResponse;
	}
	
	
	//@PutMapping(value = "update/{loanid}" , produces ="application/json" ,consumes="application/json")
	//LoanResponse 
	
	
	
	
	@ResponseBody
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class) public Map<String,String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex)
	{
		Map<String,String> errors = new HashMap<>();
		
		ex.getBindingResult().getFieldErrors().forEach(error ->
		errors.put(error.getField(), error.getDefaultMessage()));
       // logger.error("Error occurred in the request json :", errors);
        return errors;
	}
	
}
