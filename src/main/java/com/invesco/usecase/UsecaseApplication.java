package com.invesco.usecase;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.invesco.usecase.domain.Investment;
import com.invesco.usecase.service.InvestmentService;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class UsecaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsecaseApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(InvestmentService investmentService){
		return args -> {
			ObjectMapper map = new ObjectMapper();
			TypeReference<List<Investment>> typeReference = new TypeReference<List<Investment>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/InvestmentsData.json");
			try{
				List<Investment> investments = map.readValue(inputStream, typeReference);
				investmentService.saveInvestments(investments);
				System.out.println("Investments saved.");
			} catch (Exception e){
				System.out.println("Unable to save investments.");
			}
		};
	}
}
