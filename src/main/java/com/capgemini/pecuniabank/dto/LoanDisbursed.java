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
			double loan_amount_paid, Date loan_due_date, double loanEmi, int tenure) {
		//super();
		this.loanRequestId = loanRequestId;
		this.loanCustomerId = loanCustomerId;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.loan_amount_paid = loan_amount_paid;
		this.loan_due_date = loan_due_date;
		this.loanEmi = loanEmi;
		this.tenure = tenure;
	}
	public String getLoanRequestId() {
		return loanRequestId;
	}
	public void setLoanRequestId(String loanRequestId) {
		this.loanRequestId = loanRequestId;
	}
	public String getLoanCustomerId() {
		return loanCustomerId;
	}
	public void setLoanCustomerId(String loanCustomerId) {
		this.loanCustomerId = loanCustomerId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getLoan_amount_paid() {
		return loan_amount_paid;
	}
	public void setLoan_amount_paid(double loan_amount_paid) {
		this.loan_amount_paid = loan_amount_paid;
	}
	public Date getLoan_due_date() {
		return loan_due_date;
	}
	public void setLoan_due_date(Date loan_due_date) {
		this.loan_due_date = loan_due_date;
	}
	public double getLoanEmi() {
		return loanEmi;
	}
	public void setLoanEmi(double loanEmi) {
		this.loanEmi = loanEmi;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

}
