package com.san.fieldXForm;

import com.san.field.Field;
import com.san.form.Form;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "field_x_form")
@IdClass(FieldXFormPK.class)
public class FieldXForm {

    @Id
    @ManyToOne
    private Form form;
    @Id
    @ManyToOne
    private Field field;

    @Column(nullable = false)
    private Integer position;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp field_x_form_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp field_x_form_updated_at;

    public FieldXForm() {
        
    }

    public FieldXForm(Form form, Field field, Integer position, Timestamp field_x_form_created_at, Timestamp field_x_form_updated_at) {
        this.form = form;
        this.field = field;
        this.position = position;
        this.field_x_form_created_at = field_x_form_created_at;
        this.field_x_form_updated_at = field_x_form_updated_at;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Timestamp getField_x_form_created_at() {
        return field_x_form_created_at;
    }

    public void setField_x_form_created_at(Timestamp field_x_form_created_at) {
        this.field_x_form_created_at = field_x_form_created_at;
    }

    public Timestamp getField_x_form_updated_at() {
        return field_x_form_updated_at;
    }

    public void setField_x_form_updated_at(Timestamp field_x_form_updated_at) {
        this.field_x_form_updated_at = field_x_form_updated_at;
    }
}