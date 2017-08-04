package com.san.message;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
	
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAll() {
        List<Message> records = new ArrayList<>();
        messageRepository.findAll().forEach(records::add);
        return records;
    }

    public Message getOne(Integer id) {
        return messageRepository.findOne(id);
    }

    public void add(Message message) {
        messageRepository.save(message);
    }

    public void update(Message message) {
        // if exists updates otherwise inserts
        messageRepository.save(message);
    }

    public void delete(Integer id) {
        messageRepository.delete(id);
    }
}
