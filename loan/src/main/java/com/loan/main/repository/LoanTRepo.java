package com.loan.main.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.loan.main.model.*;


public interface LoanTRepo extends JpaRepository<LoanT , Integer>{

	
}
