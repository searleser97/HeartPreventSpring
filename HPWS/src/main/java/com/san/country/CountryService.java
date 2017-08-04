package com.san.country;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {
	
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAll() {
        List<Country> records = new ArrayList<>();
        countryRepository.findAll().forEach(records::add);
        return records;
    }

    public Country getOne(Integer id) {
        return countryRepository.findOne(id);
    }

    public void add(Country country) {
        countryRepository.save(country);
    }

    public void update(Country country) {
        // if exists updates otherwise inserts
        countryRepository.save(country);
    }

    public void delete(Integer id) {
        countryRepository.delete(id);
    }
}
