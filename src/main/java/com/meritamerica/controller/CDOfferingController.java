package com.meritamerica.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.meritamerica.exception.InvalidArgumentException;
import com.meritamerica.entity.CDOffering;
import com.meritamerica.service.CDOfferingService;

@RestController
public class CDOfferingController {
	Logger logger = LoggerFactory.getLogger(AccountsController.class);

	@Autowired
	private CDOfferingService cdOfferingService;

	@PostMapping("/CDOfferings")
	@ResponseStatus(HttpStatus.CREATED)
	public CDOffering addCDOffering(@RequestBody CDOffering cdOffering) throws InvalidArgumentException {
		logger.debug("Add new CD Offering\n"+cdOffering);
		return cdOfferingService.addCDOffering(cdOffering);
	}

	@GetMapping("/CDOfferings")
	public List<CDOffering> getCDOfferings() {
		logger.debug("Return list of CD offerings");
		return cdOfferingService.getCDOfferings();
	}
}
