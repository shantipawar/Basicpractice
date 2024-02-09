package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Company;
import com.nt.model.Customer;

@RestController

public class CustomerOperationController {
@GetMapping("/report1")
public ResponseEntity<Customer>showData1(){
	Customer cust=new Customer(1001,"raj",5522.42f,new String[] {"red","blue","green"},
			List.of("10", "10+2","btech"),
			Set.of(996005936L,7589642L,69547821L),
			Map.of("aadhar",3524689L,"pan no",3564218L),
			new Company("Samsung","hyd","Electronics",4000)); 
	HttpStatus status=HttpStatus.OK;
	return new ResponseEntity<Customer>(cust,status);
}
}
