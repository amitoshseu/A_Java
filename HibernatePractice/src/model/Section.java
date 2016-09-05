/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author amitoshseu
 */
@Entity
public class Section {
    
    
    private int sectionNumber;
    @Id
    private String facultyCode;
    
    @ManyToOne
    private Course course;
    public Section() {
    }

    public Section(Course course, int sectionNumber, String facultyCode) {
        this.course = course;
        this.sectionNumber = sectionNumber;
        this.facultyCode = facultyCode;
    }

    public String getFacultyCode() {
        return facultyCode;
    }

    public void setFacultyCode(String facultyCode) {
        this.facultyCode = facultyCode;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    @Override
    public String toString() {
        return "Section{" + "sectionNumber=" + sectionNumber + ", facultyCode=" + facultyCode + ", course=" + course + '}';
    }
    
    
}
