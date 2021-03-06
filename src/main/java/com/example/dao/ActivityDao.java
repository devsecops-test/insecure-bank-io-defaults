package com.example.dao;

import java.util.Date;
import java.util.List;

import com.example.bean.Transaction;

public interface ActivityDao {

	List<Transaction> findTransactionsByCashAccountNumber(String number);
	
	List<Transaction> findTransactionsByCustomerName(String customerName);

	void insertNewActivity(Date date, String description, String number, double amount, double availablebalance);

}
