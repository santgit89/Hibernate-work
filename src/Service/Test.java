package Service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.Courses;
import Model.Student;

public class Test {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("/resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();

		Courses cr = new Courses();
		cr.setCourseName("Java");
		cr.setCourseAuthor("James Gosling");
		
		Student st = new Student();
		st.setName("Preeti");
		st.setCourse("DotNet");
		st.setCourses(cr);

		s.save(st);
		s.getTransaction().commit();
		s.close();
		
		st=null;
		s=sf.openSession();
		st= s.get(Student.class, 1);
		System.out.println(st.getCourse());
		
		

	}
}
