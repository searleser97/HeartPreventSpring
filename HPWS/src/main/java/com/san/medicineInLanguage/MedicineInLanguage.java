package com.san.medicineInLanguage;

import com.san.language.Language;
import com.san.medicine.Medicine;
import com.san.textTranslated.TextTranslated;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(MedicineInLanguagePK.class)
public class MedicineInLanguage {

    @Id
    @ManyToOne
    private Language language;
    @Id
    @ManyToOne
    private Medicine medicine;
    @ManyToOne
    private TextTranslated medicine_translated;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp medicine_in_language_created_at;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp medicine_in_language_updated_at;

    public MedicineInLanguage() {
        
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public TextTranslated getMedicine_translated() {
        return medicine_translated;
    }

    public void setMedicine_translated(TextTranslated medicine_translated) {
        this.medicine_translated = medicine_translated;
    }

    public Timestamp getMedicine_in_language_created_at() {
        return medicine_in_language_created_at;
    }

    public void setMedicine_in_language_created_at(Timestamp medicine_in_language_created_at) {
        this.medicine_in_language_created_at = medicine_in_language_created_at;
    }

    public Timestamp getMedicine_in_language_updated_at() {
        return medicine_in_language_updated_at;
    }

    public void setMedicine_in_language_updated_at(Timestamp medicine_in_language_updated_at) {
        this.medicine_in_language_updated_at = medicine_in_language_updated_at;
    }
}