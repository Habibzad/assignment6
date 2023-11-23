package com.meritamerica.service;

import com.meritamerica.exception.ExceedsCombinedBalanceLimitException;
import com.meritamerica.exception.InvalidArgumentException;
import com.meritamerica.exception.NoSuchAccountException;
import com.meritamerica.entity.CDAccount;
import com.meritamerica.entity.CheckingAccount;
import com.meritamerica.entity.SavingsAccount;

public interface AccountsService {

	public CheckingAccount addCheckingAccount(int id, CheckingAccount checkingAccount) 
			throws NoSuchAccountException,
			ExceedsCombinedBalanceLimitException,
			InvalidArgumentException;
	
	public SavingsAccount addSavingsAccount(int id, SavingsAccount savingsAccount) 
			throws NoSuchAccountException, 
			ExceedsCombinedBalanceLimitException, 
			InvalidArgumentException;

	public CDAccount addCDAccount(int id, CDAccount cdAccount) 
			throws NoSuchAccountException, 
			ExceedsCombinedBalanceLimitException, 
			InvalidArgumentException;
}
