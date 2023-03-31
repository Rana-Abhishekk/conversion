package com.conversion.conversionDto;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Characteristics {
 @javax.persistence.Id
 String emailAddress;
 String contactType;
 String phoneNumber;
 String city;
 String country;
 String postcode;
 String street1;
 String street2;
 String street3;
 
 
}
