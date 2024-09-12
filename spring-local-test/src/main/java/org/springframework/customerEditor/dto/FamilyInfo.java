package org.springframework.customerEditor.dto;

public class FamilyInfo {
	private String fatherName;
	private String motherName;

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public FamilyInfo(String fatherName, String motherName) {
		this.fatherName = fatherName;
		this.motherName = motherName;
	}

	public FamilyInfo() {}
}
