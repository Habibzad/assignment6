package com.meritamerica.service;

import java.util.List;

import com.meritamerica.exception.InvalidArgumentException;
import com.meritamerica.entity.AccountHolder;
import com.meritamerica.entity.AccountHoldersContactDetails;
import com.meritamerica.entity.CDAccount;
import com.meritamerica.entity.CheckingAccount;
import com.meritamerica.entity.SavingsAccount;

public interface AccountHolderService {
	public AccountHolder addAccountHolder(AccountHolder accountHolder);
	public AccountHolder getAccountHolder(int id);
	public List<AccountHolder> getAccountHolders();
	public List<CheckingAccount> getCheckingAccounts(int id) throws InvalidArgumentException;
	public List<SavingsAccount> getSavingsAccounts(int id);
	public List<CDAccount> getCDAccounts(int id);
	public AccountHoldersContactDetails addContactDetails(int id, AccountHoldersContactDetails contactDetails);
}
