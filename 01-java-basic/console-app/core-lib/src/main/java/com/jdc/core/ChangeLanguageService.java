package com.jdc.core;

import java.util.Locale;
import java.util.ResourceBundle;

public class ChangeLanguageService {

	private static Locale locale = Locale.ENGLISH;
	private static ResourceBundle resource = ResourceBundle.getBundle("language", locale);
	
	public static Locale getLocale() {
		return locale;
	}

	public static void setLocale(Locale locale) {
		ChangeLanguageService.locale = locale;
	}

	public static ResourceBundle getResource() {
		return resource;
	}

	public static void setResource(ResourceBundle resource) {
		ChangeLanguageService.resource = resource;
	}

}
