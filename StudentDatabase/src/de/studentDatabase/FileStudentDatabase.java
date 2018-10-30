package de.studentDatabase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileStudentDatabase implements StudentDatabase{

		
	@Override
	public String[] readAllStudents() throws StudentDatabaseException {
		try (BufferedReader b = new BufferedReader(new FileReader("datenbank.txt"))){
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void addStudent(String name) throws StudentDatabaseException {
		// TODO Auto-generated method stub
		
	}

}
