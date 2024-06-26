package com.example.addressApp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addressApp.entity.Address;
import com.example.addressApp.repository.AddressRepository;
import com.example.addressApp.responce.AddressResponce;

@Service
public class AddressService {

	@Autowired
	private AddressRepository repo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public AddressResponce findAddressByEmployeeId(int eid) {
		Address address = repo.findAddressByEmployeeId(eid);
		AddressResponce addressResponce = modelMapper.map(address, AddressResponce.class);
		return addressResponce;
		
	}
}
