package com.capgemini.pecuniabank.util;

import java.util.ArrayList;
import java.util.Date;

import com.capgemini.pecuniabank.dto.AccountManagement;

public class AccountManagementRepository {
	static ArrayList <AccountManagement> accountUsers=new ArrayList<AccountManagement>();
	public static ArrayList<AccountManagement> getAccountUsers() {
		return accountUsers;
	}
	
	public AccountManagementRepository()
	{
	accountUsers.add(new AccountManagement( "32828742093","Vishal2093","PUNBO339500","Current","Active",272000.00,3.00,new Date(2010,02,11)));
	accountUsers.add(new AccountManagement( "42986843021","Vishali3012","PUNBO339500","Savings","Active",89000.00,3.50,new Date(2020,01,29)));
	accountUsers.add(new AccountManagement( "43103298198","Amardeep8198","PUNBO339500","Current","Active",20000.00,3.50,new Date(2020,02,01)));
	accountUsers.add(new AccountManagement( "24390211847","Parnav1874","PUNBO339500","Current","Active",38000.00,3.00,new Date(2020,02,03)));
	accountUsers.add(new AccountManagement( "29874498714","Satyam8714","PUNBO339500","Savings","Active",5000.00,3.50,new Date(2020,02,03)));
	accountUsers.add(new AccountManagement( "39871498291","Prabhjot8291","PUNBO339500","Current","Closed",0.00,0.00,new Date(2020,02,12)));
	}
	

}
