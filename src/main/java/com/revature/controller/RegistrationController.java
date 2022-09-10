package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Account;
import com.revature.services.AccountService;

@RestController
@RequestMapping(value="/registeruser")
public class RegistrationController {
	
	
	private AccountService accountService;
	
	
	@Autowired
	public RegistrationController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@PostMapping
	public ResponseEntity<Account> newUser(@RequestBody Account account){
		Account dbAccount = accountService.addOrUpdate(account);
		Account tempAccount = accountService.getAccountByUser(account.getUsername());
		
		if(tempAccount == null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(dbAccount);
		}else {
			return ResponseEntity.status(204).build();
		}
		
		
	}
}
