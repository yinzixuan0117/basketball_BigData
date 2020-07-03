package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.EfOfForeign;
import com.hibernate.EfOfForeignId;
import com.hibernate.HibernateSessionFactory;

public class EF_ForeignDao {
	 String message="error";

	    HibernateSessionFactory hsf = new HibernateSessionFactory();
	
	    public void addEfOfForeign(EfOfForeign u) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         session.save(u);  
	         tx.commit();
	         hsf.closeSession(session);
	     }  
	   
	     public EfOfForeign getEfOfForeign(EfOfForeignId id) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         EfOfForeign u = (EfOfForeign) session.get(EfOfForeign.class, id);  
	         tx.commit();
	         hsf.closeSession(session);
	         return u;  
	     }  
	    

	     
	     public List<EfOfForeign> getEfOfForeigns() {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         Query query = session.createQuery("from EfOfForeign");  
	         List<EfOfForeign> list = query.list();  
	         tx.commit();
	         hsf.closeSession(session);
	         return list;  
	     }  
	  

	     public void deleteEfOfForeign(EfOfForeignId id) {  
	    	 EfOfForeign u = getEfOfForeign(id);  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         session.delete(u);  
	         tx.commit(); 
	         hsf.closeSession(session);
	     }  
}

