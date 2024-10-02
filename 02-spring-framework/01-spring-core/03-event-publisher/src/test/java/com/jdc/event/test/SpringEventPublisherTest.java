package com.jdc.event.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.event.EventPublisherConfig;
import com.jdc.event.bean.EventBean;
import com.jdc.event.publisher.ApplicationEventPublisherAwareImplBean;

public class SpringEventPublisherTest {
	
	@Test
	void test() {
		
		try(var ctx = new AnnotationConfigApplicationContext()) {
						
			ctx.register(EventPublisherConfig.class);
			
			// make refresh and refresh event occured
			ctx.refresh();
			
			var bean = ctx.getBean(ApplicationEventPublisherAwareImplBean.class);
			bean.publish(new EventBean("Event bean object."));
			
		}
		
	}

}
