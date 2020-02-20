package com.capgemini.pecuniabank.service;

import com.capgemini.pecuniabank.exception.InvalidDataException;

public interface LoanServiceInterface {
	public String createLoanRequest(String loanRequestId,String loanCustomerId2, double loanAmount2, String loanType2, int tenure, double loanRoi, String loanStatus2,int creditScore) throws InvalidDataException;

}
