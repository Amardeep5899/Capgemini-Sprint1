package com.capgemini.pecuniabank.servicetest;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.pecuniabank.dto.LoanRequest;
import com.capgemini.pecuniabank.exception.InvalidDataException;
import com.capgemini.pecuniabank.service.LoanService;

public class LoanServiceTest {
	LoanService loanService=new LoanService();
	
	@Test
	public void createLoanRequestTest1() 
	{
		try {
			loanService.createLoanRequest("344334874373","Vishal2093",328248.00,"home loan",5,12.5,"not approved",750);
		} catch (InvalidDataException invalidDataException) {
			// TODO Auto-generated catch block
			assertEquals(invalidDataException.getMessage(),"Loan request is invalid");
			
		}
	}
	
	@Test
	public void createLoanRequestTest2() 
	{
		LoanRequest loanRequest=new LoanRequest("344334874373","Vishal2093",328248.00,"home loan",5,12.5,"not approved",436.0,750);
		Assert.assertEquals(loanService.checkCreditScore(loanRequest),true);
	}
	//
	@Test
	public void createLoanRequestTest3() 
	{
		LoanRequest loanRequest=new LoanRequest("344334874373","Vishal2093",328248.00,"home loan",5,12.5,"not approved",436.0,250);
		Assert.assertEquals(loanService.checkCreditScore(loanRequest),false);
	}
	//
	@Test
	public void createLoanRequestTest4() 
	{
		
		Assert.assertEquals(loanService.validateRequestId("12121122121556000"),false);
	}
    //
	@Test
	public void createLoanRequestTest5() 
	{
		
		Assert.assertEquals(loanService.validateRequestId("121211221215"),true);
	}

	@Test
	public void createLoanRequestTest6() 
	{
		
		Assert.assertEquals(loanService.validateAccountExits("32828742093"),true);
	}
	//
	@Test
	public void createLoanRequestTest7() 
	{
		
		Assert.assertEquals(loanService.validateAccountExits("3282874209"),false);
	}
	//
	@Test
	public void createLoanRequestTest8() 
	{
		
		Assert.assertEquals(loanService.validateAccountExits("32828742093"),true);
	}
	//
	@Test
	public void createLoanRequestTest9() 
	{
		
		try {
			loanService.validateData("344334874373","Vishal20",328248.00,"home",5,12.5,"not_approved",750);
		} catch (InvalidDataException invalidDataException) {
			// TODO Auto-generated catch block
			assertEquals(invalidDataException.getMessage(),true);
		}
	}
	//
	@Test
	public void createLoanRequestTest10() 
	{
		
		try {
		loanService.validateData("344334874373","Vishal20",32824.00,"home",5,12.5,"not approved",750);
		} catch (InvalidDataException invalidDataException) {
			// TODO Auto-generated catch block
			assertEquals(invalidDataException.getMessage(),"status is invalid");
		}
	}
	//
	@Test
	public void createLoanRequestTest11() 
	{
		try
		{
			loanService.createLoanRequest("344334874373","Vishal20",328248.00,"home",5,12.5,"not_approved",750);
		} catch(InvalidDataException invalidDataException) {
		assertEquals(invalidDataException.getMessage(),"loan request id is: 344334874373,loan customer id is: Vishal20,loan amount is: 328248.0,loan type is: home,loan tenure is: 5,loan roi is: 12.5,loan status is:approved,calculated loan emi is: 7384.903226616261,loan creditscore is: 750");
	}
	
	}

}
