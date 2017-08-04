package com.san.guiText;

import com.san.Role.Role;
import com.san.guiTextType.GuiTextType;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class GuiText {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String gui_text;
    @ManyToOne
    private GuiTextType gui_text_type;
    @ManyToOne
    private Role role;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp gui_text_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp gui_text_updated_at;

    public GuiText() {

    }

    public GuiText(Integer id, String gui_text, GuiTextType gui_text_type, Role role, Timestamp gui_text_created_at, Timestamp gui_text_updated_at) {
        this.id = id;
        this.gui_text = gui_text;
        this.gui_text_type = gui_text_type;
        this.role = role;
        this.gui_text_created_at = gui_text_created_at;
        this.gui_text_updated_at = gui_text_updated_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGui_text() {
        return gui_text;
    }

    public void setGui_text(String gui_text) {
        this.gui_text = gui_text;
    }

    public GuiTextType getGui_text_type() {
        return gui_text_type;
    }

    public void setGui_text_type(GuiTextType gui_text_type) {
        this.gui_text_type = gui_text_type;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Timestamp getGui_text_created_at() {
        return gui_text_created_at;
    }

    public void setGui_text_created_at(Timestamp gui_text_created_at) {
        this.gui_text_created_at = gui_text_created_at;
    }

    public Timestamp getGui_text_updated_at() {
        return gui_text_updated_at;
    }

    public void setGui_text_updated_at(Timestamp gui_text_updated_at) {
        this.gui_text_updated_at = gui_text_updated_at;
    }
}