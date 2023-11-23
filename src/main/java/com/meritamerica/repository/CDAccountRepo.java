package com.meritamerica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.entity.CDAccount;

public interface CDAccountRepo extends JpaRepository<CDAccount, Integer> {

}
