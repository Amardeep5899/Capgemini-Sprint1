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
	
	
	static ArrayList <AccountManagement> accountUsers=new ArrayList<AccountManagement>();

	public ArrayList<AccountManagement> getAccountDetails()
	{
		// TODO Auto-generated method stub
		AccountManagementRepository accountManagementRepository=new AccountManagementRepository();
		
		return accountUsers=accountManagementRepository.getAccountUsers();
	}

	public ArrayList<LoanRequest> updateLoanList(LoanRequest loanRequest)
	{
		 ArrayList<LoanRequest> loanrequest=new ArrayList<LoanRequest>();
		LoanRequestRepository loanRequestRepository=new LoanRequestRepository ();
		loanRequestRepository.setLoanUsers( loanRequest);
		loanrequest=loanRequestRepository.getLoanUsers();
		
		return loanrequest;
		
	}
	public boolean updateLoanDisbursed() 
	{
		// TODO Auto-generated method stub
		 LoanDisbursedRepository loanDisbursedRepository=new LoanDisbursedRepository ();
		 LoanDisbursed loanDisbursed=new LoanDisbursed("34433487437","Vishal2093","home loan",328248.00,30000,new Date(2010,02,11),7403.93,5);
		 loanDisbursedRepository.setLoanUsers1(loanDisbursed);
		  
		  return true;
		  
		
	}
}
