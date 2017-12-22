package com.sudheendra.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sudheendra.daoimpl.FinalDaoImpl;
import com.sudheendra.entity.Final;
import com.sudheendra.form.FinalForm;
import com.sudheendra.form.LoginPage;

@Controller
public class FinalController {
	@Autowired
	private SessionFactory sf;
	@RequestMapping(value="/fin", method=RequestMethod.POST)
	public ModelAndView submitFinal(@ModelAttribute("finalform") FinalForm ff){
		Final fin = new Final();
		fin.setFirstname(ff.getFn());
		fin.setNoticeperiod(ff.getNp());
		fin.setCurrentctc(ff.getCctc());
		fin.setCurrentemployer(ff.getCe());
		fin.setExpectedctc(ff.getEctc());
		FinalDaoImpl fdi = new FinalDaoImpl();
		String res = fdi.insertFinal(sf, fin);
		ModelAndView mv = new ModelAndView("LoginForm");
		LoginPage loginpage = new LoginPage();
		mv.addObject("log", loginpage);
		return mv;
	}
}
	