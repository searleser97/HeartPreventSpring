package com.san.sexInLanguage;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class SexInLanguageService {
	
    @Autowired
    private SexInLanguageRepository sexInLanguageRepository;

    public List<SexInLanguage> getAll() {
        List<SexInLanguage> records = new ArrayList<>();
        sexInLanguageRepository.findAll().forEach(records::add);
        return records;
    }

    public SexInLanguage getOne(Integer id) {
        return sexInLanguageRepository.findOne(id);
    }

    public void add(SexInLanguage sexInLanguage) {
        sexInLanguageRepository.save(sexInLanguage);
    }

    public void update(SexInLanguage sexInLanguage) {
        // if exists updates otherwise inserts
        sexInLanguageRepository.save(sexInLanguage);
    }

    public void delete(Integer id) {
        sexInLanguageRepository.delete(id);
    }
}
