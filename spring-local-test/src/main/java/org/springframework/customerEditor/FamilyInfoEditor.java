package org.springframework.customerEditor;

import org.springframework.dto.FamilyInfo;

import java.beans.PropertyEditorSupport;

public class FamilyInfoEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] s = text.split("_");
		FamilyInfo familyInfo = new FamilyInfo(s[0], s[1]);
		setValue(familyInfo);
	}
}
