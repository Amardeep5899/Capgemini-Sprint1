package com.capgemini.pecuniabank.service;



import java.util.ArrayList;
import java.util.Date;

import com.capgemini.pecuniabank.dao.LoanDisbursedDao;
import com.capgemini.pecuniabank.dto.AccountManagement;
import com.capgemini.pecuniabank.dto.LoanDisbursed;
import com.capgemini.pecuniabank.dto.LoanRequest;
import com.capgemini.pecuniabank.exception.InvalidDataException;
import com.capgemini.pecuniabank.exception.InvalidInputDataException;
import com.capgemini.pecuniabank.util.AccountManagementRepository;
import com.capgemini.pecuniabank.util.LoanDisbursedRepository;
import com.capgemini.pecuniabank.util.LoanRequestRepository;

public class LoanService {
	 
	static ArrayList<LoanDisbursed> loanUsers=new ArrayList<LoanDisbursed>();
	static ArrayList <AccountManagement> accountUsers=new ArrayList<AccountManagement>();
	public boolean validateRequestId(String loanRequestId)
	{
		/*LoanDisbursedRepository lrr=new LoanDisbursedRepository ();
		loanUsers=lrr.getLoanUsers1();
		for(LoanDisbursed lr:loanUsers)
		{
			System.out.println("cid:"+lr);*/
			if(loanRequestId.length()==12)
				return true;
		
		
		return false;
	}
	
	public void releaseLoanList(ArrayList<LoanRequest> loanUsers)
	{
		for(LoanRequest lr:loanUsers)
		{
			System.out.println(lr);
		}
	}
	public boolean validateAccountExits(String accountId)
	{
		AccountManagementRepository acr=new AccountManagementRepository();
		
		accountUsers=acr.getAccountUsers();
	
		for(AccountManagement am:accountUsers)
		{
			
		if(accountId.equals(am.getAccountId()))
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
	public ArrayList<LoanRequest> approveLoan(ArrayList<LoanRequest> loanrequest)
	{
		for(LoanRequest lr: loanrequest) {
			if(checkCreditScore( lr)==true)
			{
				lr.setStatus("approved");
			}
			}
		return loanrequest;
	}
	public boolean checkCreditScore(LoanRequest lr)
	{
		
		if(lr.getCreditScore()>=700 &&lr.getCreditScore()<=900)
		{
		return true;
		}
		
			
		return false;
		
	}
	
	public ArrayList<LoanRequest> updateLoanList(LoanRequest lr)
	{
		 ArrayList<LoanRequest> loanrequest=new ArrayList<LoanRequest>();
		LoanRequestRepository lrr=new LoanRequestRepository ();
		lrr.setLoanUsers( lr);
		loanrequest=lrr.getLoanUsers();
		
		return loanrequest;
		
	}
	public String createLoanRequest(String loanRequestId,String loanCustomerId2, double loanAmount2, String loanType2, int tenure, double loanRoi, String loanStatus2,int creditScore) throws InvalidDataException
	{
	//	String loanRequestId=null;
		//int creditScore=null;
		 ArrayList<LoanRequest> loanrequest=new ArrayList<LoanRequest>();
		//LoanRequest lr=new LoanRequest("34433487437","Vishal2093",328248.00,"home loan",5,12.5,"Current",calculateEmi(328248.00, 5, 12.5),750);
		LoanRequest lr=new LoanRequest(loanRequestId,loanCustomerId2, loanAmount2, loanType2, tenure, loanRoi,loanStatus2,calculateEmi(loanAmount2,tenure,loanRoi),creditScore);
		loanrequest=updateLoanList( lr);
		LoanRequestRepository lrr= new LoanRequestRepository();
		loanrequest=approveLoan(loanrequest);
		if(loanrequest!=null)
		{
			 ArrayList<LoanRequest> loanrequest1=new ArrayList<LoanRequest>();
			 loanrequest1=approveLoan( loanrequest);
			
			 if( loanrequest1!=null)
			 {
				 LoanDisbursedDao ldd=new LoanDisbursedDao();
				 if(ldd.updateLoanDisbursed()==true)
					 releaseLoanList(loanrequest1);
				 return " loan granted";
			 }
			 else
			 {
				 throw new InvalidDataException("low credit score not eligible for loan request");
			 }
		}
		
		
		return loanStatus2;
		
	}
	
	public String getCustomerRow(String loanCustomerId)
	{
		return loanCustomerId;
		
	}
	
	//
	/* public boolean validateData(String loanRequestId, String loanCustromerId, double amount, String type, int tenure, double roi,
				String status, int creditScore) throws InvalidInputDataException
	 {
		 if(loanRequestID.length()==12 && stringContainsNumber(loanRequestID) ) 
		 {
		 if(loanCustomerID.length()==12 && stringContainsNumber(loanCustomerID) ) 
			{
				if(amount>=100.00||amount<=200000.00)
				{
					if(type.equals("home loan") || type.equals("education loan"))
					{
						if(tenure<10)
						{
							if(roi>5 || roi<25)
							{
								if(status.equals("not approved"))
								{
									if(creditScore<1000)
										{
											return true;
										}
							        else
							           	{
							        		throw new InvalidInputDataException("InvalidAccountException : "+"Invalid Credit Score");
								
							           	}
								}
								else
									{
										throw new InvalidInputDataException("InvalidAccountException : "+"Invalid rate of interest");
									}
								}
						else
							{
								throw new InvalidInputDataException("InvalidAccountException : "+"Invalid tenure");
					}
				}
				else
				{
					throw new InvalidInputDataException("InvalidAccountException : "+"Invalid cheque amount");
				}
			}
		 else
		 {
			 throw new InvalidInputDataException("InvalidAccountException : "+"Invalid accountId");
		 }
		 
	 }
	 */
	
	
	
	
}

	


