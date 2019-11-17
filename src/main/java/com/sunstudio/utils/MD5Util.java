package com.sunstudio.utils;

import java.security.MessageDigest;

import org.apache.commons.codec.Charsets;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/** MD5工具类
 * @author Lsatin 2019年11月17日
 */
public class MD5Util {
	
	/**
	 * 十六进制数字（小写）
	 */
  private static final char[] DIGITS_LOWER = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

  /**
   * 十六进制（大写）
   */
  private static final char[] DIGITS_UPPER = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
	
	/**
	 * 文本加密<br/>
	 * Apache MD5加密方式
	 * @param data 文本
	 * @return 32位十六进制字符串
	 */
	public static String encrypt(String data) {
		return DigestUtils.md5Hex(data);
	}
	
	public static String encrypt(String data, boolean toLowerCase) {
		try {
			final byte[] input = data.getBytes(Charsets.UTF_8);
			MessageDigest md5 = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
			md5.update(input);
			final int l = input.length;
			final char[] out = new char[l << 1];
			for (int i = 0, j = 0; i < l; i++) {
				out[j++] = toLowerCase ? DIGITS_LOWER[(0xF0 & input[i]) >>> 4] : DIGITS_UPPER[(0xF0 & input[i]) >>> 4];
        out[j++] = toLowerCase ? DIGITS_LOWER[0x0F & input[i]] : DIGITS_UPPER[0x0F & input[i]];
			}
			return new String(out);
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
	/**
	 * 验证MD5
	 * @param data 明文
	 * @param hex 密文
	 * @return
	 */
	public static boolean verify(String data, String hex) {
		String hexStr = MD5Util.encrypt(hex);
		if (hexStr.equalsIgnoreCase(data)) {
			return true;
		}
		return false;
	}
	
}
