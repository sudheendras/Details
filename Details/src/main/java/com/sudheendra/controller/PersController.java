package com.sudheendra.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sudheendra.daoimpl.PersonalDaoImpl;
import com.sudheendra.entity.Personal;
import com.sudheendra.form.FinalForm;
import com.sudheendra.form.LoginPage;
import com.sudheendra.form.Pers;

@Controller
public class PersController {
	@Autowired
	private SessionFactory sessionFactory;
	
	@RequestMapping(value = "/pers", params="saveclose")
	public ModelAndView saveandclose(@ModelAttribute("pers") Pers per){
		System.out.println(per.getFn()+"\t"+per.getFfn()+"\t"+per.getMfn()+"\t"+per.getPno()+"\t"+per.getLn()+"\t"+per.getEmail());
		Personal ps = new Personal();
		ps.setFirstname(per.getFn());
		ps.setLastname(per.getLn());
		ps.setFfullname(per.getFfn());
		ps.setMfullname(per.getMfn());
		ps.setEmailid(per.getEmail());
		ps.setPhonenumber(per.getPno());
		PersonalDaoImpl pdi = new PersonalDaoImpl();
		String st = pdi.personalInsert(sessionFactory, ps);
		ModelAndView mv = new ModelAndView("LoginForm");
		LoginPage loginpage = new LoginPage();
		mv.addObject("log", loginpage);
		return mv;
	}
	@RequestMapping(value="/pers",params="savenext")
	public ModelAndView saveandnext(@ModelAttribute("pers") Pers per){
		System.out.println(per.getFn()+"\t"+per.getFfn()+"\t"+per.getMfn()+"\t"+per.getPno()+"\t"+per.getLn()+"\t"+per.getEmail());
		Personal ps = new Personal();
		ps.setFirstname(per.getFn());
		ps.setLastname(per.getLn());
		ps.setFfullname(per.getFfn());
		ps.setMfullname(per.getMfn());
		ps.setEmailid(per.getEmail());
		ps.setPhonenumber(per.getPno());
		PersonalDaoImpl pdi = new PersonalDaoImpl();
		String st = pdi.personalInsert(sessionFactory, ps);
		ModelAndView mv = new ModelAndView("final");
		FinalForm form = new FinalForm();
		mv.addObject("finalForm", form);
		return mv;
	}
}
