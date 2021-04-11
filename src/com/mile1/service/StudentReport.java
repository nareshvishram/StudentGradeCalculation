package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

	public String findGrade(Student student) {
		int sum = 0;

		if (isLessThanThreshold(student.getMarks()))
			return "F";

		else {
			for (int mark : student.getMarks())
				sum += mark;
			if (sum < 150)
				return "D";
			else if (sum > 150 && sum <= 200)
				return "C";
			else if (sum > 200 && sum <= 250)
				return "B";
			else
				return "A";
		}

	}

	private boolean isLessThanThreshold(int[] marks) {
		for (int m : marks)
			if (m < 35)
				return true;
		return false;
	}

	public String validate(Student student) throws NullNameException, NullMarksArrayException, NullStudentException {
		if (student == null)
			return new NullStudentException().toString();
		else {
			if (student.getName() == null)
				return new NullNameException().toString();
			else if (student.getMarks() == null)
				return new NullMarksArrayException().toString();
		}
		return findGrade(student);

	}
}
