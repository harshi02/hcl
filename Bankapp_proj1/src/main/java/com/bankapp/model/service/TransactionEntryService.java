package com.bankapp.model.service;
import java.util.List;

import com.bankapp.model.dao.TransactionEntry;
import com.bankapp.model.dao.TxType;

public interface TransactionEntryService {
	public TransactionEntry addTransaction(String txInfo, Double amount, TxType txType);
	public List<TransactionEntry> getTransactionsById(int accountId);
}
