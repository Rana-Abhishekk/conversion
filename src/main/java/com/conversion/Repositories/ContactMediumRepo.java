package com.conversion.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conversion.conversionDto.ContactMedium;

public interface ContactMediumRepo extends JpaRepository<ContactMedium, String>{

}
