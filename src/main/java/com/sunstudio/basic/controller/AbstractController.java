package com.sunstudio.basic.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunstudio.basic.service.BasicService;

/**
 * 抽象controller
 * @author Lsatin
 * @date 2021年3月29日
 */
public abstract class AbstractController<T, S extends BasicService<T, Long>> {

	protected final static Logger LOGGER = LogManager.getLogger();
	
	protected abstract void setService(S service);
	
	protected abstract S getService();
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public List<T> list() {
		if (LOGGER.isTraceEnabled()) {
			LOGGER.trace("请求列表...");
		}
		return getService().list();
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	@ResponseBody
	public T get(@PathVariable(value = "id") Long id) {
		if (LOGGER.isTraceEnabled()) {
			LOGGER.trace("请求详情：{}", id);
		}
		return getService().get(id);
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public T save(@RequestBody T param) {
		if (LOGGER.isTraceEnabled()) {
			LOGGER.trace("请求保存：{}", param.toString());
		}
		return getService().save(param);
	}
	
	@RequestMapping(value = "/batchSave", method = RequestMethod.POST)
	@ResponseBody
	public List<T> batchSave(@RequestBody List<T> params) {
		if (LOGGER.isTraceEnabled()) {
			LOGGER.trace("请求批量保存：{}", params.toString());
		}
		return getService().batchSave(params);
	}
	
}
