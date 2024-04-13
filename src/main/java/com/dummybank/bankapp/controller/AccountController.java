package com.dummybank.bankapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dummybank.bankapp.dto.AccountDto;
import com.dummybank.bankapp.service.AccountService;


@RestController
@RequestMapping("api/accounts")
public class AccountController {

	private AccountService accountService;

	public AccountController(AccountService accountService) {
//		super();
		this.accountService = accountService;
	}
	
	//Add account POST REST API
	@PostMapping
	public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
		return new ResponseEntity<>(accountService.createAccount(accountDto), 
				HttpStatus.CREATED);
	}
	
	//Get account GET REST API
	@GetMapping("/{id}")
	public ResponseEntity<AccountDto> getAccountById(@PathVariable long id){
		AccountDto accountDto = accountService.getAccountById(id);
		return ResponseEntity.ok(accountDto);
	}
	
}


