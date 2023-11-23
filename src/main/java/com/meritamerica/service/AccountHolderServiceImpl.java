package com.meritamerica.service;

import java.util.List;

import com.meritamerica.exception.InvalidArgumentException;
import com.meritamerica.repository.AccountHolderRepo;
import com.meritamerica.repository.AccountHoldersContactDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meritamerica.entity.AccountHolder;
import com.meritamerica.entity.AccountHoldersContactDetails;
import com.meritamerica.entity.CDAccount;
import com.meritamerica.entity.CheckingAccount;
import com.meritamerica.entity.SavingsAccount;

@Service
public class AccountHolderServiceImpl implements AccountHolderService {

	private final AccountHolderRepo accountHolderDao;
	private final AccountHoldersContactDetailsRepo contactDetailsDao;

	@Autowired
	public AccountHolderServiceImpl(AccountHolderRepo accountHolderDao, AccountHoldersContactDetailsRepo contactDetailsDao) {
		this.accountHolderDao = accountHolderDao;
		this.contactDetailsDao = contactDetailsDao;
	}

	@Override
	public AccountHolder addAccountHolder(AccountHolder accountHolder) {
		return accountHolderDao.save(accountHolder);
	}

	@Override
	public List<AccountHolder> getAccountHolders() {
		return accountHolderDao.findAll();
	}

	@Override
	public AccountHolder getAccountHolder(int id) {
		return accountHolderDao.getOne(id);
	}

	@Override
	public List<CheckingAccount> getCheckingAccounts(int id) throws InvalidArgumentException {
		if(accountHolderDao.existsById(id)) {
			AccountHolder accountHolder = accountHolderDao.getOne(id);
			return accountHolder.getCheckingAccounts();
		}
		throw new InvalidArgumentException("No such account holder exist");
	}

	@Override
	public List<SavingsAccount> getSavingsAccounts(int id) {
		AccountHolder accountHolder = accountHolderDao.getOne(id);
		return accountHolder.getSavingsAccounts();
	}

	@Override
	public List<CDAccount> getCDAccounts(int id) {
		AccountHolder accountHolder = accountHolderDao.getOne(id);
		return accountHolder.getCdAccounts();
	}

	@Override
	public AccountHoldersContactDetails addContactDetails(int id, AccountHoldersContactDetails contactDetails) {
		AccountHolder accountHolder = accountHolderDao.getOne(id);
		contactDetails.setAccountHolder(accountHolder);
		contactDetailsDao.save(contactDetails);
		return contactDetails;
	}
	

}
