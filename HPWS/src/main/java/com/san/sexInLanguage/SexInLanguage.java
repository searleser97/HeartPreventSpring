package com.san.sexInLanguage;

import com.san.language.Language;
import com.san.sex.Sex;
import com.san.textTranslated.TextTranslated;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(SexInLanguagePK.class)
public class SexInLanguage {

    @Id
    @ManyToOne
    private Language language;
    @Id
    @ManyToOne
    private Sex sex;
    @ManyToOne
    private TextTranslated sex_in_language;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp sex_in_language_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp sex_in_language_updated_at;

    public SexInLanguage() {
        
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public TextTranslated getSex_in_language() {
        return sex_in_language;
    }

    public void setSex_in_language(TextTranslated sex_in_language) {
        this.sex_in_language = sex_in_language;
    }

    public Timestamp getSex_in_language_created_at() {
        return sex_in_language_created_at;
    }

    public void setSex_in_language_created_at(Timestamp sex_in_language_created_at) {
        this.sex_in_language_created_at = sex_in_language_created_at;
    }

    public Timestamp getSex_in_language_updated_at() {
        return sex_in_language_updated_at;
    }

    public void setSex_in_language_updated_at(Timestamp sex_in_language_updated_at) {
        this.sex_in_language_updated_at = sex_in_language_updated_at;
    }
}