package com.capgemini.pecuniabank.dto;

import java.util.Date;

public class LoanDisbursed {
	private String loanRequestId;
	private String loanCustomerId;
	private String loanType;
	private double loanAmount;
	private double loan_amount_paid;
	private Date loan_due_date;
	private double loanEmi;
	private int tenure;

	
	public LoanDisbursed(String loanRequestId, String loanCustomerId, String loanType, double loanAmount,
			double loan_amount_paid, Date loan_due_date, double loanEmi, int tenure)
	{
	
		this.loanRequestId = loanRequestId;
		this.loanCustomerId = loanCustomerId;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.loan_amount_paid = loan_amount_paid;
		this.loan_due_date = loan_due_date;
		this.loanEmi = loanEmi;
		this.tenure = tenure;
	}

}