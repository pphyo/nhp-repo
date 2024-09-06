package com.jdc.app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.jdc.app.model.UsingException;

public class ExceptionDemoApp {

	public static void main(String[] args) {
		new FinallyDemo().perform();
	}

	static void useWithReflection() throws InvocationTargetException, IllegalAccessException {
		UsingException ex = new UsingException();

		Method[] methods = ex.getClass().getDeclaredMethods();

		for (Method m : methods) {
			m.setAccessible(true);
			if (m.getName() == "execute") {
				m.invoke(ex, "Hello execute");
			} else {
				m.invoke(ex);
			}
		}
	}

}
