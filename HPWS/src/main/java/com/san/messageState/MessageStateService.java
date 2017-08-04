package com.san.messageState;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageStateService {
	
    @Autowired
    private MessageStateRepository messageStateRepository;

    public List<MessageState> getAll() {
        List<MessageState> records = new ArrayList<>();
        messageStateRepository.findAll().forEach(records::add);
        return records;
    }

    public MessageState getOne(Integer id) {
        return messageStateRepository.findOne(id);
    }

    public void add(MessageState messageState) {
        messageStateRepository.save(messageState);
    }

    public void update(MessageState messageState) {
        // if exists updates otherwise inserts
        messageStateRepository.save(messageState);
    }

    public void delete(Integer id) {
        messageStateRepository.delete(id);
    }
}
