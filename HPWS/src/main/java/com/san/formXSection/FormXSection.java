package com.san.formXSection;

import com.san.form.Form;
import com.san.section.Section;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "form_x_section")
@IdClass(FormXSectionPK.class)
public class FormXSection {

    @Id
    @ManyToOne
    private Section section;
    @Id
    @ManyToOne
    private Form form;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp form_x_section_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp form_x_section_updated_at;

    public FormXSection() {
        
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Timestamp getForm_x_section_created_at() {
        return form_x_section_created_at;
    }

    public void setForm_x_section_created_at(Timestamp form_x_section_created_at) {
        this.form_x_section_created_at = form_x_section_created_at;
    }

    public Timestamp getForm_x_section_updated_at() {
        return form_x_section_updated_at;
    }

    public void setForm_x_section_updated_at(Timestamp form_x_section_updated_at) {
        this.form_x_section_updated_at = form_x_section_updated_at;
    }
}