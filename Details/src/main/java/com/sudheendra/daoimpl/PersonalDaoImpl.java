package com.sudheendra.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sudheendra.entity.Personal;

public class PersonalDaoImpl {
	public String personalInsert(SessionFactory sf, Personal pers){
		Session hsession = sf.openSession();
		Transaction tx = hsession.beginTransaction();
		String res = (String)hsession.save(pers);
		tx.commit();
		hsession.close();
		return res;
	}
}
