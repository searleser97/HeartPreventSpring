package com.san.guiText;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuiTextService {
	
    @Autowired
    private GuiTextRepository guiTextRepository;

    public List<GuiText> getAll() {
        List<GuiText> records = new ArrayList<>();
        guiTextRepository.findAll().forEach(records::add);
        return records;
    }

    public GuiText getOne(Integer id) {
        return guiTextRepository.findOne(id);
    }

    public void add(GuiText guiText) {
        guiTextRepository.save(guiText);
    }

    public void update(GuiText guiText) {
        // if exists updates otherwise inserts
        guiTextRepository.save(guiText);
    }

    public void delete(Integer id) {
        guiTextRepository.delete(id);
    }
}
