package com.conversion.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conversion.conversionDto.PickUp;

public interface PickRepo extends JpaRepository<PickUp, String>{

}  
