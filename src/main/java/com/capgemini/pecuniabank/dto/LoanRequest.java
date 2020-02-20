package com.capgemini.pecuniabank.dto;

public class LoanRequest {
	private String loanRequestId;
	private String loanCustromerId;
	private double amount;
	private String type;
	private int tenure;
	private double roi;
	private String status;
	private double loanEmi;
	private int creditScore;
	public LoanRequest(String loanRequestId, String loanCustromerId, double amount, String type, int tenure, double roi,
			String status, double loanEmi, int creditScore)
	{
		//super();
		this.loanRequestId = loanRequestId;
		this.loanCustromerId = loanCustromerId;
		this.amount = amount;
		this.type = type;
		this.tenure = tenure;
		this.roi = roi;
		this.status = status;
		this.loanEmi = loanEmi;
		this.creditScore = creditScore;
	}
	public String getLoanRequestId() {
		return loanRequestId;
	}
	public void setLoanRequestId(String loanRequestId) {
		this.loanRequestId = loanRequestId;
	}
	public String getLoanCustromerId() {
		return loanCustromerId;
	}
	public void setLoanCustromerId(String loanCustromerId) {
		this.loanCustromerId = loanCustromerId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getLoanEmi() {
		return loanEmi;
	}
	public void setLoanEmi(double loanEmi) {
		this.loanEmi = loanEmi;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public String toString()
	{
		return "loan request id is: "+loanRequestId +","+ "loan customer id is: "+loanCustromerId+","+ "loan amount is: " +amount+","+ "loan type is: " +type+","+ "loan tenure is: " +tenure+","+ "loan roi is: " +roi+","+ "loan status is:" +status+","+ "calculated loan emi is: " +loanEmi+","+ "loan creditscore is: " +creditScore;
	}

}
