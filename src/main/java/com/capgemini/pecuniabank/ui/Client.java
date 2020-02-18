package com.capgemini.pecuniabank.ui;

import java.util.Scanner;

import com.capgemini.pecuniabank.dao.LoanDisbursedDao;
import com.capgemini.pecuniabank.dto.AccountManagement;
import com.capgemini.pecuniabank.exception.InvalidDataException;
import com.capgemini.pecuniabank.service.LoanService;

public class Client {
	
	public static void main(String args[])
	{
		LoanService ls=new LoanService();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the customer id");
		String loanCustomerId=sc.next();
		System.out.println("Enter the Account id");
		String accountId=sc.next();
	
		int choice;
		System.out.println("enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				{
					System.out.println("check if the loancustomerid is present or not ");
		
				try 
				{
				//if(ls.validateCustomerId(loanCustomerId)==true)
				//{
					System.out.println("yes it is found");
					
					System.out.println("check if Accountid is present or not ");
					
					if(ls.validateAccountExits(accountId)==true)
					{
					
						System.out.println("yes it is found");
						System.out.println(ls.createLoanRequest("34433487437",328248.00,  "home loan", 5,12.5,"Current"));
						 
					}
					else
					{
						throw new InvalidDataException("Account id not found");
					}
					}catch(InvalidDataException e)
					{
						System.out.println(e);
					}
				
				//}
				/*else
				{
					throw new InvalidDataException("Customber id not found");
				}
				}catch(InvalidDataException e)
				{
					System.out.println(e);
				}*/
				}
				break;
			
		}
		
		
		
		
		
		
		
		
		
	}

}
