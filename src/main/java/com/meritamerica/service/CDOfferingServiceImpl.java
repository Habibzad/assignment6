package com.meritamerica.service;

import java.util.List;

import com.meritamerica.exception.InvalidArgumentException;
import com.meritamerica.repository.CDOfferingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meritamerica.entity.CDOffering;

@Service
public class CDOfferingServiceImpl implements CDOfferingService {
	@Autowired
	private CDOfferingRepo cdOfferingRepo;
	
	@Override
	public CDOffering addCDOffering(CDOffering cdOffering) throws InvalidArgumentException {
		if (cdOffering.getInterestRate() <= 0 || cdOffering.getInterestRate() >= 1 || cdOffering.getTerm() < 1) {
			throw new InvalidArgumentException("Invalid Term or Interest Rate");
		}
		return cdOfferingRepo.save(cdOffering);
	}

	@Override
	public List<CDOffering> getCDOfferings() {
		return cdOfferingRepo.findAll();
	}
}
