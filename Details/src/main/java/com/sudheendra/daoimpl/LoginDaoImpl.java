package com.sudheendra.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class LoginDaoImpl {
	public boolean validateLogin(SessionFactory sessionFactory,String user,String pass){
		boolean b = false;
		Session hsession = sessionFactory.openSession();
		System.out.println(hsession);
		Query q = hsession.createSQLQuery("select username from login where username='"+user+"' and password='"+pass+"'");
		System.out.println(q);
		List login = q.list();
		System.out.println(login.size());
		if(!login.isEmpty())
			b = true;
		hsession.close();
		return b;
	}
}
