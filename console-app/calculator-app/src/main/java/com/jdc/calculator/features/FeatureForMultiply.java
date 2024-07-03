package com.jdc.calculator.features;

public class FeatureForMultiply extends AbstractCalculation {

	public FeatureForMultiply(int id, String featureName) {
		super(id, featureName);
	}

	@Override
	public void calculate(int d1, int d2) {
		var result = d1 * d2;
		System.out.println("%d * %d = %d".formatted(d1, d2, result));
	}

}