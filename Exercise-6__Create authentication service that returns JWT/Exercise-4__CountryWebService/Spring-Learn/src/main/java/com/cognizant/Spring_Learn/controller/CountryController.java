package com.cognizant.Spring_Learn.controller;

import com.cognizant.Spring_Learn.model.Country;
import com.cognizant.Spring_Learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {

        return countryService.getCountry(code);

    }
}