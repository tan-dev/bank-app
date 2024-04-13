package com.dummybank.bankapp.service;

import com.dummybank.bankapp.dto.AccountDto;

public interface AccountService {
	
	AccountDto createAccount(AccountDto accountDto);
	
	AccountDto getAccountById(long id);

}
