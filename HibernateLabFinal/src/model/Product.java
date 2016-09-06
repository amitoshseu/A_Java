/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author students
 */
@Entity
public class Product {
    @Id @GeneratedValue
    private int productId;
    private String productName;

    public Product() {
    }

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName=" + productName + '}';
    }
    
}
