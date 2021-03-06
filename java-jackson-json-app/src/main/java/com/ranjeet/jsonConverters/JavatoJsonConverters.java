package com.ranjeet.jsonConverters;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ranjeet.pojo.Student;

public class JavatoJsonConverters {

	public static void main(String[] args) throws IOException {
		// convertMultipleJavaObjtoJson();
		//convertSingleJavaObjtoJson();
		
		//convertJsonToJavaObject();
		
		convertJsonArrayToJavaObject();

	}

	public static void convertSingleJavaObjtoJson() throws JsonProcessingException {

		Student s = new Student();
		s.setStudentId(137);
		s.setStudentname("Golden kumar");
		s.setStudentSkill("Java");
		ObjectMapper objMapper = new ObjectMapper();
		String strStudentJson = objMapper.writeValueAsString(s);
		System.out.println(strStudentJson);

	}

	public static void convertMultipleJavaObjtoJson() throws JsonProcessingException {

		Student s1 = new Student();
		s1.setStudentId(136);
		s1.setStudentname("Suraj kumar");
		s1.setStudentSkill("ISC");

		Student s2 = new Student();
		s2.setStudentId(137);
		s2.setStudentname("Golden kumar");
		s2.setStudentSkill("Java");

		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(s1);
		listStudent.add(s2);

		ObjectMapper objMapper = new ObjectMapper();
		String strStudentJson = objMapper.writeValueAsString(listStudent);
		System.out.println(strStudentJson);

	}

	public static void convertJsonToJavaObject() throws JsonParseException, JsonMappingException, IOException {

		File f = new File("student.json");
		ObjectMapper obj = new ObjectMapper();
		Student student = obj.readValue(f, Student.class);
       System.out.println(student);
	}
	
	
	
	public static void convertJsonArrayToJavaObject() throws JsonParseException, JsonMappingException, IOException {

		File f = new File("students.json");
		ObjectMapper obj = new ObjectMapper();
		Student[] student =  obj.readValue(f, Student[].class);
       System.out.println(student);
       for(Student s :student) {
    	   System.out.println(s);
       }
	}

}
