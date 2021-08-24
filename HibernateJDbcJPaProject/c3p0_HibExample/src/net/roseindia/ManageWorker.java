package net.roseindia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import net.roseindia.HibernateUtil;

//import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class ManageWorker {
//private static SessionFactory sf;
//private static ServiceRegistry serviceRegistry;

public static void main(String[] args) {
	
//try {
//Configuration configuration = new Configuration();
//configuration.configure();
//serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
//configuration.getProperties()).build();
//sf = configuration.buildSessionFactory(serviceRegistry);
//} catch (Throwable ex) {
//System.err.println("Failed to create sessionFactory object." + ex);
//throw new ExceptionInInitializerError(ex);
//}
	
	
//	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();


SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
Session session = sessionFactory.openSession();
session.beginTransaction();

//For passing Date of birth as String
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
Date dob=null;
try {
dob = sdf.parse("1987-05-21");
} catch (ParseException e) {
e.printStackTrace();
}

Worker worker = new Worker();
worker.setFirstname("Alexander");
worker.setLastname("Houstan");
worker.setBirthDate(dob);
worker.setCellphone("919595959595");
session.save(worker);

session.getTransaction().commit();
session.close();

}
}