package com.jdc.mod.app;

import com.jdc.app.service.AppService;

public class ModUsingApp {

	public static void main(String[] args) {
		
		AppService service = new AppService();
		service.insert(null);
		System.out.println(service.findById(0));
	}

}
