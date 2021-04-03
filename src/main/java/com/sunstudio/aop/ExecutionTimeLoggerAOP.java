package com.sunstudio.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**	执行时间日志AOP
 * @author Lsatin
 *
 */
@Component
public class ExecutionTimeLoggerAOP implements MethodInterceptor {
	
	/** log4j */
	private Logger LOGGER = LogManager.getLogger(this.getClass());
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		long beginTime = System.currentTimeMillis();
		String className = invocation.getThis().getClass().getCanonicalName();
		String methodName = invocation.getMethod().getName();
		String args = Arrays.deepToString(invocation.getArguments());
		try {
			LOGGER.info("Execution of [ {}#{}({}) ] beginning", className, methodName, args);
			Object obj = invocation.proceed();
			return obj;
		} catch (Throwable e) {
			throw e;
		} finally {
			LOGGER.info("Execution of [ {}#{} ] ended in {} ms", className, methodName, System.currentTimeMillis() - beginTime);
		}
	}

}
