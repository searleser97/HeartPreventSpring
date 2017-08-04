package com.san.textTranslated;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class TextTranslatedService {
	
    @Autowired
    private TextTranslatedRepository textTranslatedRepository;

    public List<TextTranslated> getAll() {
        List<TextTranslated> records = new ArrayList<>();
        textTranslatedRepository.findAll().forEach(records::add);
        return records;
    }

    public TextTranslated getOne(Integer id) {
        return textTranslatedRepository.findOne(id);
    }

    public void add(TextTranslated textTranslated) {
        textTranslatedRepository.save(textTranslated);
    }

    public void update(TextTranslated textTranslated) {
        // if exists updates otherwise inserts
        textTranslatedRepository.save(textTranslated);
    }

    public void delete(Integer id) {
        textTranslatedRepository.delete(id);
    }
}
