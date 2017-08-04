package com.san.relationshipState;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class RelationshipState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String relationship_state;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp relationship_state_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp relationship_state_updated_at;

    public RelationshipState() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRelationship_state() {
        return relationship_state;
    }

    public void setRelationship_state(String relationship_state) {
        this.relationship_state = relationship_state;
    }

    public Timestamp getRelationship_state_created_at() {
        return relationship_state_created_at;
    }

    public void setRelationship_state_created_at(Timestamp relationship_state_created_at) {
        this.relationship_state_created_at = relationship_state_created_at;
    }

    public Timestamp getRelationship_state_updated_at() {
        return relationship_state_updated_at;
    }

    public void setRelationship_state_updated_at(Timestamp relationship_state_updated_at) {
        this.relationship_state_updated_at = relationship_state_updated_at;
    }
}