package com.sudheendra.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sudheendra.entity.Login;

public class LoginDaoImpl {
	public List<Login> fetchLogin(SessionFactory sessionFactory,String user){
		boolean b = false;
		Session hsession = sessionFactory.openSession();
		System.out.println(hsession);
		String hql = "from Login l where l.username=:user";
		Query q = hsession.createQuery(hql);
		q.setParameter("user", user);
		System.out.println(q);
		List<Login> login = (List<Login>)q.list();
		return login;
	}
	public int insertLogin(SessionFactory sessionFactory, Login ilogin){
		Session hsession = sessionFactory.openSession();
		System.out.println(hsession);
		Transaction tx = hsession.beginTransaction();
		int res = (Integer)hsession.save(ilogin);
		System.out.println(res);
		tx.commit();
		return res;
	}
}
