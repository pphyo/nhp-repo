package com.pphyo.decorator;

public class EncryptionDecorator extends DatasourceDecorator {

	public EncryptionDecorator(Datasource wrappe) {
		super(wrappe);
	}
	
	@Override
	public void write(String data) {
		wrappe.write("%s + %s".formatted(data, "Encryption"));
	}
	
}
