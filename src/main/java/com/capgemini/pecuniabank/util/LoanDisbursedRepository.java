package com.capgemini.pecuniabank.util;

import java.util.ArrayList;

import java.util.Date;

import com.capgemini.pecuniabank.dto.LoanDisbursed;
import com.capgemini.pecuniabank.dto.LoanRequest;

public class LoanDisbursedRepository 
{
	static ArrayList <LoanDisbursed> loanUsers1=new ArrayList<LoanDisbursed>();
	
	
	public static ArrayList<LoanDisbursed> getLoanUsers1()
	{
		return loanUsers1;
	}

	
	public boolean setLoanUsers1( LoanDisbursed ld) 
	{
		loanUsers1.add(ld);
		
		return true;
	}


	 public LoanDisbursedRepository()
	{
		loanUsers1.add(new LoanDisbursed("344334874373","Vishal20","home",328248.00,30000,new Date(2010,02,11),7403.93,5));
		
	}
	
}
