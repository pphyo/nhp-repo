package com.pphyo.decorator;

public class DatasourceDecorator implements Datasource {
	
	protected Datasource wrappe;
	
	public DatasourceDecorator(Datasource wrappe) {
		this.wrappe = wrappe;
	}

	@Override
	public void write(String data) {
		wrappe.write(data);
	}

	@Override
	public String read() {
		return wrappe.read();
	}

}
