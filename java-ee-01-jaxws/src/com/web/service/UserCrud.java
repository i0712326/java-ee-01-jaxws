package com.web.service;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.jpa.model.User;
@RolesAllowed({"webservice"})
@WebService(
		name="userCrud",
		targetNamespace="https://wildfly.itstikk.pro"
)
@SOAPBinding(style=Style.RPC)
public interface UserCrud {
	@WebMethod(action="save",operationName="saveUser")
	@WebResult(name="saveResult")
	public void save(@WebParam(name="userParam") User user);
	@WebMethod(action="get",operationName="getUser")
	@WebResult(name="user")
	public List<User> getUsers();
}
