package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	static Student[] data = new Student[8];
	static {
		for (int i = 0; i < data.length; i++) {
			data[0] = new Student("A", new int[] { 72, 73, 74 });
			data[1] = new Student("A", new int[] { 75, 76, 77 });
			data[2] = new Student("A", new int[] { 99, 99, 99 });
			data[3] = new Student("A", new int[] { 100, 100, 99 });
			data[4] = new Student("A", new int[] { 13, 88, 13 });
			data[5] = new Student("A", new int[] { 14, 14, 99 });
			data[6] = new Student("A", new int[] { 77, 55, 12 });
			data[7] = new Student("A", new int[] { 13, 88, 13 });
		}
	}

	public static void main(String[] args) {

		StudentService service = new StudentService();
		StudentReport report = new StudentReport();
		System.out.println("Grade Calucation for each studnet:");
		String x = "";
		for (int i = 0; i < data.length; i++) {

			try {
				x = report.validate(data[i]);
			} catch (NullMarksArrayException e) {
				x = "NullMarksException Occured";

			} catch (NullNameException e) {
				x = "NullNameException Occured";

			} catch (NullStudentException e) {
				x = "NullStudentException Occured";

			}
			System.out.println("Grade= " + x);
		}
		System.out.println("Number of Objects with Marks array as null= " + service.findNumberOfNullMarks(data));
		System.out.println("Number of Objects with Name  as null= " + service.findNumberOfNullNames(data));
		System.out.println("Number of Objects with Marks array as null= " + service.findNumberOfObjects(data));
	}

}
