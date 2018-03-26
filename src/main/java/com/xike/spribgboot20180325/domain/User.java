package com.xike.spribgboot20180325.domain;

public class User {
    private String username;
    private String userpass;

    public String getUsername() {
        return username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                '}';
    }

    public User(String username, String userpass) {
        this.username = username;
        this.userpass = userpass;
    }
}
