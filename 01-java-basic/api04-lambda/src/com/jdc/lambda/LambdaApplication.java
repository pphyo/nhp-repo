package com.jdc.lambda;

public class LambdaApplication extends ScienceCalculator {

	public static void main(String[] args) {
		new LambdaApplication().runForMethodReference();
	}
	
	void runForMethodReference() {
		DataGetter lamOne = Reference::getData;
		System.out.println(lamOne.get());
		
		Calculator lamTwo = super::min;
		System.out.println(lamTwo.calculate(20, 10));
		
		Readable lamThree = Reference::new;
		lamThree.read("Constructor reference");
	}
	
	void runForCalculator() {
		Calculator cal = (x, y) -> x + y;
		System.out.println(cal);
		System.out.println(cal.calculate(10, 20));
	}
	
	void runForReadable() {
		Readable rd = text -> System.out.println("%s is readed!".formatted(text));
			
		rd.read("We are all bad in someone's story");
	}

	void runForDataGetter() {
		DataGetter withImpl = new DataGetterImpl();
		
		int i = 20;

		DataGetter withAnon = new DataGetter() {
			@Override
			public String get() {
				return "Hello from annonymous inner class!";
			}
		};

		System.out.println(withImpl.get());
		System.out.println(withAnon.get());

		DataGetter withLamb = () -> "Hello from lambda!" + i;

		System.out.println(withLamb.get());
	}
	
	@Override
	public double min(int a, int b) {
		return Math.max(a, b);
	}

}
