package com.san.bloodPressureXUser;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class BloodPressureXUserService {
	
    @Autowired
    private BloodPressureXUserRepository bloodPressureXUserRepository;

    public List<BloodPressureXUser> getAll() {
        List<BloodPressureXUser> records = new ArrayList<>();
        bloodPressureXUserRepository.findAll().forEach(records::add);
        return records;
    }

    public BloodPressureXUser getOne(Integer id) {
        return bloodPressureXUserRepository.findOne(id);
    }

    public void add(BloodPressureXUser bloodPressureXUser) {
        bloodPressureXUserRepository.save(bloodPressureXUser);
    }

    public void update(BloodPressureXUser bloodPressureXUser) {
        // if exists updates otherwise inserts
        bloodPressureXUserRepository.save(bloodPressureXUser);
    }

    public void delete(Integer id) {
        bloodPressureXUserRepository.delete(id);
    }
}
