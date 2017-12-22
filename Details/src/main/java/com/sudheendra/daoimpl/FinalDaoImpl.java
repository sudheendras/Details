package com.sudheendra.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sudheendra.entity.Final;

public class FinalDaoImpl {
	public String insertFinal(SessionFactory sf, Final fi){
		Session hsession = sf.openSession();
		Transaction tx = hsession.beginTransaction();
		String res = (String)hsession.save(fi);
		tx.commit();
		hsession.close();
		return res;
	}
}
