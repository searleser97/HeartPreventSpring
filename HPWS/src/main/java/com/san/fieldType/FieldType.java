package com.san.fieldType;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class FieldType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String field_type;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp field_type_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp field_type_updated_at;

    public FieldType() {

    }

    public FieldType(Integer id, String field_type, Timestamp field_type_created_at, Timestamp field_type_updated_at) {
        this.id = id;
        this.field_type = field_type;
        this.field_type_created_at = field_type_created_at;
        this.field_type_updated_at = field_type_updated_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getField_type() {
        return field_type;
    }

    public void setField_type(String field_type) {
        this.field_type = field_type;
    }

    public Timestamp getField_type_created_at() {
        return field_type_created_at;
    }

    public void setField_type_created_at(Timestamp field_type_created_at) {
        this.field_type_created_at = field_type_created_at;
    }

    public Timestamp getField_type_updated_at() {
        return field_type_updated_at;
    }

    public void setField_type_updated_at(Timestamp field_type_updated_at) {
        this.field_type_updated_at = field_type_updated_at;
    }
}