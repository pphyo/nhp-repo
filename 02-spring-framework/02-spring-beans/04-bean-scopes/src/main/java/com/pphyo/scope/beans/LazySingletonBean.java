package com.pphyo.scope.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("lazyBean")
@Lazy
public class LazySingletonBean {

}
