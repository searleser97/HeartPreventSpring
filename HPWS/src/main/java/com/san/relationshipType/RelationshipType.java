package com.san.relationshipType;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class RelationshipType {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String relationship_type;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp relationship_type_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp relationship_type_updated_at;

    public RelationshipType() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRelationship_type() {
        return relationship_type;
    }

    public void setRelationship_type(String relationship_type) {
        this.relationship_type = relationship_type;
    }

    public Timestamp getRelationship_type_created_at() {
        return relationship_type_created_at;
    }

    public void setRelationship_type_created_at(Timestamp relationship_type_created_at) {
        this.relationship_type_created_at = relationship_type_created_at;
    }

    public Timestamp getRelationship_type_updated_at() {
        return relationship_type_updated_at;
    }

    public void setRelationship_type_updated_at(Timestamp relationship_type_updated_at) {
        this.relationship_type_updated_at = relationship_type_updated_at;
    }
}