package com.dummybank.bankapp.service.impl;

import org.springframework.stereotype.Service;

import com.dummybank.bankapp.dto.AccountDto;
import com.dummybank.bankapp.entity.Account;
import com.dummybank.bankapp.mapper.AccountMapper;
import com.dummybank.bankapp.repository.AccountRepository;
import com.dummybank.bankapp.service.*;


@Service
public class AccountServiceImpl implements AccountService{

	
	private AccountRepository accountRepository;
	
	
	
	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}



	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		
		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
		
	}



	@Override
	public AccountDto getAccountById(long id) {
		Account account = accountRepository
				.findById(id)
				.orElseThrow(() -> new RuntimeException("Account Does not Exist !"));
		return AccountMapper.mapToAccountDto(account);
	}

}
