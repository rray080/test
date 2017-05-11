package ray.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//@Aspect
public class SampleAdvice {
	
	//@Before("execution(* ray.aop.TestApplication.testMethod(..))")
	public void insertBefore(){
		System.out.println("insert before method execution");
	}
	
	//@AfterReturning("execution(* ray.aop.TestApplication.testMethod(..))")
	public void insertAfter(){
		System.out.println("Insert after method execution");
	}
}
