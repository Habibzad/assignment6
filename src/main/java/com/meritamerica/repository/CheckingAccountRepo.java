package com.meritamerica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meritamerica.entity.CheckingAccount;

@Repository
public interface CheckingAccountRepo extends JpaRepository<CheckingAccount, Integer> {

}
