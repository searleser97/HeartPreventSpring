package com.san.field;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class FieldService {
	
    @Autowired
    private FieldRepository fieldRepository;

    public List<Field> getAll() {
        List<Field> records = new ArrayList<>();
        fieldRepository.findAll().forEach(records::add);
        return records;
    }

    public Field getOne(Integer id) {
        return fieldRepository.findOne(id);
    }

    public void add(Field field) {
        fieldRepository.save(field);
    }

    public void update(Field field) {
        // if exists updates otherwise inserts
        fieldRepository.save(field);
    }

    public void delete(Integer id) {
        fieldRepository.delete(id);
    }
}
