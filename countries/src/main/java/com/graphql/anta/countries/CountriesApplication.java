package com.graphql.anta.countries;

import com.graphql.anta.countries.model.Country;
import com.graphql.anta.countries.repository.CountryRepository;
import com.graphql.anta.countries.service.CountryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

import java.util.List;

@SpringBootApplication
public class CountriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountriesApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CountryService service, CountryRepository repository) {
		System.out.println("Command Line Runner Started");
		return args -> {
			Mono<List<Country>> countries = service.getCountries();
			countries.subscribe(repository::saveAll);
		};
	}

}
