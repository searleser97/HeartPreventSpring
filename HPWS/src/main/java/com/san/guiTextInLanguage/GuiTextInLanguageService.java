package com.san.guiTextInLanguage;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuiTextInLanguageService {
	
    @Autowired
    private GuiTextInLanguageRepository guiTextInLanguageRepository;

    public List<GuiTextInLanguage> getAll() {
        List<GuiTextInLanguage> records = new ArrayList<>();
        guiTextInLanguageRepository.findAll().forEach(records::add);
        return records;
    }

    public GuiTextInLanguage getOne(Integer id) {
        return guiTextInLanguageRepository.findOne(id);
    }

    public void add(GuiTextInLanguage guiTextInLanguage) {
        guiTextInLanguageRepository.save(guiTextInLanguage);
    }

    public void update(GuiTextInLanguage guiTextInLanguage) {
        // if exists updates otherwise inserts
        guiTextInLanguageRepository.save(guiTextInLanguage);
    }

    public void delete(Integer id) {
        guiTextInLanguageRepository.delete(id);
    }
}
