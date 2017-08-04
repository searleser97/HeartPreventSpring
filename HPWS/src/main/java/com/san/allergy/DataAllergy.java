package com.san.allergy;

import com.san.tokenUserInfo.TokenUserInfo;

/**
 * Created by san on 12/07/17.
 */
public class DataAllergy {
    Allergy allergy;
    TokenUserInfo tokenUserInfo;

    public DataAllergy() {

    }
    public DataAllergy(Allergy allergy, TokenUserInfo tokenUserInfo) {
        this.allergy = allergy;
        this.tokenUserInfo = tokenUserInfo;
    }

    public Allergy getAllergy() {
        return allergy;
    }

    public void setAllergy(Allergy allergy) {
        this.allergy = allergy;
    }

    public TokenUserInfo getTokenUserInfo() {
        return tokenUserInfo;
    }

    public void setTokenUserInfo(TokenUserInfo tokenUserInfo) {
        this.tokenUserInfo = tokenUserInfo;
    }
}
