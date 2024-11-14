package com.pphyo.decorator;

public class FileDatasource implements Datasource {

	private String dataToWrite;
	
	@Override
	public void write(String data) {
		dataToWrite = data;
		System.out.println("Data has been writed successfully.");
	}
	
	@Override
	public String read() {
		return dataToWrite;
	}

}
