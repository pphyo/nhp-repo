package com.pphyo.scope.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("pBean")
@Scope("prototype")
public class PrototypeBean {

}
