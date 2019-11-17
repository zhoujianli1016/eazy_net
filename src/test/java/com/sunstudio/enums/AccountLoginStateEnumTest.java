package com.sunstudio.enums;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/** 账户登入状态枚举测试类
 * @author Lsatin 2019年11月2日
 */
public class AccountLoginStateEnumTest {

	@Test
	public void testGetLabelByCode() {
		System.out.println(AccountLoginStateEnum.getLabelByCode(0));
	}

	@Test
	public void testGetUrlByCode() {
		System.out.println(AccountLoginStateEnum.getUrlByCode(0));
	}
	
	@Test
	public void test() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println(mapper.writeValueAsString(AccountLoginStateEnum.ERROR));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
