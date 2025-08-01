package models;

import constants.AccountStatus;

public class Account {
    private int id;
    private String pwd;
    private AccountStatus status;

    public void login() {}
    public void logout(){}
    public void resetPwd() {}

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public AccountStatus getStatus() {
        return this.status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
}