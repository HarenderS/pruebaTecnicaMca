package com.example.pruebaTecnica.price.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Price {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonProperty("BRAND_ID")
	private Long brandId;  
	
	@JsonProperty("START_DATE")
	private LocalDateTime startDate;
	
	@JsonProperty("END_DATE")
	private LocalDateTime endDate;
	
	@JsonProperty("PRICE_LIST")
	private Long priceList;
	
	@JsonProperty("PRODUCT_ID")
	private Long productId;
	
	@JsonProperty("PRIORITY")
	private Integer priority;
	
	@JsonProperty("PRICE")
	private Double price;
	
	@JsonProperty("CURR")
	private String curr;

	public Price(Long brandId, LocalDateTime startDate, LocalDateTime endDate, Long priceList, Long productId,
			Integer priority, Double price, String curr) {
		super();
		this.brandId = brandId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priceList = priceList;
		this.productId = productId;
		this.priority = priority;
		this.price = price;
		this.curr = curr;
	}

}
