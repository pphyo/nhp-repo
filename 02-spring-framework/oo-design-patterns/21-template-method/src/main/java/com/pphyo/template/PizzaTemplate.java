package com.pphyo.template;

public abstract class PizzaTemplate {
	
	protected String name = this.getClass().getSimpleName();
	
	// template
	public final void order() {
		prepare();
		bake();
		topping();
		serve();
		payment();
	}
	
	public abstract void prepare();
	public abstract void bake();
	public abstract void topping();
	public abstract void serve();
	public abstract void payment();

}
