package com.jdc.core.out;

public class TableView implements Drawable {
	
	private TableViewModel model;

	public TableView(TableViewModel model) {
		this.model = model;
	}
	
	@Override
	public void draw() {
		drawLine(model.getMaxSize());
		System.out.println(model.getHeader());
		drawLine(model.getMaxSize());
		
		for(var row : model.getRows()) {
			System.out.println(row);
		}
		
		drawLine(model.getMaxSize());
	}

}
