package com.san.section;

import com.san.field.FieldMin;
import com.san.guiText.GuiTextMin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.*;

@Service
public class SectionService {
	
    @Autowired
    private SectionRepository sectionRepository;
    @PersistenceContext
    EntityManager entityManager;

    public List<Section> getAll() {
        List<Section> records = new ArrayList<>();
        sectionRepository.findAll().forEach(records::add);
        return records;
    }

    public Section getOne(String id) {
        return sectionRepository.findOne(id);
    }

    public void add(Section section) {
        sectionRepository.save(section);
    }

    public void update(Section section) {
        // if exists updates otherwise inserts
        sectionRepository.save(section);
    }

    public void delete(String id) {
        sectionRepository.delete(id);
    }

    public List<FieldMin> getForm(String section_id, String role, String language) {
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("get_form_sp");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, section_id);
        storedProcedureQuery.setParameter(2, role);
        storedProcedureQuery.setParameter(3, language);
        List<Object[]> l = storedProcedureQuery.getResultList();
        List<FieldMin> form = new ArrayList<>();

        if (l.size() > 0) {
            for(Object[] o: l) {
                form.add(new FieldMin((String) o[0], (String) o[1], (String) o[2]));
            }
            return form;
        }


        return null;
    }

    public Map<String, GuiTextMin> getGuiTexts(String section_id, String role, String language) {
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("get_gui_texts_sp");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, section_id);
        storedProcedureQuery.setParameter(2, role);
        storedProcedureQuery.setParameter(3, language);
        List<Object[]> l = storedProcedureQuery.getResultList();
        HashMap<String, GuiTextMin> map = new HashMap<>();

        if (l.size() > 0) {
            for(Object[] o: l) {
                String gui_text = (String) o[0];
                map.put(gui_text , new GuiTextMin((String) o[1], (String)o[2]));
            }
            return map;
        }


        return null;
    }

    public SectionResponse getSectionResponse(String id, String role, String language) {
        return new SectionResponse(getGuiTexts(id, role, language), getForm(id, role, language));
    }
}
