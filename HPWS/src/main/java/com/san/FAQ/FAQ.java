package com.san.FAQ;

import com.san.FAQCategory.FAQCategory;
import com.san.user.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class FAQ {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private User user;
    private String faq;
    @Column(columnDefinition = "VARCHAR(1024)")
    private String answer;
    @OneToOne
    private FAQCategory faq_category;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp faq_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp faq_updated_at;
    public FAQ() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFaq() {
        return faq;
    }

    public void setFaq(String faq) {
        this.faq = faq;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public FAQCategory getFaq_category() {
        return faq_category;
    }

    public void setFaq_category(FAQCategory faq_category) {
        this.faq_category = faq_category;
    }

    public Timestamp getFaq_created_at() {
        return faq_created_at;
    }

    public void setFaq_created_at(Timestamp faq_created_at) {
        this.faq_created_at = faq_created_at;
    }

    public Timestamp getFaq_updated_at() {
        return faq_updated_at;
    }

    public void setFaq_updated_at(Timestamp faq_updated_at) {
        this.faq_updated_at = faq_updated_at;
    }
}