package com.san.guiTextInLanguage;

import com.san.guiText.GuiText;
import com.san.language.Language;
import com.san.textTranslated.TextTranslated;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(GuiTextInLanguagePk.class)
public class GuiTextInLanguage {

    @Id
    @ManyToOne
    private GuiText gui_text;
    @Id
    @ManyToOne
    private Language language;
    @ManyToOne
    private TextTranslated gui_text_translated;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp gui_text_in_language_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp gui_text_in_language_updated_at;

    public GuiTextInLanguage() {
        
    }

    public GuiText getGui_text() {
        return gui_text;
    }

    public void setGui_text(GuiText gui_text) {
        this.gui_text = gui_text;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public TextTranslated getGui_text_translated() {
        return gui_text_translated;
    }

    public void setGui_text_translated(TextTranslated gui_text_translated) {
        this.gui_text_translated = gui_text_translated;
    }

    public Timestamp getGui_text_in_language_created_at() {
        return gui_text_in_language_created_at;
    }

    public void setGui_text_in_language_created_at(Timestamp gui_text_in_language_created_at) {
        this.gui_text_in_language_created_at = gui_text_in_language_created_at;
    }

    public Timestamp getGui_text_in_language_updated_at() {
        return gui_text_in_language_updated_at;
    }

    public void setGui_text_in_language_updated_at(Timestamp gui_text_in_language_updated_at) {
        this.gui_text_in_language_updated_at = gui_text_in_language_updated_at;
    }
}