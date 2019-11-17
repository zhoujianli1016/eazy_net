package com.sunstudio.aop;

import java.lang.reflect.Method;
import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

/**	执行时间日志AOP
 * @author Lsatin
 *
 */
@Component
public class ExecutionTimeLoggerAOP implements MethodBeforeAdvice, AfterReturningAdvice {
	
	/**
	 * log4j
	 */
	private Logger logger = LogManager.getLogger(this.getClass());
	
	/**
	 * 开始时间
	 */
	private long beginTime = 0;
	
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		long elapsedTime = System.nanoTime() - beginTime;
		String className = arg3.getClass().getCanonicalName();
		String methodName = arg1.getName();
		logger.info("Execution of [ " + className + "#" + methodName + " ] ended in [ " + new BigDecimal(elapsedTime).divide(new BigDecimal(1000000)) + " ] milliseconds");
	}

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		beginTime = System.nanoTime();
	}

}
