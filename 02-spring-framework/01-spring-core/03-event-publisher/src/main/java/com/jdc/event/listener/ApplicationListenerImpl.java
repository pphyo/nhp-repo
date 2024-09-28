package com.jdc.event.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;

//@Component
public class ApplicationListenerImpl implements ApplicationListener<ApplicationEvent> {
	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
//		System.out.println("Context refresh event in Impl is occured.");
		
		if(event instanceof ContextClosedEvent) {
			System.out.println("Context close event is occured.");
		} else if(event instanceof ContextRefreshedEvent) {
			System.out.println("Context refresh event is occured.");
		} else if(event instanceof ContextStartedEvent) {
			System.out.println("Context start event is occured.");
		} else {
			System.out.println("Context stop event is occured.");
		}
	}

}
