package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Account;
import com.revature.services.AccountService;

@RestController
@RequestMapping(value="/profile")
@CrossOrigin("*")
public class ProfileController {

	private AccountService accountService;
	
	@Autowired
	public ProfileController(AccountService accountService) {
		this.accountService = accountService;
	}

	@GetMapping(value="/{username}")
	public ResponseEntity<Account> getAccount(@PathVariable String username){
		Account account = accountService.getAccountByUser(username);
		return ResponseEntity.status(HttpStatus.OK).body(account);
	}
	
	@PutMapping(value="/{username}")
	public ResponseEntity<Account> addOrUpdate(@RequestBody Account account) {
//		System.out.println(account.getUsername());
//		System.out.println(account.getCity());
		Account tempAccount = accountService.getAccountByUser(account.getUsername());
		tempAccount.setCity(account.getCity());
		tempAccount.setSilver(account.getSilver());
		tempAccount.setCharacter(account.getCharacter());
//		account.setUserPwd(tempAccount.getUserPwd());
		accountService.addOrUpdate(tempAccount);
		return ResponseEntity.status(HttpStatus.OK).body(tempAccount);
	}
	
	@GetMapping
	public ResponseEntity<List<Account>> getAll() {
		return ResponseEntity.status(HttpStatus.OK).body(accountService.findAllAccounts());
	}
}


