package com.pphyo.abst_fact.product;

public abstract class CheckBox {

	private boolean check;

	public abstract void toggleCheck();
	
	public void setCheck(boolean check) {
		this.check = check;
	}

	public boolean isCheck() {
		return check;
	}

}
