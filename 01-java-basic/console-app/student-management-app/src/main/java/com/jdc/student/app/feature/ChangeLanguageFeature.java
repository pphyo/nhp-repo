package com.jdc.student.app.feature;

import java.util.Locale;
import java.util.ResourceBundle;

import com.jdc.core.AbstractFeature;
import com.jdc.core.ChangeLanguageService;
import com.jdc.core.InputUtils;
import com.jdc.student.app.StudentManagementApplication;
import com.jdc.student.impl.util.SMException;

public class ChangeLanguageFeature extends AbstractFeature {
	
	private String[] menus = {"1. English", "2. Myanmar"};
	
	public ChangeLanguageFeature() {
		super(6, ChangeLanguageService.getResource().getString("app.menu.six"));
	}

	@Override
	public void doBusiness() {
		for(var menu : menus) {
			System.out.println(menu);
		}
		System.out.println();
		
		var code = InputUtils.readInt("Choose option: ");
		ChangeLanguageService.setResource(ResourceBundle.getBundle("language", getLocaleFromCode(code)));
				
		System.out.println();
		System.out.println("Change language successfully.");
		
		refresh();

	}
	
	private void refresh() {
		var app = StudentManagementApplication.getApplication().clone();
		app.launch();
	}
	
	private Locale getLocaleFromCode(int code) {
		return switch(code) {
		case 1 -> Locale.ENGLISH;
		case 2 -> Locale.of("my");
//		case 3 -> Locale.JAPANESE;
		default -> throw new SMException("Wrong Option!");
		};
	}
	
	@Override
	public void refreshMenu() {
		setFeatureName(ChangeLanguageService.getResource().getString("app.menu.six"));
	}
	
}
