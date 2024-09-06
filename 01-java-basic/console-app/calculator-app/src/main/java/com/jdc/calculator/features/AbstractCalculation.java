package com.jdc.calculator.features;

import com.jdc.core.AbstractFeature;
import com.jdc.core.InputUtils;

public abstract class AbstractCalculation extends AbstractFeature {

	public AbstractCalculation(int id, String featureName) {
		super(id, featureName);
	}

	@Override
	public void doBusiness() {
		// get digit one
		var d1 = getDigitOne();
		
		// get digit two
		var d2 = getDigitTwo();
		
		// show result
		calculate(d1, d2);
		
	}
	
	public abstract void calculate(int d1, int d2);
	
	private int getDigitOne() {
		return InputUtils.readInt("Digit one: ");
	}
	
	private int getDigitTwo() {
		return InputUtils.readInt("Digit two: ");
	}

}
