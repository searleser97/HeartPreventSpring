package com.san.fieldXForm;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class FieldXFormService {
	
    @Autowired
    private FieldXFormRepository fieldXFormRepository;

    public List<FieldXForm> getAll() {
        List<FieldXForm> records = new ArrayList<>();
        fieldXFormRepository.findAll().forEach(records::add);
        return records;
    }

    public FieldXForm getOne(Integer id) {
        return fieldXFormRepository.findOne(id);
    }

    public void add(FieldXForm fieldXForm) {
        fieldXFormRepository.save(fieldXForm);
    }

    public void update(FieldXForm fieldXForm) {
        // if exists updates otherwise inserts
        fieldXFormRepository.save(fieldXForm);
    }

    public void delete(Integer id) {
        fieldXFormRepository.delete(id);
    }
}
