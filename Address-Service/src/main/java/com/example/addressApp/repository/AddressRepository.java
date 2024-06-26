package com.example.addressApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.addressApp.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	//Address Based on a Employee Id
	
	
	@Query(nativeQuery = true,value = "SELECT ea.id,ea.lane1,ea.lane2,ea.state,ea.zip,ea.empid FROM microservices.address ea join microservices.employee e on e.id=ea.empid where ea.empid = :employeeId")
	Address findAddressByEmployeeId(@Param("employeeId") int employeeId);

}
