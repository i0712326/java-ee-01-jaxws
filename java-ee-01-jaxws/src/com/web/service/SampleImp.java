package com.web.service;

public class SampleImp implements Sample {

	@Override
	public String sample(String param) {
		return "Hello World Webservice "+param;
	}

}
