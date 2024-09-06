package com.jdc.calculator;

import com.jdc.calculator.features.FeatureForAdd;
import com.jdc.calculator.features.FeatureForDivide;
import com.jdc.calculator.features.FeatureForMultiply;
import com.jdc.calculator.features.FeatureForTakeaway;
import com.jdc.core.ConsoleApplication;

public class CalculatorApplication {

	public static void main(String[] args) {
		var addFeature = new FeatureForAdd(1, "Add");
		var takeawayFeature = new FeatureForTakeaway(2, "Takeaway");
		var multiplyFeature = new FeatureForMultiply(3, "Multiply");
		var divideFeature = new FeatureForDivide(4, "Divide");
		
		var application = new ConsoleApplication("Calculator App", 
				addFeature, takeawayFeature, multiplyFeature, divideFeature);
		
		application.launch();
	}

}
