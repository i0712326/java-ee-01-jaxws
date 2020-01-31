package com.web.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class SimpleItemImp implements SimpleItem {
	@WebMethod
	@Override
	public List<String> getItems() {
		
		List<String> list = new ArrayList<String>();
		list.add("Item01");
		list.add("Item02");
		list.add("Item03");
		return list;
	}

}
