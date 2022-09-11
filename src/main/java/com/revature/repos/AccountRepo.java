package com.revature.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Account;

public interface AccountRepo extends JpaRepository<Account, Integer> {
	
	Optional<Account> findByUsername(String username);
}
