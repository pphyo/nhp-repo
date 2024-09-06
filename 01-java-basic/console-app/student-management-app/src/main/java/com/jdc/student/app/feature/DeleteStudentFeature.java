package com.jdc.student.app.feature;

import com.jdc.core.ChangeLanguageService;
import com.jdc.core.InputUtils;

public class DeleteStudentFeature extends StudentCrudFeature {

	public DeleteStudentFeature() {
		super(5, ChangeLanguageService.getResource().getString("app.menu.five"));
	}
	
	@Override
	public void doBusiness() {
		try {
			
			var idForDelete = InputUtils.readInt("Enter ID for delete: ");
			studentApi.delete(idForDelete);
			
			System.out.println();
			System.out.println("Delete student successfully.");
			
		} catch (NumberFormatException e) {
			System.out.println();
			System.out.println("Enter digit for ID");
		} catch (Exception e) {
			System.out.println();
			System.out.println(e.getMessage());
		}
	}
	
	@Override
	public void refreshMenu() {
		setFeatureName(ChangeLanguageService.getResource().getString("app.menu.five"));
	}

}
