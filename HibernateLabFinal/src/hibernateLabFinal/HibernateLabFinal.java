/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateLabFinal;
import model.Customer;
import model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author students
 */
public class HibernateLabFinal {
    
    public SessionFactory buildSession(){
        Configuration configuration = new Configuration();
        configuration.configure(HibernateLabFinal.class.getResource("hibernate.cfg.xml"));
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        return configuration.buildSessionFactory(serviceRegistry);
        
    }
    public HibernateLabFinal() {
        SessionFactory factory = buildSession();
        Session session = factory.openSession();
        
        Transaction transaction = session.beginTransaction();
        try{
            
            Customer customer = new Customer();
            customer.setCustomerName("Amitosh Gain");
            
            Product product = new Product();
            product.setProductName("500 GB hard & Philips 21");
            
            
            
            customer.setProduct(product);
            
            session.save(customer);
            session.save(product);
            
            transaction.commit();
            session.close();
        }catch(Exception e){
            transaction.rollback();
        }
}
    
    public static void main(String[] args) {
        new HibernateLabFinal();  
    }
    
}

