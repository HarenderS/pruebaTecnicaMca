package com.example.pruebaTecnica.price.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PostPricesGetInputDto {

	@JsonProperty("BRAND_ID")
	private Long brandId;
	
	@JsonProperty("PRODUCT_ID")
	private Long productId;
	
	@JsonProperty("date")
	private String date;
}
