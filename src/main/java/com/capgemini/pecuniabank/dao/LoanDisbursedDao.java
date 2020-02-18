package com.capgemini.pecuniabank.dao;

import java.util.ArrayList;
import java.util.Date;

import com.capgemini.pecuniabank.dto.AccountManagement;
import com.capgemini.pecuniabank.dto.LoanDisbursed;
import com.capgemini.pecuniabank.dto.LoanRequest;
import com.capgemini.pecuniabank.util.AccountManagementRepository;
import com.capgemini.pecuniabank.util.LoanDisbursedRepository;
import com.capgemini.pecuniabank.util.LoanRequestRepository;

public class LoanDisbursedDao {
	
	
	


	public boolean updateLoanDisbursed() {
		// TODO Auto-generated method stub
		 LoanDisbursedRepository ldr=new LoanDisbursedRepository ();
		 LoanDisbursed ld=new LoanDisbursed("34433487437","Vishal2093","home loan",328248.00,30000,new Date(2010,02,11),7403.93,5);
		  ldr.setLoanUsers1(ld);
		  
		  return true;
		  
		
	}
	

}
