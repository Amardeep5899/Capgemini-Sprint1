package com.capgemini.pecuniabank.service;

import java.util.ArrayList;

import java.util.Date;

import com.capgemini.pecuniabank.dao.LoanDisbursedDao;
import com.capgemini.pecuniabank.dto.AccountManagement;
import com.capgemini.pecuniabank.dto.LoanDisbursed;
import com.capgemini.pecuniabank.dto.LoanRequest;
import com.capgemini.pecuniabank.exception.InvalidDataException;


public class LoanService implements LoanServiceInterface {
	 
	static ArrayList<LoanDisbursed> loanUsers=new ArrayList<LoanDisbursed>();
	static ArrayList <AccountManagement> accountUsers=new ArrayList<AccountManagement>();
	LoanDisbursedDao loanDisbursedDao=new LoanDisbursedDao();
	public boolean validateRequestId(String loanRequestId)
	{
			if(loanRequestId.length()==12)
				return true;
		
		
		return false;
	}
	
	
	public boolean validateAccountExits(String accountId)
	{
		accountUsers=loanDisbursedDao.getAccountDetails();
	
		for(AccountManagement accountManagement:accountUsers)
		{
			
			if(accountId.equals(accountManagement.getAccountId()))
				return true;
			
		}
		
		return false;
		
	}
	
	
	public double calculateEmi(double amount2,int tenure2, double loanRoi2)
	{
		 loanRoi2=loanRoi2/(12*100); 
		 
	        tenure2=tenure2*12; 
	            
	        double emi= (amount2*loanRoi2*Math.pow(1+loanRoi2,tenure2))/(Math.pow(1+loanRoi2,tenure2)-1);
	      
	        return emi;
		
	}
	public boolean checkCreditScore(LoanRequest loanRequest)
	{
		
		if(loanRequest.getCreditScore()>=700 &&loanRequest.getCreditScore()<=900)
		{
			return true;
		}
		
			
		return false;
		
	}
	public ArrayList<LoanRequest> approveLoan(ArrayList<LoanRequest> loanrequest)
	{
		for(LoanRequest loanRequest: loanrequest) 
		{
			if(checkCreditScore(loanRequest)==true)
			{
				loanRequest.setStatus("approved");
			}
		}
		return loanrequest;
	}
	
	public void releaseLoanList(ArrayList<LoanRequest> loanUsers)
	{
		for(LoanRequest loanRequest:loanUsers)
		{
			System.out.println(loanRequest);
		}
	}
	
	 public boolean validateData(String loanRequestId, String loanCustomerId, double amount, String type, int tenure, double roi,
				String status, int creditScore) throws InvalidDataException
	 {
		 if(loanRequestId.length()==12) 
		 {
		 if(loanCustomerId.length()==8) 
			{
				if((amount>=100.00 && amount<=200000.00) && amount>0)
				{
					if(type.equals("home") || type.equals("education"))
					{
						if(tenure<10)
						{
							if(roi>5 || roi<25)
							{
								if(status.equals("not_approved"))
								{
									if(creditScore<1000)
										{
											return true;
										}
							        else
							           	{
							        		throw new InvalidDataException("creditscore is not valid");
								
							           	}
								}
								else
								{
										throw new InvalidDataException("status is invalid");
								}
							}
						else
						{
								throw new InvalidDataException("rate of interest is invalid");
						}
				}
				else
				{
					throw new InvalidDataException("tenure is invalid");
				}
			}
		 else
		 {
			 throw new InvalidDataException("type is not valid");
		 }
		 
	 }
	}
	}
	return false;
 }
	
	

	public String createLoanRequest(String loanRequestId,String loanCustomerId2, double loanAmount2, String loanType2, int tenure, double loanRoi, String loanStatus2,int creditScore) throws InvalidDataException
	{
		if((validateData(loanRequestId,loanCustomerId2, loanAmount2, loanType2,tenure,loanRoi,loanStatus2, creditScore))==true)
		{
		
		
			ArrayList<LoanRequest> loanrequest=new ArrayList<LoanRequest>();
		 
			LoanRequest loanRequest=new LoanRequest(loanRequestId,loanCustomerId2, loanAmount2, loanType2, tenure, loanRoi,loanStatus2,calculateEmi(loanAmount2,tenure,loanRoi),creditScore);
			loanrequest=loanDisbursedDao.updateLoanList(loanRequest);
	
			loanrequest=approveLoan(loanrequest);//input loan data
			if(loanrequest!=null)
			{
					ArrayList<LoanRequest> loanrequest1=new ArrayList<LoanRequest>();
					loanrequest1=approveLoan( loanrequest);//approved loan data
			
						if( loanrequest1!=null)
						{
							LoanDisbursedDao loanDisbursedDao=new LoanDisbursedDao();
							if(loanDisbursedDao.updateLoanDisbursed()==true)
								releaseLoanList(loanrequest1);//loan disbursed data
						}
						else
						{
							throw new InvalidDataException("Loan request is invalid");
						}
			}
			else
			{
				throw new InvalidDataException("Loan request is invalid");
			}
		}
		else
		{
			 throw new InvalidDataException("Loan request is invalid");
		}
		
	return "This is the release loan sheet according to our respective loan request";
		
}
	
	
	 }
	 
	
	
	
			


	


