package com.web.service;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebService;

import com.ejb.crud.UserEjb;
import com.jpa.model.User;

@WebService(
		endpointInterface="com.web.service.UserCrud",
		portName="userCrudPort",
		serviceName="userCrudService"
)
public class UserCrudImp implements UserCrud {
	
	@EJB
	private UserEjb userEjb;
	
	@Override
	public void save( User user) {
		userEjb.save(user);
	}
	
	@Override
	public List<User> getUsers() {
		return userEjb.getUsers();
	}
	
}
