package com.graphql.anta.countries.repository;

import com.graphql.anta.countries.model.Country;
import org.springframework.data.repository.ListCrudRepository;

public interface CountryRepository extends ListCrudRepository<Country, Integer> {

}
