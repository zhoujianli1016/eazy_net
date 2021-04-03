package com.sunstudio.utils;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * @author Lsatin
 * @date 2021年4月1日
 */
public class JsonUtil {

	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	
  static {
      // 解决实体未包含字段反序列化时抛出异常
      OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
      // 对于空的对象转json的时候不抛出错误
      OBJECT_MAPPER.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
      // Include.NON_EMPTY 属性为 空（""） 或者为 NULL 都不序列化，则返回的json是没有这个字段的。这样对移动端会更省流量
      OBJECT_MAPPER.setSerializationInclusion(JsonInclude.Include.ALWAYS);
      // LocalDateTime 的序列化
      OBJECT_MAPPER.registerModule(new SimpleModule());
      // 禁用日期序列化转换
      OBJECT_MAPPER.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
      // 字段名的大小写根据蛇形规则进行序列化
      OBJECT_MAPPER.setPropertyNamingStrategy(com.fasterxml.jackson.databind.PropertyNamingStrategy.SNAKE_CASE);
      OBJECT_MAPPER.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
  }
  
  /**
   * JSON 序列化
   * @param JSON JSON字符串
   * @param clazz 序列化类型
   * @return {@link T} 序列实体
   * @throws IOException
   */
  public static <T> T toRead(String JSON, Class<T> clazz) throws IOException {
  	if (Objects.nonNull(OBJECT_MAPPER)) {
			return OBJECT_MAPPER.readValue(JSON, clazz);
		}
		return null;
  }
  
  /**
   * JSON 序列化
   * @param JSON JSON字符串
   * @param clazz 序列化类型
   * @return {@link T} 序列实体
   * @throws IOException
   */
  public static <T> List<T> toReadList(String JSON, Class<T[]> clazz) throws IOException {
  	T[] read = toRead(JSON, clazz);
  	if (Objects.nonNull(read)) {
			return Arrays.asList(read);
		}
		return null;
  }
  
  public static <T> String toJSON(T bean) throws JsonProcessingException {
  	if (Objects.nonNull(OBJECT_MAPPER)) {
			if (bean instanceof java.lang.String) {
				return bean.toString();
			}
			return OBJECT_MAPPER.writeValueAsString(bean);
		}
		return null;
  }
	
}
