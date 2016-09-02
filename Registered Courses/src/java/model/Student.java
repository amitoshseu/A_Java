/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author amitoshseu
 */
@ManagedBean
public class Student {
    private String id;
    private String name;
    private List<Section> registeredSections;

    public Student(String id, String name) {
        this();
        this.id = id;
        this.name = name;
    }
    
    
    public Student() {
//        this.name ="Amitosh";
//        registeredSections = new ArrayList<>();
//        registeredSections.add(new Section(new Course("CSE1033","Data Structure"),3,"RB"));
//        registeredSections.add(new Section(new Course("CSE2015","Java"),1,"KMH"));
//        registeredSections.add(new Section(new Course("CSE3035","Info. System and Software engineering"),2,"RIK"));
//        registeredSections.add(new Section(new Course("CSE4033","Web and Internet Programming"),1,"AKMA"));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
//        if(id.equals("1234"))
//            this.name="Amitosh";
//        else this.name= "Aranya";
        String urlString = "http://my.seu.ac.bd/~kmhasan/_WebServices_/fetch_tempreg.php?id="+ id +"&sem=43";
        try {
            URL url = new URL(urlString);
           BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream()));
           String line;
           while((line = input.readLine()) != null){
               System.out.println(line);
           }
        } catch (MalformedURLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Section> getRegisteredSections() {
        return registeredSections;
    }

    public void setRegisteredSections(List<Section> registeredSections) {
        this.registeredSections = registeredSections;
    }
    public void addSection(Section section){
        registeredSections.add(section);
    }
}
