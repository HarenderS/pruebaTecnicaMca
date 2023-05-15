package com.example.pruebaTecnica.price.service;

import com.example.pruebaTecnica.price.dtos.PostPricesGetInputDto;
import com.example.pruebaTecnica.price.dtos.PostPricesGetOutputDto;

public interface PriceService {

	PostPricesGetOutputDto find(PostPricesGetInputDto inputDto);

}
