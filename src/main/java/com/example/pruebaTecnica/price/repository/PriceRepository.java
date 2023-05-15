package com.example.pruebaTecnica.price.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pruebaTecnica.price.model.Price;

public interface PriceRepository extends JpaRepository<Price, Long> {

	Optional<Price> findFirstByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(Long producyId, Long brandId,
			LocalDateTime startDate, LocalDateTime endDate);
	
}
