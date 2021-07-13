package com.ctli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

	@Autowired
	Configuration config;
	
@GetMapping(value="/limit")
Limit getLimit() {
	return new Limit(config.getMaximum(),config.getMinimum());
}
}
