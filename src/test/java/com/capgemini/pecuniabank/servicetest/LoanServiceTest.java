package com.capgemini.pecuniabank.servicetest;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.pecuniabank.dto.LoanRequest;
import com.capgemini.pecuniabank.exception.InvalidDataException;
import com.capgemini.pecuniabank.service.LoanService;

public class LoanServiceTest {
	LoanService ls=new LoanService();
	
	@Test
	public void createLoanRequestTest() throws InvalidDataException
	{
		assertEquals(ls.createLoanRequest("344334874373","Vishal2093",328248.00,"home loan",5,12.5,"not approved",750)," loan granted" );
	}
	//
	@Test
	public void createLoanRequestTest6() throws InvalidDataException
	{
		assertEquals(ls.createLoanRequest("344334874373","Vishal2093",328248.00,"home loan",5,12.5,"not approved",100),"low credit score not eligible for loan request" );
	}
	//
	@Test
	public void createLoanRequestTest2() 
	{
		LoanRequest lr=new LoanRequest("344334874373","Vishal2093",328248.00,"home loan",5,12.5,"not approved",436.0,750);
		Assert.assertEquals(ls.checkCreditScore(lr),true);
	}
	//
	@Test
	public void createLoanRequestTest3() 
	{
		LoanRequest lr=new LoanRequest("344334874373","Vishal2093",328248.00,"home loan",5,12.5,"not approved",436.0,250);
		Assert.assertEquals(ls.checkCreditScore(lr),false);
	}
	//
	@Test
	public void createLoanRequestTest4() 
	{
		
		Assert.assertEquals(ls.validateRequestId("12121122121556000"),false);
	}
    //
	@Test
	public void createLoanRequestTest5() 
	{
		
		Assert.assertEquals(ls.validateRequestId("121211221215"),true);
	}
	@Test
	public void createLoanRequestTest7() 
	{
		
		Assert.assertEquals(ls.getCustomerRow("Amar43"),"Amar43");
	}
	//
	@Test
	public void createLoanRequestTest8() 
	{
		
		Assert.assertEquals(ls.validateAccountExits("32828742093"),true);
	}
	//
	@Test
	public void createLoanRequestTest9() 
	{
		
		Assert.assertEquals(ls.validateAccountExits("3282874209"),false);
	}
	//
	@Test
	public void createLoanRequestTest10() 
	{
		
		Assert.assertEquals(ls.validateAccountExits("32828742093"),true);
	}
	


}
