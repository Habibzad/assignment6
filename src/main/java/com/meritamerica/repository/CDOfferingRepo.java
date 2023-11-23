package com.meritamerica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meritamerica.entity.CDOffering;

@Repository
public interface CDOfferingRepo extends JpaRepository<CDOffering, Integer> {

}
