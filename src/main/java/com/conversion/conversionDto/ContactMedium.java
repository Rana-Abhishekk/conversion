package com.conversion.conversionDto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

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
public class ContactMedium {
	@javax.persistence.Id
	String mediumType;
	@OneToOne
	Characteristics characteristics;
	
}
