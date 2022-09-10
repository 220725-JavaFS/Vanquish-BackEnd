package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Account;

public interface AccountRepo extends JpaRepository<Account, Integer> {

}
