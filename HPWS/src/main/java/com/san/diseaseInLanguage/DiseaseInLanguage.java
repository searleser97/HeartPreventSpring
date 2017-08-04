package com.san.diseaseInLanguage;

import com.san.disease.Disease;
import com.san.language.Language;
import com.san.textTranslated.TextTranslated;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(DiseaseInLanguagePk.class)
public class DiseaseInLanguage {

    @Id
    @ManyToOne
    private Disease disease;
    @Id
    @ManyToOne
    private Language language;
    @ManyToOne
    private TextTranslated disease_translated;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp disease_in_language_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp disease_in_language_updated_at;

    public DiseaseInLanguage() {

    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public TextTranslated getDisease_translated() {
        return disease_translated;
    }

    public void setDisease_translated(TextTranslated disease_translated) {
        this.disease_translated = disease_translated;
    }

    public Timestamp getDisease_in_language_created_at() {
        return disease_in_language_created_at;
    }

    public void setDisease_in_language_created_at(Timestamp disease_in_language_created_at) {
        this.disease_in_language_created_at = disease_in_language_created_at;
    }

    public Timestamp getDisease_in_language_updated_at() {
        return disease_in_language_updated_at;
    }

    public void setDisease_in_language_updated_at(Timestamp disease_in_language_updated_at) {
        this.disease_in_language_updated_at = disease_in_language_updated_at;
    }
}