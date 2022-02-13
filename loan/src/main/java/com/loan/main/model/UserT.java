package com.loan.main.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "sys_user_t")
public class UserT {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id" ,updatable = false , nullable = false )
	private int user_id;
	
	
	@Column(name = "fname" , nullable = false , length = 50 )
	private String fname;
	
	
	@Column(name = "lname" ,nullable = false ,length = 50 )
	private String lname;
	
	
	@Column(name = "email" ,nullable = false , length = 100)
	private String email;
	
	
	@Column(name = "mobile" ,nullable = false , length = 10)
	private long mobile;

	
	@Column(name = "city" , nullable = false ,length = 25)
	private String city;
	
	@Column(name = "dob" , nullable = false ,length = 25)
	private Date dob;
	
	@Column(name = "gender" , nullable = false , length = 20)
	private String gender;
	
	
	@Column(name = "status" , nullable = false )
	private int status;
	
	
	//now for using userid as foreign key 
//	@OneToOne(mappedBy = "userT")//here changing userT to property name
	//private LoanT loanT;

	
	

	public UserT() {
		super();
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public String getCity() {
		return city;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDob() {
		return dob;
	}


	public void setCity(String city) {
		this.city = city;
	}
	

	public String getGender() {
		return gender;
		//return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	
	
	


}
