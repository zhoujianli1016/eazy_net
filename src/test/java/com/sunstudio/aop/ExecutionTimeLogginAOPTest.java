package com.sunstudio.aop;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sunstudio.enums.AccountLoginStateEnum;

/**
 * @author Lsatin
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/application.xml")
public class ExecutionTimeLogginAOPTest {

	@Test
	public void testAfterReturning() {
		AccountLoginStateEnum.getLabelByCode(0);
	}

	@Test
	public void testBefore() {
		fail("Not yet implemented");
	}

}
