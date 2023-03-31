package com.conversion.conversionDto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

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
public class Location {
	@javax.persistence.Id
	String id;
	String familyName;
	String givenname;
	String location;
	@OneToMany
	List<ContactMedium> contactMediumList;
	@OneToMany
	List<PartyCharacteristics> partyCharacteristics;

}
