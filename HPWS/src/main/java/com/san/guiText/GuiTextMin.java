package com.san.guiText;

public class GuiTextMin {
    private String gui_text_translated;
    private String gui_text_type;

    public GuiTextMin() {

    }

    public GuiTextMin(String gui_text_translated, String gui_text_type) {
        this.gui_text_translated = gui_text_translated;
        this.gui_text_type = gui_text_type;
    }

    public String getGui_text_translated() {
        return gui_text_translated;
    }

    public void setGui_text_translated(String gui_text_translated) {
        this.gui_text_translated = gui_text_translated;
    }

    public String getGui_text_type() {
        return gui_text_type;
    }

    public void setGui_text_type(String gui_text_type) {
        this.gui_text_type = gui_text_type;
    }
}
