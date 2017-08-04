package com.san.tokenUserInfo;

import java.util.List;

/**
 * Created by san on 12/07/17.
 */
public class TokenUserInfo {
    private Integer id;
    private String access_token;
    private List<String> roles;
    private String ip;
    private String agent;
    private String language;

    public TokenUserInfo() {

    }

    public TokenUserInfo(Integer id, String access_token, List<String> roles, String ip, String agent, String language) {
        this.id = id;
        this.access_token = access_token;
        this.roles = roles;
        this.ip = ip;
        this.agent = agent;
        this.language = language;
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

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
