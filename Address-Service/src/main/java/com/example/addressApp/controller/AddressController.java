package com.example.addressApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.addressApp.responce.AddressResponce;
import com.example.addressApp.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService service;

	@GetMapping("address/{employeeId}")
	public ResponseEntity<AddressResponce> getAddressByEmployeeId(@PathVariable("employeeId") int id) {
	
		AddressResponce addressResponce=null;
		
		addressResponce  = service.findAddressByEmployeeId(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(addressResponce);
		
	}
}
