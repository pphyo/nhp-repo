package com.jdc.event.listener;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.jdc.event.bean.EventBean;

@Component
public class AnnotationAppListenter {
	
	@EventListener(ContextRefreshedEvent.class)
	private void onRefresh() {
		System.out.println("Refresh event in Annotation is occured.");
	}
	
	@EventListener
	private void onOccurEventBean(EventBean event) {
		System.out.println(event);
	}

}
