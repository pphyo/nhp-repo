package com.jdc.app;

public sealed interface CanAdd permits Addition {
	int add(int a, int b);
}
