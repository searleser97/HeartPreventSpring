package com.san.ratingXUser;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class RatingXUserService {
	
    @Autowired
    private RatingXUserRepository ratingXUserRepository;

    public List<RatingXUser> getAll() {
        List<RatingXUser> records = new ArrayList<>();
        ratingXUserRepository.findAll().forEach(records::add);
        return records;
    }

    public RatingXUser getOne(Integer id) {
        return ratingXUserRepository.findOne(id);
    }

    public void add(RatingXUser ratingXUser) {
        ratingXUserRepository.save(ratingXUser);
    }

    public void update(RatingXUser ratingXUser) {
        // if exists updates otherwise inserts
        ratingXUserRepository.save(ratingXUser);
    }

    public void delete(Integer id) {
        ratingXUserRepository.delete(id);
    }
}
