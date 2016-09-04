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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author amitoshseu
 */
@Entity//(name="USER_DETAILS")
public class UserDetails {
    @Id @GeneratedValue
    private int userId;
    private String userName;
    @OneToOne
    @JoinColumn(name="vehicleId")
    private Vehicle vehicle;
    
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


}
