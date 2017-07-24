package com.san.user;

/**
 * Created by san on 14/07/17.
 */
public class Aux {

    private String id;
    private String description;

    public Aux() {

    }
    public String getId() {
        return id;
    }

    public Aux(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
