package com.loan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "sys_emp_t")
public class EmployeeT {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id" , updatable = false ,nullable = false)
	private int emp_id;
	
	
	@Column(name = "employee_catg" , nullable = false , length =50)
	private String employee_catg;
	
	
	@Column(name = "industry" , nullable = false , length = 50)
	private String industry;
	
	
	@Column(name= "company_name" , nullable = false , length = 50)
	private String company_name;
	
	
	@Column(name ="salary_amt" , nullable = false , length =20)
	private long salary_amt;
	
	
	@Column(name = "status" , nullable = false)
	private int status;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "loan_id" , referencedColumnName ="loan_id")
	private LoanT loanT;

	public EmployeeT() {
		super();
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public LoanT getLoanT() {
		return loanT;
	}

	public void setLoanT(LoanT loanT) {
		this.loanT = loanT;
	}
	
	
	
	
	
}
