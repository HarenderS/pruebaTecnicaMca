package com.example.pruebaTecnica.price.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PostPricesGetInputDto {

	@JsonProperty("BRAND_ID")
	private Long brandId;
	
	@JsonProperty("PRODUCT_ID")
	private Long producyId;
	
	@JsonProperty("date")
	private String date;
}
