package com.san.section;

import com.san.field.FieldMin;
import com.san.guiText.GuiTextMin;

import java.util.List;
import java.util.Map;

public class SectionResponse {
    Map<String, GuiTextMin> guiTexts;
    private List<FieldMin> form;

    public SectionResponse() {
    }

    public SectionResponse(Map<String, GuiTextMin> guiTexts, List<FieldMin> form) {
        this.guiTexts = guiTexts;
        this.form = form;
    }

    public Map<String, GuiTextMin> getGuiTexts() {
        return guiTexts;
    }

    public void setGuiTexts(Map<String, GuiTextMin> guiTexts) {
        this.guiTexts = guiTexts;
    }

    public List<FieldMin> getForm() {
        return form;
    }

    public void setForm(List<FieldMin> form) {
        this.form = form;
    }
}
