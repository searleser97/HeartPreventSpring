package com.san.medicineXUser;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicineXUserService {
	
    @Autowired
    private MedicineXUserRepository medicineXUserRepository;

    public List<MedicineXUser> getAll() {
        List<MedicineXUser> records = new ArrayList<>();
        medicineXUserRepository.findAll().forEach(records::add);
        return records;
    }

    public MedicineXUser getOne(Integer id) {
        return medicineXUserRepository.findOne(id);
    }

    public void add(MedicineXUser medicineXUser) {
        medicineXUserRepository.save(medicineXUser);
    }

    public void update(MedicineXUser medicineXUser) {
        // if exists updates otherwise inserts
        medicineXUserRepository.save(medicineXUser);
    }

    public void delete(Integer id) {
        medicineXUserRepository.delete(id);
    }
}
