package com.san.language;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageService {
	
    @Autowired
    private LanguageRepository languageRepository;

    public List<Language> getAll() {
        List<Language> records = new ArrayList<>();
        languageRepository.findAll().forEach(records::add);
        return records;
    }

    public Language getOne(Integer id) {
        return languageRepository.findOne(id);
    }

    public void add(Language language) {
        languageRepository.save(language);
    }

    public void update(Language language) {
        // if exists updates otherwise inserts
        languageRepository.save(language);
    }

    public void delete(Integer id) {
        languageRepository.delete(id);
    }
}
