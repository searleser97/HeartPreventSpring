package com.san.braceletXUser;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class BraceletXUserService {
	
    @Autowired
    private BraceletXUserRepository braceletXUserRepository;

    public List<BraceletXUser> getAll() {
        List<BraceletXUser> records = new ArrayList<>();
        braceletXUserRepository.findAll().forEach(records::add);
        return records;
    }

    public BraceletXUser getOne(Integer id) {
        return braceletXUserRepository.findOne(id);
    }

    public void add(BraceletXUser braceletXUser) {
        braceletXUserRepository.save(braceletXUser);
    }

    public void update(BraceletXUser braceletXUser) {
        // if exists updates otherwise inserts
        braceletXUserRepository.save(braceletXUser);
    }

    public void delete(Integer id) {
        braceletXUserRepository.delete(id);
    }
}
