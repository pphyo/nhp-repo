package com.jdc.core;

public abstract class AbstractFeature {

	private int id;
	private String featureName;

	public AbstractFeature(int id, String featureName) {
		super();
		this.id = id;
		this.featureName = featureName;
	}

	public int getId() {
		return id;
	}

	public String getFeatureName() {
		return featureName;
	}
	
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	
	public abstract void doBusiness();
	public abstract void refreshMenu();
	
	public void showMenu() {
		System.out.println("%d. %s".formatted(id, featureName));
	}

}
