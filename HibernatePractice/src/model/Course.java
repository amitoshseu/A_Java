
package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author amitoshseu
 */
@Entity
public class Course {
    @Id
    private String courseCode;
    private String courseTitle;
    private double creditHours;
    
    
    
    public Course() {
    }

    public Course(String courseCode, String courseTitle, double creditHours) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(double creditHours) {
        this.creditHours = creditHours;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    @Override
    public String toString() {
        return "Course{" + "courseCode=" + courseCode + ", courseTitle=" + courseTitle + ", creditHours=" + creditHours + '}';
    }
    
    
}
