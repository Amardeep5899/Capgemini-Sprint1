package com.capgemini.pecuniabank.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.pecuniabank.dao.LoanDisbursedDao;
import com.capgemini.pecuniabank.dto.AccountManagement;
import com.capgemini.pecuniabank.dto.LoanRequest;
import com.capgemini.pecuniabank.exception.InvalidDataException;
import com.capgemini.pecuniabank.service.LoanService;

public class Client {
	
	public static void main(String args[])
	{
		LoanService ls=new LoanService();
		
		ArrayList <LoanRequest> loanUsers=new ArrayList<LoanRequest>();
	//	LoanRequest lr=new LoanRequest();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the request id");
		String loanRequestId=sc.next();
		System.out.println("Enter the Account id");
		String accountId=sc.next();
		
	
		//int choice;
	//	System.out.println("enter your choice");
	//	choice=sc.nextInt();
	//	switch(choice)
		//{
		//	case 1:
			//	{
					System.out.println("check if the loancustomerid is present or not ");
		
				//try 
				//{
				if(ls.validateRequestId(loanRequestId)==true)
				{
					//System.out.println("yes it is found");
					
					System.out.println("check if Accountid is present or not ");
					
					if(ls.validateAccountExits(accountId)==true)
					{
					
						System.out.println("yes it is found");
						System.out.println("Enter the customerId");
						String loanCustomerId=sc.next();
						System.out.println("Enter the Ammount");
						double amount=sc.nextDouble();
						System.out.println("Enter the type");
						String type=sc.next();
						System.out.println("Enter the tenure");
						int tenure=sc.nextInt();
						System.out.println("Enter the roi");
						double roi=sc.nextDouble();
						System.out.println("Enter the status");
						String status=sc.next();
						System.out.println("Enter the credit Score");
						int creditScore=sc.nextInt();
						try {
							loanUsers.add(new LoanRequest(loanRequestId,loanCustomerId, amount, type, tenure, roi, status,ls.calculateEmi(amount,tenure,roi),creditScore));
							System.out.println(ls.createLoanRequest(loanRequestId,loanCustomerId, amount, type, tenure, roi, status,creditScore));
						} catch (InvalidDataException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					/*	try {
							System.out.println(ls.createLoanRequest("344334874373",328248.00,  "home loan", 5,12.5,"Current"));
						} catch (InvalidDataException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}*/
						 
					}
					else
					{
						//throw new InvalidDataException("Account id not found");
						System.out.println("invalid");
					}
				/*	}}catch(InvalidDataException e)
					{
						System.out.println(e);
					}*/
				}
				else
				{
					//throw new InvalidDataException("request id not valid");
					System.out.println("invalid");
				}
			/*	}catch(InvalidDataException e)
				{
					System.out.println(e);
				}*/
	
	}
			

		
		
		
		
		
		
		
		
		
	}


