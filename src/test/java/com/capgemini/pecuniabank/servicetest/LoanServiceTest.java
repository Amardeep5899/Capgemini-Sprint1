package com.capgemini.pecuniabank.servicetest;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.pecuniabank.exception.InvalidDataException;
import com.capgemini.pecuniabank.service.LoanService;

public class LoanServiceTest {
	LoanService ls=new LoanService();
	@Test
	public void createLoanRequestTest() throws InvalidDataException
	{
		Assert.assertEquals(ls.createLoanRequest("34433487437",328248.00,  "home loan", 5,12.5,"Current")," loan granted" );
	}

}
