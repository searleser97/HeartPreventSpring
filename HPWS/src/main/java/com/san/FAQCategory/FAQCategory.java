package com.san.FAQCategory;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "faq_category")
public class FAQCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String faq_category;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp faq_category_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp faq_category_updated_at;

    public FAQCategory() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFaq_category() {
        return faq_category;
    }

    public void setFaq_category(String faq_category) {
        this.faq_category = faq_category;
    }

    public Timestamp getFaq_category_created_at() {
        return faq_category_created_at;
    }

    public void setFaq_category_created_at(Timestamp faq_category_created_at) {
        this.faq_category_created_at = faq_category_created_at;
    }

    public Timestamp getFaq_category_updated_at() {
        return faq_category_updated_at;
    }

    public void setFaq_category_updated_at(Timestamp faq_category_updated_at) {
        this.faq_category_updated_at = faq_category_updated_at;
    }
}