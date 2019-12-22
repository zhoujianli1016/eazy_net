package com.sunstudio.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Lsatin
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/application.xml")
public class ExecutionTimeLogginAOPTest {

	@Test
	public void testAfterReturning() {
	}

	@Test
	public void testBefore() {
	}

}
