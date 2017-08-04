package com.san.medicineInLanguage;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicineInLanguageService {
	
    @Autowired
    private MedicineInLanguageRepository medicineInLanguageRepository;

    public List<MedicineInLanguage> getAll() {
        List<MedicineInLanguage> records = new ArrayList<>();
        medicineInLanguageRepository.findAll().forEach(records::add);
        return records;
    }

    public MedicineInLanguage getOne(Integer id) {
        return medicineInLanguageRepository.findOne(id);
    }

    public void add(MedicineInLanguage medicineInLanguage) {
        medicineInLanguageRepository.save(medicineInLanguage);
    }

    public void update(MedicineInLanguage medicineInLanguage) {
        // if exists updates otherwise inserts
        medicineInLanguageRepository.save(medicineInLanguage);
    }

    public void delete(Integer id) {
        medicineInLanguageRepository.delete(id);
    }
}
