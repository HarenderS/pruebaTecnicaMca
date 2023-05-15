package com.example.pruebaTecnica.webTestClient;

import static io.restassured.RestAssured.given;
import static io.restassured.path.json.JsonPath.from;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import com.example.pruebaTecnica.price.dtos.PostPricesGetInputDto;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PriceRestTests {

	@LocalServerPort
	int port;

	@BeforeEach
	public void setUp() {
		RestAssured.port = port;
	}

	@Test
	public void Test1() {
		PostPricesGetInputDto body = new PostPricesGetInputDto(1L, 35455L, "2020-06-14-10.00.00");
		Response response = given()
			.request()
				.body(body)
				.contentType(ContentType.JSON)
		.when()
			.post("/prices/get/").andReturn();
		
		assertEquals(from(response.getBody().asString()).getLong("BRAND_ID"), body.getBrandId()); 
		assertEquals(from(response.getBody().asString()).getLong("PRODUCT_ID"), body.getProductId()); 
		assertTrue(LocalDateTime.parse(from(response.getBody().asString()).get("START_DATE"))
				.isBefore(LocalDateTime.parse(body.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss"))));
		assertTrue(LocalDateTime.parse(from(response.getBody().asString()).get("END_DATE"))
				.isAfter(LocalDateTime.parse(body.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss"))));
		
	}
	
	@Test
	public void Test2() {
		PostPricesGetInputDto body = new PostPricesGetInputDto(1L, 35455L, "2020-06-14-16.00.00");
		Response response = given()
			.request()
				.body(body)
				.contentType(ContentType.JSON)
		.when()
			.post("/prices/get/").andReturn();
		
		assertEquals(from(response.getBody().asString()).getLong("BRAND_ID"), body.getBrandId()); 
		assertEquals(from(response.getBody().asString()).getLong("PRODUCT_ID"), body.getProductId()); 
		assertTrue(LocalDateTime.parse(from(response.getBody().asString()).get("START_DATE"))
				.isBefore(LocalDateTime.parse(body.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss"))));
		assertTrue(LocalDateTime.parse(from(response.getBody().asString()).get("END_DATE"))
				.isAfter(LocalDateTime.parse(body.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss"))));
		
	}
	
	@Test
	public void Test3() {
		PostPricesGetInputDto body = new PostPricesGetInputDto(1L, 35455L, "2020-06-14-21.00.00");
		Response response = given()
			.request()
				.body(body)
				.contentType(ContentType.JSON)
		.when()
			.post("/prices/get/").andReturn();
		
		assertEquals(from(response.getBody().asString()).getLong("BRAND_ID"), body.getBrandId()); 
		assertEquals(from(response.getBody().asString()).getLong("PRODUCT_ID"), body.getProductId()); 
		assertTrue(LocalDateTime.parse(from(response.getBody().asString()).get("START_DATE"))
				.isBefore(LocalDateTime.parse(body.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss"))));
		assertTrue(LocalDateTime.parse(from(response.getBody().asString()).get("END_DATE"))
				.isAfter(LocalDateTime.parse(body.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss"))));
		
	}
	
	@Test
	public void Test4() {
		PostPricesGetInputDto body = new PostPricesGetInputDto(1L, 35455L, "2020-06-15-10.00.00");
		Response response = given()
			.request()
				.body(body)
				.contentType(ContentType.JSON)
		.when()
			.post("/prices/get/").andReturn();
		
		assertEquals(from(response.getBody().asString()).getLong("BRAND_ID"), body.getBrandId()); 
		assertEquals(from(response.getBody().asString()).getLong("PRODUCT_ID"), body.getProductId()); 
		assertTrue(LocalDateTime.parse(from(response.getBody().asString()).get("START_DATE"))
				.isBefore(LocalDateTime.parse(body.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss"))));
		assertTrue(LocalDateTime.parse(from(response.getBody().asString()).get("END_DATE"))
				.isAfter(LocalDateTime.parse(body.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss"))));
		
	}
	
	@Test
	public void Test5() {
		PostPricesGetInputDto body = new PostPricesGetInputDto(1L, 35455L, "2020-06-16-21.00.00");
		Response response = given()
			.request()
				.body(body)
				.contentType(ContentType.JSON)
		.when()
			.post("/prices/get/").andReturn();
		
		assertEquals(from(response.getBody().asString()).getLong("BRAND_ID"), body.getBrandId()); 
		assertEquals(from(response.getBody().asString()).getLong("PRODUCT_ID"), body.getProductId()); 
		assertTrue(LocalDateTime.parse(from(response.getBody().asString()).get("START_DATE"))
				.isBefore(LocalDateTime.parse(body.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss"))));
		assertTrue(LocalDateTime.parse(from(response.getBody().asString()).get("END_DATE"))
				.isAfter(LocalDateTime.parse(body.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss"))));
		
	}
	
}
