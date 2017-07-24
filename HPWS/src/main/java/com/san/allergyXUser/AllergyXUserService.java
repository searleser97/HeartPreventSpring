package com.san.allergyXUser;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class AllergyXUserService {
	
    @Autowired
    private AllergyXUserRepository allergyXUserRepository;

    public List<AllergyXUser> getAll() {
        List<AllergyXUser> records = new ArrayList<>();
        allergyXUserRepository.findAll().forEach(records::add);
        return records;
    }

    public AllergyXUser getOne(Integer id) {
        return allergyXUserRepository.findOne(id);
    }

    public void add(AllergyXUser allergyXUser) {
        allergyXUserRepository.save(allergyXUser);
    }

    public void update(AllergyXUser allergyXUser) {
        // if exists updates otherwise inserts
        allergyXUserRepository.save(allergyXUser);
    }

    public void delete(Integer id) {
        allergyXUserRepository.delete(id);
    }
}
