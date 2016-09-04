/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author amitoshseu
 */
@Entity//(name="USER_DETAILS")
public class UserDetails {
    @Id
   // @Column(name = "USER_ID")
    private int userId;
    //@Column(name="USER_NAME")
    private String userName;
    @ElementCollection
    private Set<Address> listOfAddress = new HashSet();
    
    
    public UserDetails() {
    }
    
    public UserDetails(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
    
    
    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserDetails{" + "userId=" + userId + ", userName=" + userName + '}';
    }

    public Set<Address> getListOfAddress() {
        return listOfAddress;
    }

    public void setListOfAddress(Set<Address> listOfAddress) {
        this.listOfAddress = listOfAddress;
    }
    
}
