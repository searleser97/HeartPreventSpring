package com.san.fieldType;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class FieldTypeService {
	
    @Autowired
    private FieldTypeRepository fieldTypeRepository;

    public List<FieldType> getAll() {
        List<FieldType> records = new ArrayList<>();
        fieldTypeRepository.findAll().forEach(records::add);
        return records;
    }

    public FieldType getOne(Integer id) {
        return fieldTypeRepository.findOne(id);
    }

    public void add(FieldType fieldType) {
        fieldTypeRepository.save(fieldType);
    }

    public void update(FieldType fieldType) {
        // if exists updates otherwise inserts
        fieldTypeRepository.save(fieldType);
    }

    public void delete(Integer id) {
        fieldTypeRepository.delete(id);
    }
}
