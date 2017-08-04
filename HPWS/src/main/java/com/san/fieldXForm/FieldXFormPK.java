package com.san.fieldXForm;

import com.san.field.Field;
import com.san.form.Form;

import java.io.Serializable;

public class FieldXFormPK implements Serializable {
    private Form form;
    private Field field;

    public FieldXFormPK() {
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
}
