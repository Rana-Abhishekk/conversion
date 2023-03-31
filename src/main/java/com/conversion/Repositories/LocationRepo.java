package com.conversion.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conversion.conversionDto.Location;

public interface LocationRepo extends JpaRepository<Location, String>{

}
