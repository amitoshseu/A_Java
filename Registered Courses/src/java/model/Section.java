/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author amitoshseu
 */
//Bean:- Must be a default constructor(parameter less),Getter & setter
public class Section {
    private Course course;
    private int sectionNumber;
    private String facultyCode;

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
    
}
