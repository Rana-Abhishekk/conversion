package com.conversion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conversion.conversionDto.PickUp;
@RestController
@RequestMapping("convert")
public class ConversionController {

	@PostMapping("fetchDto")
	public PickUp getPickUp(@RequestBody PickUp pickUpDto) {
		return pickUpDto;
	}
}
