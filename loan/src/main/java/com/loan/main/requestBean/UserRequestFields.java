package com.loan.main.requestBean;



import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserRequestFields {

   //@NotBlank(message = "name must be mentioned")
	
	@JsonProperty("fname")
	private String fname;
	
	@JsonProperty("lname")
	private String lname;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("mobile")
	private long mobile;
	
	@JsonProperty("gender")
	private String gender;
	
	@JsonProperty("city")
	private String city;
	
	@JsonProperty("dob")
	private Date dob;
	
	@JsonProperty("status")
	private int status;

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
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
}
