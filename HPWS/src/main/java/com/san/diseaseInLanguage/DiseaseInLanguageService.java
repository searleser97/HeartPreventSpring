package com.san.diseaseInLanguage;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiseaseInLanguageService {
	
    @Autowired
    private DiseaseInLanguageRepository diseaseInLanguageRepository;

    public List<DiseaseInLanguage> getAll() {
        List<DiseaseInLanguage> records = new ArrayList<>();
        diseaseInLanguageRepository.findAll().forEach(records::add);
        return records;
    }

    public DiseaseInLanguage getOne(Integer id) {
        return diseaseInLanguageRepository.findOne(id);
    }

    public void add(DiseaseInLanguage diseaseInLanguage) {
        diseaseInLanguageRepository.save(diseaseInLanguage);
    }

    public void update(DiseaseInLanguage diseaseInLanguage) {
        // if exists updates otherwise inserts
        diseaseInLanguageRepository.save(diseaseInLanguage);
    }

    public void delete(Integer id) {
        diseaseInLanguageRepository.delete(id);
    }
}
