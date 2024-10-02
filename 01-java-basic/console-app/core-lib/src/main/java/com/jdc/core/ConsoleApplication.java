package com.jdc.core;

import static com.jdc.core.StringUtils.*;

import java.text.MessageFormat;

import static com.jdc.core.ChangeLanguageService.*;

public class ConsoleApplication implements Cloneable {
	
	private String appName;
	private AbstractFeature[] features;
	
	public ConsoleApplication(String appName, AbstractFeature... features) {
		super();
		this.appName = appName;
		this.features = features;
	}
	
	public void launch() {
		// show welcome message
		showMessage(MessageFormat.format(getResource().getString("app.title"), appName));
		System.out.println();

		do {

			// show menus in features and get user selected menu
			AbstractFeature feature = getUserSelectedFeature();
			
			// execute selected feature (or) do business
			System.out.println();
			showMessage(feature.getFeatureName());
			System.out.println();
			
			feature.doBusiness();
			
			// ask to do
		} while(askToDoAgain());
		
		// exit and show message
		showMessage(getResource().getString("app.message.thanks"));
		
		InputUtils.getScanner().close();
	}
	
	private AbstractFeature getUserSelectedFeature() {
		
		for(var feature : features) {
			feature.showMenu();
		}
		
		System.out.println();
		var selectedId = InputUtils.readInt(getResource().getString("app.menu.choose"));
		
		return features[selectedId - 1];
	}
	
	private boolean askToDoAgain() {
		System.out.println();
		
		var result = InputUtils.readString(getResource().getString("app.message.continue"));
		
		System.out.println();
		return result.equalsIgnoreCase("Y");
	}
	
	public ConsoleApplication clone() {
		for(var feature : features) {
			feature.refreshMenu();
		}
		return new ConsoleApplication(appName, features);
	}

}
