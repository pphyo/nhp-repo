package com.jdc.name.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NameAndAliasTest {
	
	@Test
	void test() {
		
		try(var ctx = new GenericXmlApplicationContext("classpath:/beans.xml")) {
			
			var names = ctx.getBeanDefinitionNames();
			
			for(var name : names) {
				
				var aliases = ctx.getAliases(name);
				
				System.out.printf("Bean Name: %s", name);
				
				if(aliases.length > 0) {
					
					System.out.print(" | Aliases: ");
					
					for(var i = 0; i < aliases.length; i ++) {
						System.out.print(aliases[i]);
						
						if(i != aliases.length - 1) {
							System.out.print(", ");
						}
					}
				}
				System.out.println();
			}
			
		}
		
	}

}
