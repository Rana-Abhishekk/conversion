package com.conversion.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conversion.conversionDto.Characteristics;
@Repository
public interface CharacteristicsRepo extends JpaRepository<Characteristics, String>{

}
  