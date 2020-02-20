package com.capgemini.pecuniabank.dto;

import java.util.Date;

public class AccountManagement {
private String accountId;
private String accountHolderId;
private String accountBranchId;
private String accountType;
private String accountStatus;
private Double accountBalance;
private Double accountInterest;
private Date lastUpdated;
public String getAccountId() 
{
	return accountId;
}

public AccountManagement(String accountId, String accountHolderId, String accountBranchId, String accountType,
String accountStatus, Double accountBalance, Double accountInterest, Date lastUpdated) 
{
	this.accountId = accountId;
	this.accountHolderId = accountHolderId;
	this.accountBranchId = accountBranchId;
	this.accountType = accountType;
	this.accountStatus = accountStatus;
	this.accountBalance = accountBalance;
	this.accountInterest = accountInterest;
	this.lastUpdated = lastUpdated;
}


}

