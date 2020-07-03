package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.HibernateSessionFactory;
import com.hibernate.PtsRank;
import com.hibernate.PtsRankId;
import com.hibernate.Rerank;
import com.hibernate.RerankId;

public class ReRankDao {
	 String message="error";

	    HibernateSessionFactory hsf = new HibernateSessionFactory();
	
	    public void addRerank(Rerank u) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         session.save(u);  
	         tx.commit();
	         hsf.closeSession(session);
	     }  
	   
	     public Rerank getRerank(RerankId id) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         Rerank u = (Rerank) session.get(Rerank.class, id);  
	         tx.commit();
	         hsf.closeSession(session);
	         return u;  
	     }  
	     public List<Rerank> getReranksByPage(int currentPage,int pageSize) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         Query query = session.createQuery("from Rerank");  
	         int startRow=(currentPage-1)*pageSize;
	         query.setFirstResult(startRow); 
	         query.setMaxResults(pageSize);
	         List<Rerank> list = query.list();  
	         tx.commit();
	         hsf.closeSession(session);
	         return list;  
	     }  
	     public int getTotal(){
	    	 Session session = hsf.getSession(); 
	    	 Query query = session.createQuery("from Rerank");  
	    	  return query.list().size();
	    	 }

	     public List<PtsRank> getReranks() {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         Query query = session.createQuery("from Rerank");  
	         List<PtsRank> list = query.list();  
	         tx.commit();
	         hsf.closeSession(session);
	         return list;  
	     }  
	  

	     public void deleteRerank(RerankId id) {  
	    	 Rerank u = getRerank(id);  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         session.delete(u);  
	         tx.commit(); 
	         hsf.closeSession(session);
	     }  
}
