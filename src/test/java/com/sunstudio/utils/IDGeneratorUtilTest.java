package com.sunstudio.utils;

import java.util.UUID;

import org.junit.Test;

/**
 * @author Lsatin 2019年11月2日
 *
 */
public class IDGeneratorUtilTest {

	@Test
	public void test() {
		System.out.println(UUID.randomUUID());
		System.out.println(IDGeneratorUtil.generateID());
		IDGeneratorUtil.printIDTime(IDGeneratorUtil.generateID());
		System.out.println(IDGeneratorUtil.getIDCreateTime(IDGeneratorUtil.generateID()));
	}

}
