package hibernate_postgresql;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

//User_Name=postgres
//Password=walwalwalides

public class RunnerDB {
	
	
	
	


	public void curd() {		
	
//			SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		create(session);
//			read(session);

		session.close();
	}

	private void delete(Session session) {
		System.out.println("Deleting Student record...");

		Student student1 = (Student) session.get(Student.class, "Adel");
		session.beginTransaction();
		session.delete(student1);
		session.getTransaction().commit();
	}

	private void update(Session session) {
		System.out.println("Updating Student Name...");

		Student student1 = (Student) session.get(Student.class, "Sami");
		student1.setName("Adel");
		student1.setMatricule(102);

		session.beginTransaction();
		session.saveOrUpdate(student1);
		session.getTransaction().commit();
	}

	private static void create(Session session) {

		System.out.println("Creating Students records...");
		session.beginTransaction();
//			--------------------------------------
		Student student1;
//			if (session.get(Student.class, "Sami")!=null) {
		student1 = new Student();
		student1.setName("Sami");
		student1.setMatricule(100);
		session.save(student1);
//			}
		// --------------------------------------
		Student student2;
//			if (session.get(Student.class, "Lotfi")!=null)
//			{
		student2 = new Student();
		student2.setName("Lotfi");
		student2.setMatricule(101);
		session.save(student2);
//			}
		// --------------------------------------

		session.getTransaction().commit();

	}

	private static void read(Session session) {
		Query q = session.createQuery("Select name from Student");

		List<Student> Students = q.list();

		System.out.println("Reading Students records...");
		System.out.printf("%-30.30s  %-30.30s%n", "Name", "Matricule");
		for (Student c : Students) {
			System.out.printf("%-30.30s  %-30.30s%n", c.getName(), c.getMatricule());
		}
	}

}
