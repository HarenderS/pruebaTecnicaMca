package com.example.pruebaTecnica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pruebaTecnica.price.dtos.PostPricesGetInputDto;
import com.example.pruebaTecnica.price.dtos.PostPricesGetOutputDto;
import com.example.pruebaTecnica.price.service.PriceService;

@RestController
@RequestMapping("/prices")
public class PriceController {

	@Autowired
	private PriceService priceService;

	@PostMapping("/get")
	public ResponseEntity<PostPricesGetOutputDto> getPost(@RequestBody PostPricesGetInputDto inputDto) {

		PostPricesGetOutputDto post = priceService.find(inputDto);

		if (post != null) {
			return ResponseEntity.ok(post);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}
