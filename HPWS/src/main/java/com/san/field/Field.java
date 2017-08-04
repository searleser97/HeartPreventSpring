package com.san.field;

import com.san.fieldType.FieldType;
import com.san.guiText.GuiText;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Field {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @ManyToOne
    private GuiText label;
    @ManyToOne
    private FieldType field_type;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp field_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp field_updated_at;


    public Field() {

    }

    public Field(Integer id, String name, GuiText label, FieldType field_type, Timestamp field_created_at, Timestamp field_updated_at) {
        this.id = id;
        this.name = name;
        this.label = label;
        this.field_type = field_type;
        this.field_created_at = field_created_at;
        this.field_updated_at = field_updated_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GuiText getLabel() {
        return label;
    }

    public void setLabel(GuiText label) {
        this.label = label;
    }

    public FieldType getField_type() {
        return field_type;
    }

    public void setField_type(FieldType field_type) {
        this.field_type = field_type;
    }

    public Timestamp getField_created_at() {
        return field_created_at;
    }

    public void setField_created_at(Timestamp field_created_at) {
        this.field_created_at = field_created_at;
    }

    public Timestamp getField_updated_at() {
        return field_updated_at;
    }

    public void setField_updated_at(Timestamp field_updated_at) {
        this.field_updated_at = field_updated_at;
    }
}