package com.capgemini.pecuniabank.ui;

import java.util.ArrayList;

import java.util.Scanner;

import com.capgemini.pecuniabank.dto.LoanRequest;
import com.capgemini.pecuniabank.exception.InvalidDataException;
import com.capgemini.pecuniabank.service.LoanService;

public class Client
{
	
	public static void main(String args[])
	{
		LoanService loanService=new LoanService();
		
		ArrayList <LoanRequest> loanUsers=new ArrayList<LoanRequest>();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the request id");
		String loanRequestId=scanner.next();
		System.out.println("Enter the Account id");
		String accountId=scanner.next();

					System.out.println("check if the loanRequestid is present or not ");
		
				
				if(loanService.validateRequestId(loanRequestId)==true)
				{
					System.out.println("yes request id is valid");
					
					System.out.println("check if Accountid is present or not  ");
					
					if(loanService.validateAccountExits(accountId)==true)
					{
					
						System.out.println("yes,customer has account in the bank");
						System.out.println("Enter the customerId");
						String loanCustomerId=scanner.next();
						System.out.println("Enter the Ammount");
						double amount=scanner.nextDouble();
						System.out.println("Enter the type");
						String type=scanner.next();
						System.out.println("Enter the tenure");
						int tenure=scanner.nextInt();
						System.out.println("Enter the roi");
						double roi=scanner.nextDouble();
						System.out.println("Enter the status");
						String status=scanner.next();
						System.out.println("Enter the credit Score");
						int creditScore=scanner.nextInt();
						try {
							
							loanUsers.add(new LoanRequest(loanRequestId,loanCustomerId, amount, type, tenure, roi, status,loanService.calculateEmi(amount,tenure,roi),creditScore));
							System.out.println(loanService.createLoanRequest(loanRequestId,loanCustomerId, amount, type, tenure, roi, status,creditScore));
							
						} catch (InvalidDataException invalidDataException) 
						{
							// TODO Auto-generated catch block
							System.out.println(invalidDataException.getMessage());
						}
					
					}
					else
					{
						
						System.out.println("Account id is invalid");
					}
				
				}
				else
				{
		
					System.out.println("loanRequestId is invalid");
				}
			

	}
			

		
		
		
		
		
		
		
		
		
	}


