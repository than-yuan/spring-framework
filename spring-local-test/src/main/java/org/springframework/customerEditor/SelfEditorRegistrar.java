package org.springframework.customerEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.customerEditor.dto.FamilyInfo;




public class SelfEditorRegistrar implements PropertyEditorRegistrar {
	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(FamilyInfo.class, new FamilyInfoEditor());
	}
}
