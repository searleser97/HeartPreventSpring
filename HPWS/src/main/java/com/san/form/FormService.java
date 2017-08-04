package com.san.form;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class FormService {
	
    @Autowired
    private FormRepository formRepository;

    public List<Form> getAll() {
        List<Form> records = new ArrayList<>();
        formRepository.findAll().forEach(records::add);
        return records;
    }

    public Form getOne(Integer id) {
        return formRepository.findOne(id);
    }

    public void add(Form form) {
        formRepository.save(form);
    }

    public void update(Form form) {
        // if exists updates otherwise inserts
        formRepository.save(form);
    }

    public void delete(Integer id) {
        formRepository.delete(id);
    }
}
