package com.san.sex;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class SexService {
	
    @Autowired
    private SexRepository sexRepository;

    public List<Sex> getAll() {
        List<Sex> records = new ArrayList<>();
        sexRepository.findAll().forEach(records::add);
        return records;
    }

    public Sex getOne(Integer id) {
        return sexRepository.findOne(id);
    }

    public void add(Sex sex) {
        sexRepository.save(sex);
    }

    public void update(Sex sex) {
        // if exists updates otherwise inserts
        sexRepository.save(sex);
    }

    public void delete(Integer id) {
        sexRepository.delete(id);
    }
}
