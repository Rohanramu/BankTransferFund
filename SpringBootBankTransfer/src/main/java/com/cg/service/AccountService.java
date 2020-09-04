package com.cg.service;

import java.util.List;

import com.cg.dto.TransferFundForm;
import com.cg.entity.Account;
import com.cg.exceptions.AccountException;
import com.cg.exceptions.BalanceException;
import com.cg.exceptions.CustomerException;
import com.cg.exceptions.TransactionException;


public interface AccountService {
	

	
	public String transferFund(TransferFundForm form) throws AccountException, BalanceException, TransactionException;
}
