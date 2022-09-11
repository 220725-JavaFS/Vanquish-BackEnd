package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Account;
import com.revature.services.AccountService;

@RestController
@RequestMapping(value="/login")
@CrossOrigin("*")
public class LoginController {
	
	private AccountService accountService;

	@Autowired
	public LoginController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}

	@PostMapping
	public ResponseEntity<Account> getAccount(@RequestBody Account account){
		String userPwd = account.getUserPwd();
		Account userAccount = accountService.getAccountByUser(account.getUsername());
		
		if(userAccount != null && userAccount.getUserPwd().equals(userPwd)) {
			return ResponseEntity.status(HttpStatus.OK).body(userAccount);
		}else {
			return ResponseEntity.status(204).build();
		}
	}
	
}
