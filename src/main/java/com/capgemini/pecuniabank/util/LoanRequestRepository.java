package com.capgemini.pecuniabank.util;

import java.util.ArrayList;

import java.util.Date;

import com.capgemini.pecuniabank.dto.AccountManagement;
import com.capgemini.pecuniabank.dto.LoanRequest;
import com.capgemini.pecuniabank.service.LoanService;



public class LoanRequestRepository {
	static ArrayList <LoanRequest> loanUsers=new ArrayList<LoanRequest>();
	LoanService lsd=new LoanService();
	
	public  ArrayList<LoanRequest> getLoanUsers() {
		return loanUsers;
	}

	public boolean setLoanUsers(LoanRequest lr) {
		loanUsers.add(new LoanRequest( "344334874373","Vishal2093",328248.00,"home loan",5,12.5,"not approved",lsd.calculateEmi(328248.00, 5, 12.5),750));
		loanUsers.add(new LoanRequest(  "344334874874","Amardeep3456",428248.00,"education loan",4,10.5,"not approved",lsd.calculateEmi(428248.00,4,10.5),960));
		loanUsers.add(new LoanRequest(  "344334874975","Raj2345",528248.00,"home loan",3,8.5,"not approved",lsd.calculateEmi(528248.00,3,8.5),770));
		loanUsers.add(lr);
		return true;
	}

	
	

}




