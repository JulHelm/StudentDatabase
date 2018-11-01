package de.studentDatabase;

public class TestStudentDatabase {
	
	public static void main(String[] args) {
		
		StudentDatabase sd = new FileStudentDatabase();
		
		try {
			sd.addStudent("12345");
			
			String[] students = sd.readAllStudents();
			for (String student : students) {
				System.out.println(student);
			}
		} catch (StudentDatabaseException e) {
			System.out.println("Fehler");
			e.printStackTrace();
		}
		
		
	}
}
