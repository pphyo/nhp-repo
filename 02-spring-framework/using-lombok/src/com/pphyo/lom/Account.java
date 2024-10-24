package com.pphyo.lom;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(exclude = {"role"})
public class Account {

	private String email;
	private String password;
	private String role;
	private int age;

}
