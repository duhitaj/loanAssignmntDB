package com.loan.main.requestBean;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class LoanRequestFields {

	@JsonProperty("employee_catg")
	private String employee_catg;
	
	@JsonProperty("industry")
	private String industry;
	
	@JsonProperty("company_name")
	private String company_name;
	
	@JsonProperty("salary_amt")
	private long salary_amt;
	
	@JsonProperty("loan_amt")
	private long loan_amt;
	
	@JsonProperty("loan_tenure")
	private int loan_tenure;
	
	@JsonProperty("emi_amt")
	private long emi_amt;

	public LoanRequestFields() {
		super();
	}

	public String getEmployee_catg() {
		return employee_catg;
	}

	public void setEmployee_catg(String employee_catg) {
		this.employee_catg = employee_catg;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public long getSalary_amt() {
		return salary_amt;
	}

	public void setSalary_amt(long salary_amt) {
		this.salary_amt = salary_amt;
	}

	public long getLoan_amt() {
		return loan_amt;
	}

	public void setLoan_amt(long loan_amt) {
		this.loan_amt = loan_amt;
	}

	public int getLoan_tenure() {
		return loan_tenure;
	}

	public void setLoan_tenure(int loan_tenure) {
		this.loan_tenure = loan_tenure;
	}

	public long getEmi_amt() {
		return emi_amt;
	}

	public void setEmi_amt(long emi_amt) {
		this.emi_amt = emi_amt;
	}
	
	
	
	
}
