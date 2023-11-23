package com.meritamerica.service;

import java.util.List;

import com.meritamerica.exception.InvalidArgumentException;
import com.meritamerica.entity.CDOffering;

public interface CDOfferingService {
	
	public CDOffering addCDOffering(CDOffering cdOffering) throws InvalidArgumentException;

	public List<CDOffering> getCDOfferings();
	
}
