package com.san.messageState;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class MessageState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String message_state;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp message_state_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp message_state_updated_at;

    public MessageState() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage_state() {
        return message_state;
    }

    public void setMessage_state(String message_state) {
        this.message_state = message_state;
    }

    public Timestamp getMessage_state_created_at() {
        return message_state_created_at;
    }

    public void setMessage_state_created_at(Timestamp message_state_created_at) {
        this.message_state_created_at = message_state_created_at;
    }

    public Timestamp getMessage_state_updated_at() {
        return message_state_updated_at;
    }

    public void setMessage_state_updated_at(Timestamp message_state_updated_at) {
        this.message_state_updated_at = message_state_updated_at;
    }
}