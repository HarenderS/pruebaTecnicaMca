package com.example.pruebaTecnica.price.dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PostPricesGetOutputDto {

	@JsonProperty("BRAND_ID")
	private Long brandId;
	
	@JsonProperty("PRODUCT_ID")
	private Long producyId;
	
	@JsonProperty("PRICE_LIST")
	private Long priceList;
	
	@JsonProperty("START_DATE")
	private LocalDateTime startDate;
	
	@JsonProperty("END_DATE")
	private LocalDateTime endDate;
	
	@JsonProperty("PRICE")
	private Double price;
}
