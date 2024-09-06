package com.jdc.lambda;

@FunctionalInterface
public interface DataGetter extends DataGetterSuper {
		
	@Override
	boolean equals(Object obj);

	@Override
	String toString();

	@Override
	int hashCode();
	
}
