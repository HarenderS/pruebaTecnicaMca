package com.example.pruebaTecnica.price.serviceImpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pruebaTecnica.price.dtos.PostPricesGetInputDto;
import com.example.pruebaTecnica.price.dtos.PostPricesGetOutputDto;
import com.example.pruebaTecnica.price.mappers.PostGetPriceOutputDtoMapper;
import com.example.pruebaTecnica.price.model.Price;
import com.example.pruebaTecnica.price.repository.PriceRepository;
import com.example.pruebaTecnica.price.service.PriceService;

@Service
public class PriceServiceImpl implements PriceService {

	@Autowired
	private PriceRepository priceRepository;

	@Autowired
	private PostGetPriceOutputDtoMapper postGetPriceOutputDtoMapper;

	@PostConstruct
	public void init() {
		priceRepository.save(new Price(1L,
				LocalDateTime.parse("2020-06-14-00.00.00", DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss")),
				LocalDateTime.parse("2020-12-31-23.59.59", DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss")), 1L,
				35455L, 0, 35.50, "EUR"));
		priceRepository.save(new Price(1L,
				LocalDateTime.parse("2020-06-14-15.00.00", DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss")),
				LocalDateTime.parse("2020-06-14-18.30.00", DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss")), 2L,
				35455L, 1, 25.45, "EUR"));
		priceRepository.save(new Price(1L,
				LocalDateTime.parse("2020-06-15-00.00.00", DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss")),
				LocalDateTime.parse("2020-06-15-11.00.00", DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss")), 3L,
				35455L, 1, 30.50, "EUR"));
		priceRepository.save(new Price(1L,
				LocalDateTime.parse("2020-06-15-16.00.00", DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss")),
				LocalDateTime.parse("2020-12-31-23.59.59", DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss")), 4L,
				35455L, 1, 38.95, "EUR"));
	}

	@Override
	public PostPricesGetOutputDto find(PostPricesGetInputDto inputDto) {
		Optional<Price> price = priceRepository.findFirstByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(
		inputDto.getProducyId(), inputDto.getBrandId(),
		LocalDateTime.parse(inputDto.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss")),
		LocalDateTime.parse(inputDto.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss")));

		if (price.isPresent()) {
			return this.postGetPriceOutputDtoMapper.toDto(price.get());
		} else {
			return null;
		}
	}
}
