package com.san.userInfo;

/**
 * Created by san on 12/07/17.
 */
public class UserInfo {
    private Integer id;
    private String access_token;
    private String role;
    private String ip;
    private String agent;

    public UserInfo() {

    }

    public UserInfo(Integer id, String access_token, String role, String ip, String agent) {
        this.id = id;
        this.access_token = access_token;
        this.role = role;
        this.ip = ip;
        this.agent = agent;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
