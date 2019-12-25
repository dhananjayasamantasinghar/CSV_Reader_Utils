package com.comparator.tool;

import java.util.List;
import java.util.stream.Collectors;

import com.comparator.domain.Account;
import com.comparator.util.CommonUtils;

public class ToolApplication {

	public static void main(String[] args) throws Exception {
		//String path = "./templates/POA.csv";
		
		String path = "C:\\Users\\Dhananjay Samanta\\Desktop" 
				+ "\\CSV-Read-Example-master\\CSV-Read-Example-master"
				+ "\\src\\main\\resources\\templates\\POA.csv";

		List<Account> accountDetailsList = CommonUtils.extractAccountDetails(path);

		List<String> accountList = accountDetailsList.stream()
				.map(Account::getAccNo)
				.collect(Collectors.toList());

		List<String> encodedAccountList = CommonUtils.getEncodedAccountList(accountList);
		
		System.out.println(accountDetailsList);
		System.out.println("Account List: " + accountList);
		System.out.println("Encoded Account List: " + encodedAccountList);
		
		
		

	}

}
