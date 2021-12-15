package function;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import entity.Course;
import entity.Gender;
import entity.Student;
import entity.Teacher;
import utils.FileUtils;

public class FunctionMenu {
	
	static Scanner sc = new Scanner(System.in) ;
	
	DataAccess dataAccess = new DataAccess();
	FileUtils file = new FileUtils() ;
	
	public void function() {
		
		file.readCourseFile();
		file.readGenderFile();
		file.readTeacherFile();
		file.readStudentFile();
		
		int select ;
		
		do {
			
			menu();
			
			select = sc.nextInt() ;
			if( select == 0 ) {
				break ;
			}
			switch (select) {
			
			case 1:
				List<Student> addStudent = dataAccess.addStudent() ;
				System.out.println(addStudent.toString());
				file.saveStudentFile();
				break;
			case 2:
				dataAccess.addCourse() ;
				file.saveCourseFile();
				break;
			case 3:
				dataAccess.addTeacher() ;
				file.saveTeacherFile();
				break;
			case 4:
				dataAccess.addGender() ;
				file.saveGenderFile();
				break;
			case 5:
				dataAccess.searchStudent() ;
				break;
			case 6:
				dataAccess.searchCourse() ;
				break;
			case 7:
				dataAccess.searchTeacher() ;
				break;
			case 8:
				dataAccess.searchGender() ;
				break;
			case 9:
				dataAccess.searchStuentById() ;
				break;
			case 10:
				dataAccess.searchCourseById() ;
				break;
			case 11:
				dataAccess.searchTeacherById() ;
				break;
			case 12:
				dataAccess.searchGenderById() ;
				break;
				
			default:
				System.out.println("exit");
				break;
			}
			
		}while(select!=0) ;
		
	}
	

	public void menu() {
		System.out.println("****** Operation Menu ******");
		System.out.println("1: add a students.");
		System.out.println("2: add a courses.");
		System.out.println("3: add a teachers.");
		System.out.println("4: add a ganders.");
		System.out.println("5: list all students.");
		System.out.println("6: list all courses.");
		System.out.println("7: list all teachers.");
		System.out.println("8: list all ganders.");
		System.out.println("9: search a students.");
		System.out.println("10: search a courses.");
		System.out.println("11: search a teachers.");
		System.out.println("12: search a ganders.");
		System.out.println("0: exit the program.");
		System.out.print("Please input a number to run the program:");
	}
	

}
