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
public class PartyCharacteristics {
	@javax.persistence.Id
	String name;
	String valueType;
	String value;
}
