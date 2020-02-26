package org.launchcode.demo.models;

import java.util.Date;

public class User {
    private int userId;
    private static int nextUserId=1;
    private String username;
    private String password;
    private String email;
    private Integer phoneNumber;
    private Role role;
    private Date createdDate;
    private Date lastUpdate;

    public User(String username, String password, String email, Integer phoneNumber) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userId = nextUserId;
        nextUserId++;
        this.createdDate = new Date();
        this.role = Role.STANDARD;
    }

    public int getUserId() {
        return userId;
    }

    public static int getNextUserId() {
        return nextUserId;
    }

    public static void setNextUserId(int nextUserId) {
        User.nextUserId = nextUserId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
