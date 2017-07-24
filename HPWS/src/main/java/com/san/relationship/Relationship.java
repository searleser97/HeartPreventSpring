package com.san.relationship;

import com.san.relationshipState.RelationshipState;
import com.san.relationshipType.RelationshipType;
import com.san.user.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Relationship {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private User user1;
    @ManyToOne
    private User user2;
    @ManyToOne
    private User last_on_action;
    @ManyToOne
    private RelationshipState relationship_state;
    @ManyToOne
    private RelationshipType relationship_type;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp relationship_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp relationship_updated_at;

    public Relationship() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }

    public User getLast_on_action() {
        return last_on_action;
    }

    public void setLast_on_action(User last_on_action) {
        this.last_on_action = last_on_action;
    }

    public RelationshipState getRelationship_state() {
        return relationship_state;
    }

    public void setRelationship_state(RelationshipState relationship_state) {
        this.relationship_state = relationship_state;
    }

    public RelationshipType getRelationship_type() {
        return relationship_type;
    }

    public void setRelationship_type(RelationshipType relationship_type) {
        this.relationship_type = relationship_type;
    }

    public Timestamp getRelationship_created_at() {
        return relationship_created_at;
    }

    public void setRelationship_created_at(Timestamp relationship_created_at) {
        this.relationship_created_at = relationship_created_at;
    }

    public Timestamp getRelationship_updated_at() {
        return relationship_updated_at;
    }

    public void setRelationship_updated_at(Timestamp relationship_updated_at) {
        this.relationship_updated_at = relationship_updated_at;
    }
}