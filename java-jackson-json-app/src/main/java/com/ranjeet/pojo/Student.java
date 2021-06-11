package com.ranjeet.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Student {
	
	@JsonProperty("student_id")
	private Integer studentId;
	@JsonProperty("student_name")
	private String studentname;
	@JsonProperty("student_skill")
	private String studentSkill;

}
