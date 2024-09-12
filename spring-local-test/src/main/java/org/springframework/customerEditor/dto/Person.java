package org.springframework.customerEditor.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("tom")
	private String name;
	@Value("David_Marry")
	private FamilyInfo familyInfo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FamilyInfo getFamilyInfo() {
		return familyInfo;
	}

	public void setFamilyInfo(FamilyInfo familyInfo) {
		this.familyInfo = familyInfo;
	}
}
