package com.san.allergy;

import com.san.userInfo.UserInfo;

/**
 * Created by san on 12/07/17.
 */
public class DataAllergy {
    Allergy allergy;
    UserInfo userInfo;

    public DataAllergy() {

    }
    public DataAllergy(Allergy allergy, UserInfo userInfo) {
        this.allergy = allergy;
        this.userInfo = userInfo;
    }

    public Allergy getAllergy() {
        return allergy;
    }

    public void setAllergy(Allergy allergy) {
        this.allergy = allergy;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
