package com.pphyo.template;

public class ChicagoPizza extends PizzaTemplate {
	
	@Override
	public void prepare() {
		System.out.println("%s is preparing.".formatted(name));		
	}

	@Override
	public void bake() {
		System.out.println("%s is baking.".formatted(name));		
	}

	@Override
	public void topping() {
		System.out.println("%s is topping.".formatted(name));		
	}

	@Override
	public void serve() {
		System.out.println("%s is served.".formatted(name));		
	}

	@Override
	public void payment() {
		System.out.println("%s is paid.".formatted(name));		
	}

}
