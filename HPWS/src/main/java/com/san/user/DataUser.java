package com.san.user;

import com.san.userInfo.UserInfo;

/**
 * Created by san on 12/07/17.
 */
public class DataUser {
    private User user;
    private UserInfo userInfo;

    public DataUser() {

    }

    public DataUser(User user, UserInfo userInfo) {
        this.user = user;
        this.userInfo = userInfo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
