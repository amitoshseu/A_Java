package model;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amitoshseu
 */
public class User {
    private String username;
    private String fullname;
    private ArrayList<String> phones;
    
  
    public User() {
        phones = new ArrayList<>();
    }

    public User(String username, String fullname) {
        this.username = username;
        this.fullname = fullname;
        phones = new ArrayList<>();
        phones.add("1234");
        phones.add("4569");
        phones.add("48787");
        phones.add("01763356347");
    }
    
    

    public String getUsername() {
        return username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }
    
}
