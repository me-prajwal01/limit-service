package com.home.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.limitservice.bean.Limit;
import com.home.limitservice.config.MyConfig;

@RestController
public class LimitController {

	@Autowired
	private MyConfig config;

	public MyConfig getConfig() {
		return config;
	}

	public void setConfig(MyConfig config) {
		this.config = config;
	}

	@GetMapping(value = "/limits")
	public Limit retriveLimit() {
		return new Limit(config.getMin(), config.getMax());
	}

}
