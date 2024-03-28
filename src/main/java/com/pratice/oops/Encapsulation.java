package com.pratice.oops;

public class Encapsulation {

    private String Username;
    private String Password;

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {

        this.Password = Password;
    }

    public String getUsername() {

        return Username;
    }

    public String getPassword() {

            return Password;
    }

    public static void main(String[] args) {

        Encapsulation en = new Encapsulation();
        en.setUsername("xyz@gmail.com");
        en.setPassword("12345");
        System.out.println(en.getUsername());
        System.out.println(en.getPassword());
    }
}
