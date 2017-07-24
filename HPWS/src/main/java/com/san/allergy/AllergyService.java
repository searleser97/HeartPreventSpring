package com.san.allergy;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class AllergyService {
	
    @Autowired
    private AllergyRepository allergyRepository;

    public List<Allergy> getAll() {
        List<Allergy> records = new ArrayList<>();
        allergyRepository.findAll().forEach(records::add);
        return records;
    }

    public Allergy getOne(Integer id) {
        return allergyRepository.findOne(id);
    }

    public void add(Allergy allergy) {
        allergyRepository.save(allergy);
    }

    public void update(Allergy allergy) {
        // if exists updates otherwise inserts
        allergyRepository.save(allergy);
    }

    public void delete(Integer id) {
        allergyRepository.delete(id);
    }
}
