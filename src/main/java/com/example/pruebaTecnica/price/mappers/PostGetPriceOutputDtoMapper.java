package com.example.pruebaTecnica.price.mappers;

import org.springframework.stereotype.Component;

import com.example.pruebaTecnica.price.dtos.PostPricesGetOutputDto;
import com.example.pruebaTecnica.price.model.Price;

@Component
public class PostGetPriceOutputDtoMapper {

	public PostPricesGetOutputDto toDto(Price entity) {
		PostPricesGetOutputDto dto = new PostPricesGetOutputDto();
		if (entity  != null) {
			if (entity.getBrandId()  != null) {
				dto.setBrandId(entity.getBrandId());				
			}
			if (entity.getProductId()  != null) {
				dto.setProducyId(entity.getProductId());				
			}
			if (entity.getStartDate()  != null) {
				dto.setStartDate(entity.getStartDate());				
			}
			if (entity.getEndDate()  != null) {
				dto.setEndDate(entity.getEndDate());				
			}
			if (entity.getPriceList()  != null) {
				dto.setPriceList(entity.getPriceList());				
			}
			if (entity.getPrice()  != null) {
				dto.setPrice(entity.getPrice());				
			}
		}
		return dto;
	}
}
