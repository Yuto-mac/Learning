package function;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import entity.Course;
import entity.Gender;
import entity.Student;
import entity.Teacher;

public class DataAccess {
	
	public static List addStudents = new ArrayList<Student>() ;
	public static List addTeacher = new ArrayList<Teacher>() ;
	public static List addCourse = new ArrayList<Course>() ;
	public static List addGender = new ArrayList<Gender>() ;
	
	static Scanner sc = new Scanner(System.in) ;
	
		void searchGender() {
			
			System.out.println(addGender.toString());
			
		}
	
	
		Gender searchGenderById() {
			
		System.out.println("Please input student's id : ");
		int sid = sc.nextInt() ;
		System.out.println("Please input course's id : ");
		int cid = sc.nextInt() ;
		for (int i = 0; i < addGender.size(); i++) {
			Gender s = (Gender) addGender.get(i);
			if( s.getSid() == sid && s.getCid() == cid ) {
				System.out.println(s.toString());
				return s;
			}
		}
		System.out.println("no gender found!");
		return null;
		
	}
	
	
	void searchTeacherById() {
		
		System.out.println("Please input teacher's id: ");
		int tid = sc.nextInt() ;
		for (int i = 0; i < addTeacher.size(); i++) {
			Teacher s = (Teacher) addTeacher.get(i);
			if( s.getTid() == tid ) {
				System.out.println(s.toString());
				return ;
			}
		}
		System.out.println("no teacher found!");
		
	}
	
	
	void searchCourseById() {
	
		System.out.println("Please input course's id: ");
		int cid = sc.nextInt() ;
		for (int i = 0; i < addCourse.size(); i++) {
			Course s = (Course) addCourse.get(i);
			if( s.getcourseId() == cid ) {
				System.out.println(s.toString());
				return ;
			}
		}
		System.out.println("no course found!");
		
	}
	
	
	void searchStuentById() {
	
		System.out.println("Please input student's id: ");
		int sid = sc.nextInt() ;
		for (int i = 0; i < addStudents.size(); i++) {
			Student s = (Student) addStudents.get(i);
			if( s.getstuId() == sid ) {
				System.out.println(s.toString());
				return ;
			}
		}
		System.out.println("no student found!");
	}
	
	
	List<Gender> addGender() {
		
		Gender g = searchGenderById();
		if (g!=null) {
			System.out.println("Please input gender: ");
			double score = sc.nextDouble() ;
			g.setScore(score);
		}else {
			System.out.println("student or course is not found: ");
		}
		
		return null;
		
	}
	
	
	void searchCourse() {
		System.out.println(addCourse.toString());
	}
	
	
	List<Course> addCourse() {
		String st = "0";
		int cid ;
		do {
			System.out.println("Please input course information (input '-1' to end, input any continue):");
			st = sc.next() ;
			if("-1".equals(st)) {
				return addCourse ;
			}
			Course s = new Course() ;
			String str ;
			System.out.println("Input course's id: ");
			cid = sc.nextInt() ;
			s.setcourseId(cid);
			System.out.println("Input course's name: " );
			str = sc.next() ;
			s.setcourseName(str);
		
			addCourse.add(s) ;
		}while(true) ;
		
	}
	
	
	void searchTeacher() {
	
		System.out.println(addTeacher.toString());
		
	}
	
	
	List<Teacher> addTeacher() {
		
		String st = "0";
		int tid ;
		do {
			System.out.println("Please input teacher information (input '-1' to end, input any continue):");
			st = sc.next() ;
			if("-1".equals(st)) {
				return addTeacher ;
			}
			Teacher s = new Teacher() ;
			String str ;
			System.out.println("Input teacher's id: ");
			tid = sc.nextInt() ;
			s.setTid(tid);
			System.out.println("Input teacher's name: " );
			str = sc.next() ;
			s.setName(str);
			System.out.println("Input teacher's password: " );
			str = sc.next() ;
			s.setTpass(str+"dsfds");
			addTeacher.add(s) ;
		}while(true) ;
		
	}
	
	
	void searchStudent() {
	
		System.out.println(addStudents.toString());
		
	}
	
	
	List<Student> addStudent() {
	
		String st = "0";
		int sid ;
		do {
			System.out.println("Please input student information (input '-1' to end, input any continue):");
			st = sc.next() ;
			if("-1".equals(st)) {
				return addStudents ;
			}
			Student s = new Student() ;
			String str ;
			System.out.println("Input student's id: ");
			try {
				sid = sc.nextInt() ;
				s.setStuId(sid);
			} catch (InputMismatchException e) {
				return addStudents ;
			}
			System.out.println("Input student's name: " );
			s.setName(sc.next());
			System.out.println("Input student's gender(M/F): " );
			str = sc.next() ;
			if (str.equalsIgnoreCase("M")) {
				str = "Male" ;
			}
			if (str.equalsIgnoreCase("F")) {
				str = "Female" ;
			}
		
			s.setGender(str);
			addStudents.add(s) ;
		}while(true) ;
		
		
	}

}
