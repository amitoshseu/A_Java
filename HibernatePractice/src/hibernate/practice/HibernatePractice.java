
package hibernate.practice;

import java.util.List;
import model.Course;
import model.Section;
import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author amitoshseu
 */
public class HibernatePractice {
    public SessionFactory buildSession(){
        Configuration configuration = new Configuration();
        configuration.configure(HibernatePractice.class.getResource("hibernate.cfg.xml"));
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        return configuration.buildSessionFactory(serviceRegistry);
        
    }
    
    public HibernatePractice() {
            SessionFactory factory = buildSession();
            Session session = factory.openSession();
            
            List<Student> students = null;
            
            Transaction transaction = session.beginTransaction();
        
           try{
            
            Student s = new Student("2121","Amitosh");
          
            Section s1 = new Section(new Course("CSE1033","Data Structure",3),3,"RB");
            s.addCourse(s1);
            
            session.save(s1);
            session.save(s);
            students = session.createCriteria(Student.class).list();
            
            transaction.commit();
        }catch(Exception e){
            transaction.rollback();
        }
        students.forEach(System.out::println);
        session.close();
    }

    
    public static void main(String[] args) {
        new HibernatePractice();
    }
    
}
