package com.jdc.student.app.model;

import java.util.List;

import com.jdc.student.api.domain.Student;

public class StudentOutput {
	
	private static final String ID_HEADER = "ID";
	private static final String NAME_HEADER = "Name";
	private static final String DOB_HEADER= "Dob";
	private static final String ROLL_NUMBER_HEADER = "Roll Number";
	private static final String FATHER_NAME_HEADER = "Father Name";
	private static final String ADDRESS_HEADER = "Address";
	
	private static int[] lengths = new int[6];
	
	private List<Student> list;
	
	static {
		lengths[0] = ID_HEADER.length();
		lengths[1] = NAME_HEADER.length();
		lengths[2] = DOB_HEADER.length();
		lengths[3] = ROLL_NUMBER_HEADER.length();
		lengths[4] = FATHER_NAME_HEADER.length();
		lengths[5] = ADDRESS_HEADER.length();
	}
	
	public StudentOutput(List<Student> list) {
		this.list = list;
	}

	public void printTable() {
		// update max length
		updateMaxLength();
		
		var formatBuilder = new StringBuilder();
		// for id
		formatBuilder.append("| %").append(lengths[0]).append("s ");
		// for name
		formatBuilder.append("| %-").append(lengths[1]).append("s ");
		formatBuilder.append("| %-").append(lengths[2]).append("s ");
		formatBuilder.append("| %-").append(lengths[3]).append("s ");
		formatBuilder.append("| %-").append(lengths[4]).append("s ");
		formatBuilder.append("| %-").append(lengths[5]).append("s |");
				
		printLine();
		// header
		printHeader(formatBuilder.toString());
		printLine();
		
		// rows
		printRows(formatBuilder.toString());
		
		printLine();
		
//		System.out.println();
	}
	
	private void printLine() {
		for(var length : lengths) {
			System.out.print("+");
			for(int i = 0; i < length + 2; i ++) {
				System.out.print("-");
			}
		}
		System.out.print("+");
		System.out.println();
	}
	
	private void printHeader(String format) {
		System.out.println(format.formatted(ID_HEADER, NAME_HEADER, DOB_HEADER, ROLL_NUMBER_HEADER, FATHER_NAME_HEADER, ADDRESS_HEADER));
	}
	
	private void printRows(String format) {
		for(var student : list) {
			System.out.println(format.formatted(student.getId(), student.getName(), student.getDob(), student.getRollNo(), student.getFatherName(), student.getAddress()));
		}
	}
	
	private void updateMaxLength() {
		for(var student : list) {
			updateMaxLength(String.valueOf(student.getId()), ID_HEADER);
			updateMaxLength(String.valueOf(student.getName()), NAME_HEADER);
			updateMaxLength(String.valueOf(student.getDob()), DOB_HEADER);
			updateMaxLength(String.valueOf(student.getRollNo()), ROLL_NUMBER_HEADER);
			updateMaxLength(String.valueOf(student.getFatherName()), FATHER_NAME_HEADER);
			updateMaxLength(String.valueOf(student.getAddress()), ADDRESS_HEADER);
		}
	}

	private void updateMaxLength(String value, String header) {
		switch(header) {
			case "ID" -> { if(value.length() > lengths[0]) lengths[0] = value.length(); }
			case "Name" -> { if(value.length() > lengths[1]) lengths[1] = value.length(); }
			case "Dob" -> { if(value.length() > lengths[2]) lengths[2] = value.length(); }
			case "Roll Number" -> { if(value.length() > lengths[3]) lengths[3] = value.length(); }
			case "Father Name" -> { if(value.length() > lengths[4]) lengths[4] = value.length(); }
			case "Address" -> { if(value.length() > lengths[5]) lengths[5] = value.length(); }
		}
	}

}
