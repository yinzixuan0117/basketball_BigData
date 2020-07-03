package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Efrank;
import com.hibernate.EfrankId;
import com.hibernate.HibernateSessionFactory;
import com.hibernate.PtsRank;
import com.hibernate.Rerank;
import com.hibernate.RerankId;

public class EfRankDao {
	 String message="error";

	    HibernateSessionFactory hsf = new HibernateSessionFactory();
	
	    public void addEfrank(Efrank u) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         session.save(u);  
	         tx.commit();
	         hsf.closeSession(session);
	     }  
	   
	     public Efrank getEfrank(EfrankId id) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         Efrank u = (Efrank) session.get(Efrank.class, id);  
	         tx.commit();
	         hsf.closeSession(session);
	         return u;  
	     }  
	     public List<Efrank> getEfranksByPage(int currentPage,int pageSize) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         Query query = session.createQuery("from Efrank");  
	         int startRow=(currentPage-1)*pageSize;
	         query.setFirstResult(startRow); 
	         query.setMaxResults(pageSize);
	         List<Efrank> list = query.list();  
	         tx.commit();
	         hsf.closeSession(session);
	         return list;  
	     }  

	     public int getTotal(){
	    	 Session session = hsf.getSession(); 
	    	 Query query = session.createQuery("from Efrank");  
	    	  return query.list().size();
	    	 }
	     
	     public List<Efrank> getEfranks() {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         Query query = session.createQuery("from Efrank");  
	         List<Efrank> list = query.list();  
	         tx.commit();
	         hsf.closeSession(session);
	         return list;  
	     }  
	  

	     public void deleteEfrank(EfrankId id) {  
	    	 Efrank u = getEfrank(id);  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         session.delete(u);  
	         tx.commit(); 
	         hsf.closeSession(session);
	     }  
}
