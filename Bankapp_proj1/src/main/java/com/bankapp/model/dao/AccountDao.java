package com.bankapp.model.dao;

import java.util.*;

public interface AccountDao {
	
	public List<Account> getAllAccounts();
	public Account getAccount(String username);
	public Account updateAccount(Account account);
	public Account delAccount(int accountId);
	public Account getAccountById(int account);
	public Account addAccount(Account account);
	

}
