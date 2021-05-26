package com.company.model;


import java.lang.constant.Constable;

public class Authentication {
    private String login;
    private String password;

    public Authentication(){

    }
    public Authentication(String longin, String password){
        this.login = longin;
        this.password = password;
    }
    public String getLogin(){
        return login;
    }
    public void setLogin(){
        this.login = login;

    }
    public String getPassword(){
        return password;
    }
    public void setPassword(){
        this.password = password;
    }
    public boolean authorization(String login, String password){
        while (this.login.equals(login) && this.password.equals(password)) {
            if (this.login.equals(login) && this.password.equals(password)) {
                Magazine magazine = new Magazine();
                    return true;
            } else {
                System.out.println("Incorrect passwords or login");
                return false;
            }
        }
        return false;
    }

}
