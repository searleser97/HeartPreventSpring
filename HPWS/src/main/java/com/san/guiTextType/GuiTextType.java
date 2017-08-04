package com.san.guiTextType;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class GuiTextType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String gui_text_type;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp gui_text_type_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp gui_text_type_updated_at;

    public GuiTextType() {

    }

    public GuiTextType(Integer id, String gui_text_type, Timestamp gui_text_type_created_at, Timestamp gui_text_type_updated_at) {
        this.id = id;
        this.gui_text_type = gui_text_type;
        this.gui_text_type_created_at = gui_text_type_created_at;
        this.gui_text_type_updated_at = gui_text_type_updated_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGui_text_type() {
        return gui_text_type;
    }

    public void setGui_text_type(String gui_text_type) {
        this.gui_text_type = gui_text_type;
    }

    public Timestamp getGui_text_type_created_at() {
        return gui_text_type_created_at;
    }

    public void setGui_text_type_created_at(Timestamp gui_text_type_created_at) {
        this.gui_text_type_created_at = gui_text_type_created_at;
    }

    public Timestamp getGui_text_type_updated_at() {
        return gui_text_type_updated_at;
    }

    public void setGui_text_type_updated_at(Timestamp gui_text_type_updated_at) {
        this.gui_text_type_updated_at = gui_text_type_updated_at;
    }
}