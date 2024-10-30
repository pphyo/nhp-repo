package com.pphyo.lom;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {

	private String email;
	private String password;
	private String role;
	private int age;

}
