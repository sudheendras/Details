package com.sudheendra.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.SessionFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sudheendra.daoimpl.LoginDaoImpl;
import com.sudheendra.entity.Login;

@Controller
public class LoginController {
	@Autowired
	private SessionFactory sessionFactory;
	/*@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String fetchLogin() {
        return "LoginForm";
    }*/
 
    @RequestMapping(value = "/login", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String validateLogin(HttpServletRequest request) throws Exception{
    		LoginDaoImpl ldi = new LoginDaoImpl();
    		System.out.println(request.getParameter("firstName"));
    		List<Login> empList = (List<Login>)ldi.fetchLogin(sessionFactory,request.getParameter("firstName"));
    		Login log = (Login)empList.get(0);
    		ObjectMapper mapperObj = new ObjectMapper();
    		String jsonStr = mapperObj.writeValueAsString(log);
    		return jsonStr;
        }
    @RequestMapping(value="/insert",method=RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String insertLogin(HttpServletRequest request) throws Exception{
    	LoginDaoImpl ldi= new LoginDaoImpl();
    	Login ilogin = new Login();
    	System.out.println(request.getParameter("test"));
  /*  	ilogin.setNo(Integer.parseInt(request.getParameter("ino")));
    	ilogin.setUsername(request.getParameter("iuser"));
    	ilogin.setPassword(request.getParameter("ipass"));*/
    	int res = ldi.insertLogin(sessionFactory, ilogin);
    	ObjectMapper mapperObj = new ObjectMapper();
		String jsonStr = mapperObj.writeValueAsString(res);
		return jsonStr;
    }
}
