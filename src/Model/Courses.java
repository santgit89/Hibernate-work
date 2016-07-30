package Model;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class Courses {
	
	
	
	private String CourseName;
	private String CourseAuthor;

	
	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public String getCourseAuthor() {
		return CourseAuthor;
	}

	public void setCourseAuthor(String courseAuthor) {
		CourseAuthor = courseAuthor;
	}

}
