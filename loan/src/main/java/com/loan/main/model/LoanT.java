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
import com.loan.main.requestBean.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter


@Entity
@Table(name= "sys_loan_t")
public class LoanT {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "loan_id" ,updatable = false ,nullable = false)
	private int loan_id;
	
	
	@Column(name = "loan_amt" ,nullable = false )
	private long loan_amt;
	
	
	@Column(name = "loan_tenure" , nullable = false)
	private long loan_tenure;
	
	
	@Column(name = "emi_amt" , nullable =false)
	private long emi_amt;
	
	
	@Column(name = "status" , nullable=false)
	private int status;
	
	private int id;
	//for forign key to get userid here
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id" , referencedColumnName ="user_id")
	private UserT userT;

	//here i have made changes as the values for employee fields were coming null

	@Column(name = "industry")
	private String industry;


	@Column(name = "employee_catg")
	private String employee_catg;


	@Column(name = "company_name")
	private String company_name;


	@Column(name = "salary_amt")
	private long salary_amt;


	private String lname;


	private String fname;
	
	//for letting employee use the loan id
	//@OneToOne(mappedBy="loanT")//here also we are changing LoanT to load_id 
	//private EmployeeT employeeT;

	
	
	
	public LoanT() {
		super();
	}

	public int getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}

	public long getLoan_amt() {
		return loan_amt;
	}

	public void setLoan_amt(long loan_amt) {
		this.loan_amt = loan_amt;
	}

	public long getLoan_tenure() {
		return loan_tenure;
	}

	public void setLoan_tenure(long loan_tenure) {
		this.loan_tenure = loan_tenure;
	}

	public long getEmi_amt() {
		return emi_amt;
	}

	public void setEmi_amt(long emi_amt) {
		this.emi_amt = emi_amt;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserT getUserT() {
		return userT;
	}

	public void setUserT(UserT userT) {
		this.userT = userT;
	}

	
	
	
	//for employee fields
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
	
	//fields from users
	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
	
}
