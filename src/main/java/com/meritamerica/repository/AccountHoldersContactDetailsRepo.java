package com.meritamerica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meritamerica.entity.AccountHoldersContactDetails;

@Repository
public interface AccountHoldersContactDetailsRepo extends JpaRepository<AccountHoldersContactDetails, Integer> {

}
