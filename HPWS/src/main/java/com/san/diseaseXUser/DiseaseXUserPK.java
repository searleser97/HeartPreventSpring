package com.san.diseaseXUser;

import com.san.disease.Disease;
import com.san.user.User;

import java.io.Serializable;

public class DiseaseXUserPK implements Serializable {
    private User user;
    private Disease disease;
}
