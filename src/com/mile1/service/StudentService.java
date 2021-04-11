package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
	public int findNumberOfNullMarks(Student data[]) {
		int count = 0;
		for (Student s : data)
			try {
				if (s != null && s.getMarks() == null || s.getMarks().length == 0)
					count++;
			} catch (Exception e) {
				// TODO: handle exception
				e.getMessage();
			}
		return count;
	}

	public int findNumberOfNullNames(Student data[]) {
		int count = 0;
		for (Student s : data)
			if (s != null && s.getName() == null)
				count++;
		return count;
	}

	public int findNumberOfObjects(Student data[]) {
		int count = 0;
		for (Student s : data)
			if (s == null)
				count++;
		return count;
	}

}
