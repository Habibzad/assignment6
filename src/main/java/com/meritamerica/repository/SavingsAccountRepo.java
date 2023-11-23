package com.meritamerica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.entity.SavingsAccount;

public interface SavingsAccountRepo extends JpaRepository<SavingsAccount, Integer> {

}
