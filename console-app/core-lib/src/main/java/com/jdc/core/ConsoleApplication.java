package com.jdc.core;

public class ConsoleApplication {
	
	private String appName;
	private AbstractFeature[] features;
	
	public ConsoleApplication(String appName, AbstractFeature... features) {
		super();
		this.appName = appName;
		this.features = features;
	}
	
	public void launch() {
		// show welcome message
		showMessage("Welcome to %s".formatted(appName));
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
		showMessage("Thank you");
		
		InputUtils.getScanner().close();
	}
	
	private AbstractFeature getUserSelectedFeature() {
		
		for(var feature : features) {
			feature.showMenu();
		}
		
		System.out.println();
		var selectedId = InputUtils.readInt("Choose option: ");
		
		return features[selectedId - 1];
	}
	
	private boolean askToDoAgain() {
		System.out.println();
		
		var result = InputUtils.readString("Do you want to continue?(y/others): ");
		
		System.out.println();
		return result.equalsIgnoreCase("Y");
	}

	private void showMessage(String message) {
		String star = "";
		
		for(int i = 0, l = message.length(); i < l; i ++) {
			star += "*";
		}
		
		System.out.println("**%s**".formatted(star));
		System.out.println("* %s *".formatted(message));
		System.out.println("**%s**".formatted(star));
	}
	

}
