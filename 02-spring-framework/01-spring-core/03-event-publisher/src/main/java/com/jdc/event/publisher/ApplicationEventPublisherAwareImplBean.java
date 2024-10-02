package com.jdc.event.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.jdc.event.bean.EventBean;

@Component
public class ApplicationEventPublisherAwareImplBean implements ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}
	
	public void publish(EventBean event) {
		applicationEventPublisher.publishEvent(event);
	}

}
