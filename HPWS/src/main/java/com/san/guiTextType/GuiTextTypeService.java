package com.san.guiTextType;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuiTextTypeService {
	
    @Autowired
    private GuiTextTypeRepository guiTextTypeRepository;

    public List<GuiTextType> getAll() {
        List<GuiTextType> records = new ArrayList<>();
        guiTextTypeRepository.findAll().forEach(records::add);
        return records;
    }

    public GuiTextType getOne(Integer id) {
        return guiTextTypeRepository.findOne(id);
    }

    public void add(GuiTextType guiTextType) {
        guiTextTypeRepository.save(guiTextType);
    }

    public void update(GuiTextType guiTextType) {
        // if exists updates otherwise inserts
        guiTextTypeRepository.save(guiTextType);
    }

    public void delete(Integer id) {
        guiTextTypeRepository.delete(id);
    }
}
