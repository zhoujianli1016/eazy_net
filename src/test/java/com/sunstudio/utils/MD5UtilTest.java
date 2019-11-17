package com.sunstudio.utils;

import org.junit.Test;

public class MD5UtilTest {

	@Test
	public void testEncrypt() {
		System.out.println(MD5Util.encrypt("你好", true));
		System.out.println(MD5Util.encrypt("你好"));
		System.out.println(MD5Util.verify(MD5Util.encrypt("你好"), MD5Util.encrypt("你好", true)));
	}

	@Test
	public void testEncryptToMD5() {
	}

}
