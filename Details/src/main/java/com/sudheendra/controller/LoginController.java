package com.sudheendra.controller;

import java.util.ArrayList;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sudheendra.daoimpl.LoginDaoImpl;
import com.sudheendra.form.LoginPage;
import com.sudheendra.form.Pers;

@Controller
public class LoginController {
	@Autowired
	private SessionFactory sessionFactory;
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String fetchLogin(Map<String, Object> model) {
		LoginPage lp = new LoginPage();
		model.put("log", lp);
        return "LoginForm";
    }
 
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView validateLogin(@ModelAttribute("log") LoginPage lp, ModelMap model) {
    	System.out.println(lp.getUser()+"\t"+lp.getPass());
    	LoginDaoImpl ldi = new LoginDaoImpl();
    	boolean b = ldi.validateLogin(sessionFactory,lp.getUser(),lp.getPass());
    	ArrayList<String> list = new ArrayList();
    	model.addAttribute("username",lp.getUser());
    	model.addAttribute("password", lp.getPass());
        	if(b){
        		ModelAndView mv = new ModelAndView("personal");
        		Pers pers = new Pers();
        		mv.addObject("pers", pers);
        		return mv;
        	}else{
        		return new ModelAndView("index");	
        	}
        }
}
