package com.mile1.exception;

public class NullStudentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		String exception = "NullStudentException occured inside the toString() function";
		return exception;
	}

}
