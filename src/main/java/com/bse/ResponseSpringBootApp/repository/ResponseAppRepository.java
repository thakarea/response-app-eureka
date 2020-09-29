package com.bse.ResponseSpringBootApp.repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.bse.ResponseSpringBootApp.dto.EmployeeDto;

@Repository
public class ResponseAppRepository {

	public List<EmployeeDto> getEmpFromList(String paygroup) {
		
		List<EmployeeDto> list = Collections.unmodifiableList(Arrays.asList(new EmployeeDto(101, "Abc", "Pune", "FDY"),
				new EmployeeDto(102, "DEF", "Pune", "GD1"), new EmployeeDto(103, "XYZ", "Pune", "ET1"),
				new EmployeeDto(104, "MNO", "Pune", "21E"), new EmployeeDto(105, "PQR", "Pune", "FQW")));
		
		return list.stream().filter(emp -> emp.getPaygroup().equals(paygroup)).collect(Collectors.toList());
	}

}
