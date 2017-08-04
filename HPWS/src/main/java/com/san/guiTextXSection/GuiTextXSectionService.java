package com.san.guiTextXSection;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuiTextXSectionService {
	
    @Autowired
    private GuiTextXSectionRepository guiTextXSectionRepository;

    public List<GuiTextXSection> getAll() {
        List<GuiTextXSection> records = new ArrayList<>();
        guiTextXSectionRepository.findAll().forEach(records::add);
        return records;
    }

    public GuiTextXSection getOne(Integer id) {
        return guiTextXSectionRepository.findOne(id);
    }

    public void add(GuiTextXSection guiTextXSection) {
        guiTextXSectionRepository.save(guiTextXSection);
    }

    public void update(GuiTextXSection guiTextXSection) {
        // if exists updates otherwise inserts
        guiTextXSectionRepository.save(guiTextXSection);
    }

    public void delete(Integer id) {
        guiTextXSectionRepository.delete(id);
    }
}
