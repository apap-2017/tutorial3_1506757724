package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;

import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService {
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();
	
	@Override
	public StudentModel selectStudent(String npm) {
		// TODO Auto-generated method stub
		// Implement
		StudentModel student = null;
		for(int ii = 0; ii < studentList.size(); ii++) {
			if(studentList.get(ii).getNpm().equals(npm)) {
				student = studentList.get(ii);
				break;
			}
		}
		return student;
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		// TODO Auto-generated method stub
		return studentList;
	}

	@Override
	public void addStudent(StudentModel student) {
		// TODO Auto-generated method stub
		studentList.add(student);
	}
	
}
