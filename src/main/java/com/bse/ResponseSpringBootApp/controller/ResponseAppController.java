package com.bse.ResponseSpringBootApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bse.ResponseSpringBootApp.dto.EmployeeDto;
import com.bse.ResponseSpringBootApp.service.ResponseAppService;

@RestController
public class ResponseAppController {

	@Autowired
	private ResponseAppService responseAppService;
	
	@GetMapping("emplDetail/bse")
	public EmployeeDto getEmpDetails(@RequestParam("payGroup") String paygroup , @RequestHeader("company-id") String companyId)
	{
		return responseAppService.fetchEmp(paygroup);
	}
	
}
