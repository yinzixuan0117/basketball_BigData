package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.EfOfChina;
import com.hibernate.EfOfChinaId;
import com.hibernate.HibernateSessionFactory;

public class EF_ChinaDao {
	 String message="error";

	    HibernateSessionFactory hsf = new HibernateSessionFactory();
	
	    public void addEfOfChina(EfOfChina u) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         session.save(u);  
	         tx.commit();
	         hsf.closeSession(session);
	     }  
	   
	     public EfOfChina getEfOfChina(EfOfChinaId id) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         EfOfChina u = (EfOfChina) session.get(EfOfChina.class, id);  
	         tx.commit();
	         hsf.closeSession(session);
	         return u;  
	     }  
	  

	     
	     public List<EfOfChina> getEfOfChinas() {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         Query query = session.createQuery("from EfOfChina");  
	         List<EfOfChina> list = query.list();  
	         tx.commit();
	         hsf.closeSession(session);
	         return list;  
	     }  
	  

	     public void deleteEfOfChina(EfOfChinaId id) {  
	    	 EfOfChina u = getEfOfChina(id);  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         session.delete(u);  
	         tx.commit(); 
	         hsf.closeSession(session);
	     }  
}
