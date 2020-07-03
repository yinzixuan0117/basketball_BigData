package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.HibernateSessionFactory;
import com.hibernate.Oridata;
import com.hibernate.OridataId;

public class OridataDao {
	 String message="error";

	    HibernateSessionFactory hsf = new HibernateSessionFactory();
	
	    public void addOridata(Oridata u) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         session.save(u);  
	         tx.commit();
	         hsf.closeSession(session);
	     }  
	   
	     public Oridata getOridata(OridataId id) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         Oridata u = (Oridata) session.get(Oridata.class, id);  
	         tx.commit();
	         hsf.closeSession(session);
	         return u;  
	     }  
	  

	     
	     public List<Oridata> getOridatas_China() {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         Query query = session.createQuery("from Oridata as u where u.id.country=1");
	         
	         List<Oridata> list = query.list();  
	         tx.commit();
	         hsf.closeSession(session);
	         return list;  
	     }
	     public List<Oridata> getOridatas_Foreign() {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         Query query = session.createQuery("from Oridata as u where u.id.country=2");  
	         List<Oridata> list = query.list();  
	         tx.commit();
	         hsf.closeSession(session);
	         return list;  
	     }  
	  

	     public void deleteOridata(OridataId id) {  
	    	 Oridata u = getOridata(id);  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         session.delete(u);  
	         tx.commit(); 
	         hsf.closeSession(session);
	     }  
}

