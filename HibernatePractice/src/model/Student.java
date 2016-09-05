
package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author amitoshseu
 */
@Entity
public class Student {
    @Id
    private String studentId;
    private String studentName;
    
    @OneToMany
    private List<Section> registeredSections;
    
    public Student() {
        registeredSections = new ArrayList<>();
        
        

    }

    public Student(String studentId, String studentName) {
        this();
        this.studentId = studentId;
        this.studentName = studentName;
    }
    
    public Student(String studentId, String studentName, List<Section> registeredSections) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.registeredSections = registeredSections;
    }

    public List<Section> getRegisteredSections() {
        return registeredSections;
    }

    public void setRegisteredSections(List<Section> registeredSections) {
        this.registeredSections = registeredSections;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public void addCourse(Section section){
        registeredSections.add(section);
    }
    
    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", registeredSections=" + registeredSections + '}';
    }
    
}
