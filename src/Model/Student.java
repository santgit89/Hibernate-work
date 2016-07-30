package Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TStudent")
public class Student {

	@Id
	@GeneratedValue
	private int id;
	@Column(name = "Tname")
	private String name;
	@Column(name = "course")
	private String course;
	
	@Embedded
	private Courses courses;
	
/*	Set<Courses> cour=new HashSet<>();
*/	

	public int getId() {
		return id;
	}

	public Courses getCourses() {
		return courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
