package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import entity.Course;
import entity.Gender;
import entity.Student;
import entity.Teacher;
import function.DataAccess;

public class FileUtils {

	static DataAccess dataAccess = new DataAccess();
	public static void saveStudentFile() {
		
		
		
		try {
			File file = new File("Student.txt") ;
			if( !file.exists() ) {
				file.createNewFile() ;
			}else {

				BufferedWriter writer = new BufferedWriter(new FileWriter("Student.txt",true)) ;
				if( dataAccess.addStudents != null ) {
					System.out.println(dataAccess.addStudents.toString());
					for (int i = 0; i < dataAccess.addStudents.size(); i++) {
						Student s = (Student) dataAccess.addStudents.get(i);
						writer.write(s.getstuId()+" "+s.getName()+" "+s.getGender()+"\n");
					}
				}
				writer.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void saveCourseFile() {
		
		try {
			DataAccess dataAccess = new DataAccess();
			
			
			File file = new File("Course.txt") ;
			if( !file.exists() ) {
				file.createNewFile() ;
			}else {
				BufferedWriter writer = new BufferedWriter(new FileWriter("Course.txt",true)) ;
				if( dataAccess.addCourse != null ) {
					for (int i = 0; i < dataAccess.addCourse.size(); i++) {
						Course s = (Course) dataAccess.addCourse.get(i);
						writer.write(s.getcourseId()+" "+s.getcourseName()+"\n");
					}
				}
				writer.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void saveTeacherFile() {
		
		DataAccess dataAccess = new DataAccess();
		
		
		try {
			File file = new File("Teacher.txt") ;
			if( !file.exists() ) {
				file.createNewFile() ;
			}else {
				BufferedWriter writer = new BufferedWriter(new FileWriter("Teacher.txt",true)) ;
				if( dataAccess.addTeacher != null ) {
					for (int i = 0; i < dataAccess.addTeacher.size(); i++) {
						Teacher s = (Teacher) dataAccess.addTeacher.get(i);
						writer.write(s.getTid()+" "+s.getName()+" "+ s.getTpass() +"\n");
					}
				}
				writer.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void saveGenderFile() {
		
		DataAccess dataAccess = new DataAccess();
		
		
		try {
			File file = new File("Gender.txt") ;
			if( !file.exists() ) {
				file.createNewFile() ;
			}else {
				BufferedWriter writer = new BufferedWriter(new FileWriter("Gender.txt",true)) ;
				if( dataAccess.addTeacher != null ) {
					for (int i = 0; i < dataAccess.addGender.size(); i++) {
						Gender s = (Gender) dataAccess.addGender.get(i);
						writer.write(s.getCid()+" "+s.getSid()+" "+ s.getScore() +"\n");
					}
				}
				writer.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readStudentFile() {
		
		try {
			BufferedReader r = new BufferedReader(new FileReader("Student.txt")) ;
			String in ;
			while( (in = r.readLine())!= null) {
				String[] split = in.split(" ");
				Student s = new Student();
				s.setStuId(Integer.parseInt(split[0]));
				s.setName(split[1]);
				s.setGender(split[2]);
				dataAccess.addStudents.add(s) ;
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void readCourseFile() {
		
		try {
			BufferedReader r = new BufferedReader(new FileReader("Course.txt")) ;
			String in ;
			while( (in = r.readLine())!= null) {
				String[] split = in.split(" ");
				Course c = new Course(Integer.parseInt(split[0]), split[1]);
				dataAccess.addCourse.add(c);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void readTeacherFile() {
		
		try {
			BufferedReader r = new BufferedReader(new FileReader("Teacher.txt")) ;
			String in ;
			while( (in = r.readLine())!= null) {
				String[] split = in.split(" ");
				Teacher t = new Teacher();
				t.setTid(Integer.parseInt(split[0]));
				t.setName(split[1]);
				t.setTpass(split[2].substring(0,split[2].length()-4));
				dataAccess.addTeacher.add(t);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void readGenderFile() {
		
		try {
			BufferedReader r = new BufferedReader(new FileReader("Gender.txt")) ;
			String in ;
			while( (in = r.readLine())!= null) {
				String[] split = in.split(" ");
				Gender t = new Gender();
				t.setCid(Integer.parseInt(split[0]));
				t.setSid(Integer.parseInt(split[1]));
				t.setScore(Double.parseDouble(split[2]));
				dataAccess.addGender.add(t);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
