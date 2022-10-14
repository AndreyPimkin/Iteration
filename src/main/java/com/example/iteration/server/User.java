package com.example.iteration.server;

public class User {
    private String firstname;
    private String lastname;
    private String login;
    private String password;


    public User(String name, String surname, String login, String password) {
        this.firstname = name;
        this.lastname = surname;
        this.login = login;
        this.password = password;
    }

    public User() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
