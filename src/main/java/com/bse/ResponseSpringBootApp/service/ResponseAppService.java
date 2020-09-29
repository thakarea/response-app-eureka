package com.bse.ResponseSpringBootApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bse.ResponseSpringBootApp.dto.EmployeeDto;
import com.bse.ResponseSpringBootApp.repository.ResponseAppRepository;

@Service
public class ResponseAppService {
	
	@Autowired
	private ResponseAppRepository responseAppRepo;
	
	public EmployeeDto fetchEmp(String paygroup)
	{
		List<EmployeeDto> empList = responseAppRepo.getEmpFromList(paygroup);
		return empList.get(0);
	}

}
