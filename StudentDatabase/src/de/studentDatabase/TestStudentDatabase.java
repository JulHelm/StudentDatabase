package de.studentDatabase;

public class TestStudentDatabase {
	
	public static void main(String[] args) {
		
		StudentDatabase sb = new FileStudentDatabase();
		
		try {
			String[] students = sb.readAllStudents();
			for (String student : students) {
				System.out.println(student);
			}
		} catch (StudentDatabaseException e) {
			e.printStackTrace();
		}
		
		
	}
}
