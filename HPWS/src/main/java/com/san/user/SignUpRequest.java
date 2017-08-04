package com.san.user;

public class SignUpRequest {
    private String username;
    private String email;
    private String name;
    private String last_name;
    private String password;
    private String birth_date;
    private String access_token;
    private Integer sex_id;
    private Integer country_id;
    private Integer language_id;


    public SignUpRequest() {
    }

    public SignUpRequest(String username, String email, String name, String last_name, String password, String birth_date, String access_token, Integer sex_id, Integer country_id, Integer language_id) {
        this.username = username;
        this.email = email;
        this.name = name;
        this.last_name = last_name;
        this.password = password;
        this.birth_date = birth_date;
        this.access_token = access_token;
        this.sex_id = sex_id;
        this.country_id = country_id;
        this.language_id = language_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Integer getSex_id() {
        return sex_id;
    }

    public void setSex_id(Integer sex_id) {
        this.sex_id = sex_id;
    }

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }
}
