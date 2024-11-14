package com.pphyo.composite;

import java.util.ArrayList;
import java.util.List;

public class BaseHead extends BaseDepartment implements Department {

	protected List<Department> children;

	public BaseHead(int id, String name) {
		super(id, name);
		children = new ArrayList<>();
	}

	public void add(Department department) {
		this.children.add(department);
	}

	public void remove(Department department) {
		this.children.remove(department);
	}

	@Override
	public void printDepartmentName() {
		this.children.forEach(Department::printDepartmentName);
	}

}
