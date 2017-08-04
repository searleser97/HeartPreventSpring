package com.san.guiTextXSection;

import com.san.guiText.GuiText;
import com.san.section.Section;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "gui_text_x_section")
@IdClass(GuiTextXSectionPK.class)
public class GuiTextXSection {

    @Id
    @ManyToOne
    private GuiText gui_text;
    @Id
    @ManyToOne
    private Section section;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp gui_text_x_section_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp gui_text_x_section_updated_at;

    public GuiTextXSection() {
        
    }

    public GuiText getGui_text() {
        return gui_text;
    }

    public void setGui_text(GuiText gui_text) {
        this.gui_text = gui_text;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Timestamp getGui_text_x_section_created_at() {
        return gui_text_x_section_created_at;
    }

    public void setGui_text_x_section_created_at(Timestamp gui_text_x_section_created_at) {
        this.gui_text_x_section_created_at = gui_text_x_section_created_at;
    }

    public Timestamp getGui_text_x_section_updated_at() {
        return gui_text_x_section_updated_at;
    }

    public void setGui_text_x_section_updated_at(Timestamp gui_text_x_section_updated_at) {
        this.gui_text_x_section_updated_at = gui_text_x_section_updated_at;
    }
}