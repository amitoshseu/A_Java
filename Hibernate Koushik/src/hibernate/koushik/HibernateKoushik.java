/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.koushik;

import model.UserDetails;
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
public class HibernateKoushik {
    
    public SessionFactory buildSession(){
        Configuration configuration = new Configuration();
        configuration.configure(HibernateKoushik.class.getResource("hibernate.cfg.xml"));
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        return configuration.buildSessionFactory(serviceRegistry);
        
    }
    public HibernateKoushik() {
        SessionFactory factory = buildSession();
        Session session = factory.openSession();
        
        Transaction transaction = session.beginTransaction();
        try{
            UserDetails user = new UserDetails();
//            user.setUserId(1);
//            user.setUserName("Amitosh Gain");
//            
//            user.setUserId(2);
//            user.setUserName("Mr Perfect");
//            
            session.save(new UserDetails(3,"Abul"));
            session.save(new UserDetails(4,"Babul"));
            transaction.commit();
        }catch(Exception e){
            transaction.rollback();
        }
}
    
    public static void main(String[] args) {
        new HibernateKoushik();  
    }
    
}
