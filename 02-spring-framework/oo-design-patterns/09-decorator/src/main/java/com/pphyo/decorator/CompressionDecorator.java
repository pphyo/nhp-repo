package com.pphyo.decorator;

public class CompressionDecorator extends DatasourceDecorator {

	public CompressionDecorator(Datasource wrappe) {
		super(wrappe);
	}
	
	@Override
	public void write(String data) {
		wrappe.write("%s + %s".formatted(data, "Compression"));
	}

}
