package com.san.diseaseXUser;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiseaseXUserService {
	
    @Autowired
    private DiseaseXUserRepository diseaseXUserRepository;

    public List<DiseaseXUser> getAll() {
        List<DiseaseXUser> records = new ArrayList<>();
        diseaseXUserRepository.findAll().forEach(records::add);
        return records;
    }

    public DiseaseXUser getOne(Integer id) {
        return diseaseXUserRepository.findOne(id);
    }

    public void add(DiseaseXUser diseaseXUser) {
        diseaseXUserRepository.save(diseaseXUser);
    }

    public void update(DiseaseXUser diseaseXUser) {
        // if exists updates otherwise inserts
        diseaseXUserRepository.save(diseaseXUser);
    }

    public void delete(Integer id) {
        diseaseXUserRepository.delete(id);
    }
}
