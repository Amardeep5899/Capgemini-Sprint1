package com.capgemini.pecuniabank.util;

import java.util.ArrayList;
import java.util.Date;

import com.capgemini.pecuniabank.dto.LoanDisbursed;
import com.capgemini.pecuniabank.dto.LoanRequest;

public class LoanDisbursedRepository {
	static ArrayList <LoanDisbursed> loanUsers1=new ArrayList<LoanDisbursed>();
	
	
	public static ArrayList<LoanDisbursed> getLoanUsers1() {
		return loanUsers1;
	}


	public boolean setLoanUsers1( LoanDisbursed ld) {
		loanUsers1.add(ld);
		
		return true;
	}


	 public LoanDisbursedRepository()
	{
		loanUsers1.add(new LoanDisbursed("34433487437","Vishal2093","home loan",328248.00,30000,new Date(2010,02,11),7403.93,5));
		//loanUsers1.add(new LoanDisbursed("34433487437","Amardeep3456","education loan",428248.00,40000,new Date(2010,02,11),calculateEmi(428248.00,4,10.5),4));
	//	loanUsers1.add(new LoanDisbursed("34433487437","Raj2345","home loan",528248.00,50000,new Date(2010,02,11),lsd.calculateEmiDao(528248.00,3,8.5),3));
	}
	

}
