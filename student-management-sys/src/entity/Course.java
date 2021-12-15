package entity;

public class Course {
	
	/*
	 * �γ̱�� 
	 * ����
	 */
	private int courseId ;
	private String courseName ;
	
	public int getcourseId() {
		return courseId;
	}
	public void setcourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getcourseName() {
		return courseName;
	}
	public void setcourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
	}
	

}
