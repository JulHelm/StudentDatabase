package de.studentDatabase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileStudentDatabase implements StudentDatabase{

		
	@SuppressWarnings("null")
	@Override
	public String[] readAllStudents() throws StudentDatabaseException {
		try (BufferedReader b = new BufferedReader(new FileReader("datenbank.txt"))){
			String[] a = new String[10];
			int i = 0;
			String line = null;
			while ((line=b.readLine()) != null) {
				a[i++] = line;
				
			}return a;
			
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
