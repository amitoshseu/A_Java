/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.koushik;

import model.Address;
import model.UserDetails;
import model.Vehicle;
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
            user.setUserName("First User");
            
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleName("Car");
            
            user.setVehicle(vehicle);
            
            session.save(user);
            session.save(vehicle);
            
            transaction.commit();
            session.close();
        }catch(Exception e){
            transaction.rollback();
        }
}
    
    public static void main(String[] args) {
        new HibernateKoushik();  
    }
    
}
