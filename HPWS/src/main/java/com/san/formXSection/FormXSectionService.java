package com.san.formXSection;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class FormXSectionService {
	
    @Autowired
    private FormXSectionRepository formXSectionRepository;

    public List<FormXSection> getAll() {
        List<FormXSection> records = new ArrayList<>();
        formXSectionRepository.findAll().forEach(records::add);
        return records;
    }

    public FormXSection getOne(Integer id) {
        return formXSectionRepository.findOne(id);
    }

    public void add(FormXSection formXSection) {
        formXSectionRepository.save(formXSection);
    }

    public void update(FormXSection formXSection) {
        // if exists updates otherwise inserts
        formXSectionRepository.save(formXSection);
    }

    public void delete(Integer id) {
        formXSectionRepository.delete(id);
    }
}
