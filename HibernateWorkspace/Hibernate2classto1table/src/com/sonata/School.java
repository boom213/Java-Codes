package com.sonata;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class School {
	@Id
	@GeneratedValue
	private int schoolId;
	private String schoolName;
	
	@Embedded 
	public School_Details schDetails;

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public School_Details getSchDetails() {
		return schDetails;
	}

	public void setSchDetails(School_Details schDetails) {
		this.schDetails = schDetails;
	}
}