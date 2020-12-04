package com.bankapp.model.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.dao.Account;
import com.bankapp.model.dao.AccountDao;
import com.bankapp.model.dao.TransactionEntryDao;
import com.bankapp.model.dao.TxType;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService{

	private AccountDao accountDao;
	public TransactionEntryDao transactionEntryDao;
	private TransactionEntryService transactionEntryService;
	
	@Autowired
	public AccountServiceImpl(AccountDao accountDao, TransactionEntryDao transactionEntryDao,
			TransactionEntryService transactionEntryService) {
		this.accountDao = accountDao;
		this.transactionEntryDao = transactionEntryDao;
		this.transactionEntryService = transactionEntryService;
	}

	@Override
	public List<Account> getAllAccounts() {
		return accountDao.getAllAccounts();
	}


	@Override
	public void deposit(int accountId, double amount) {
		Account account = accountDao.getAccountById(accountId);
		account.setBalance(account.getBalance() + amount);
		accountDao.updateAccount(account);
		account.setTransactionEntry(transactionEntryDao.getTransactionsById(accountId));
		transactionEntryService.addTransaction("deposit to " + accountId , amount, TxType.DEPOSIT);
	}

	@Override
	public void withdraw(int accountId, double amount) {
		Account account = accountDao.getAccountById(accountId);
		account.setBalance(account.getBalance() - amount);
		accountDao.updateAccount(account);
		account.setTransactionEntry(transactionEntryDao.getTransactionsById(accountId));
		transactionEntryService.addTransaction("withdraw from " + accountId , amount, TxType.WITHDRAW);
	}

	@Override
	public void transfer(int fromAccountId, int toAccountId, double amount) {
		withdraw(fromAccountId, amount);
		deposit(toAccountId, amount);
		transactionEntryService.addTransaction("Transfer from " + fromAccountId , amount, TxType.TRANSFER);
		
	}

	@Override
	public Account updateAccount(Account account) {
		Account accountToBeUpdated = accountDao.getAccountById(account.getAccountId());
		accountToBeUpdated.setEmail(account.getEmail());
		accountToBeUpdated.setPhone(account.getPhone());
		accountToBeUpdated.setAddress(account.getAddress());
		accountDao.updateAccount(accountToBeUpdated);
		
		return accountToBeUpdated;
	}

	@Override
	public Account deleteAccount(int accountId) {
		return accountDao.delAccount(accountId);
	}

	@Override
	public Account getAccountById(int accountId) {
		return accountDao.getAccountById(accountId);
	}

	@Override
	public Account addAccount(Account account) {
		return accountDao.addAccount(account);
	}

	@Override
	public boolean isCustomerExist(String username) {
		boolean isValidUser = false;
		List<Account> accounts = accountDao.getAllAccounts();
		for(Account account : accounts) {
			if(account.getName().equals(username)) {
				isValidUser = true;
			}
		}
		return isValidUser;
	}

	@Override
	public Account getAccount(String username) {
		return accountDao.getAccount(username);
	}
}

