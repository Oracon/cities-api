package com.github.oracon.citiesapi.countries.repository;

import com.github.oracon.citiesapi.countries.Country;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

    Page<Country> findAll(Pageable page);

    
}
