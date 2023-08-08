package com.training.spring.pms.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AuthAspect {

	@Before("execution(* com.training.spring.pms.service.ProductServiceImpl.saveProduct(..))")
	public void check(JoinPoint joinPoint) {
		System.out.println("###You are getting authenticated .. Please wait !");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}

	
}