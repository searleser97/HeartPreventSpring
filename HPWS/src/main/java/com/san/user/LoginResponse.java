package com.san.user;

public class LoginResponse {
    private String message;
    private String jwToken;

    public LoginResponse() {

    }

    public LoginResponse(String message, String jwToken) {
        this.message = message;
        this.jwToken = jwToken;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getJwToken() {
        return jwToken;
    }

    public void setJwToken(String jwToken) {
        this.jwToken = jwToken;
    }
}
