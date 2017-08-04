package com.san.field;

public class FieldMin {
    private String name;
    private String label;
    private String field_type;

    public FieldMin() {
    }

    public FieldMin(String name, String field_type, String label) {
        this.name = name;
        this.field_type = field_type;
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField_type() {
        return field_type;
    }

    public void setField_type(String field_type) {
        this.field_type = field_type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
