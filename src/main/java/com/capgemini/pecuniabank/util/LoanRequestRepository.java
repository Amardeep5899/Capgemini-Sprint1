package com.capgemini.pecuniabank.util;

import java.util.ArrayList;


import java.util.Date;

import com.capgemini.pecuniabank.dto.AccountManagement;
import com.capgemini.pecuniabank.dto.LoanRequest;
import com.capgemini.pecuniabank.service.LoanService;



public class LoanRequestRepository
{
	static ArrayList <LoanRequest> loanUsers=new ArrayList<LoanRequest>();
	LoanService loanService=new LoanService();
	
	public  ArrayList<LoanRequest> getLoanUsers() 
	{
		return loanUsers;
	}
	
	public boolean setLoanUsers(LoanRequest loanRequest)
	{
		loanUsers.add(new LoanRequest( "344334874373","Vishal20",328248.00,"home",5,12.5,"not_approved",loanService.calculateEmi(328248.00, 5, 12.5),750));
		loanUsers.add(new LoanRequest(  "344334874874","Amarde34",428248.00,"education",4,10.5,"not_approved",loanService.calculateEmi(428248.00,4,10.5),960));
		loanUsers.add(new LoanRequest(  "344334874975","Raj23459",528248.00,"home",3,8.5,"not_approved",loanService.calculateEmi(528248.00,3,8.5),770));
		loanUsers.add(loanRequest);
		return true;
	}

	


}




