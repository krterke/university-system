package interfaces;

import users.*;
public interface CanViewStudents {
	public static void viewStudents() {
		
	}
	public static void viewStudentInfo(Student student) {
		System.out.println(student.toString());
	}
}
