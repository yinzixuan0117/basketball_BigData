package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Comment;
import com.hibernate.CommentId;
import com.hibernate.HibernateSessionFactory;
import com.hibernate.Player;
import com.hibernate.PtsRank;
import com.hibernate.PtsRankId;

public class PtsRankDao {
	 String message="error";

	    HibernateSessionFactory hsf = new HibernateSessionFactory();
	
	    public void addPtsRank(PtsRank u) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         session.save(u);  
	         tx.commit();
	         hsf.closeSession(session);
	     }  
	   
	     public PtsRank getPtsRank(PtsRankId id) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         PtsRank u = (PtsRank) session.get(PtsRank.class, id);  
	         tx.commit();
	         hsf.closeSession(session);
	         return u;  
	     }  
	     public List<PtsRank> getPtsRanksByPage(int currentPage,int pageSize) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         Query query = session.createQuery("from PtsRank");  
	         int startRow=(currentPage-1)*pageSize;
	         query.setFirstResult(startRow); 
	         query.setMaxResults(pageSize);
	         List<PtsRank> list = query.list();  
	         tx.commit();
	         hsf.closeSession(session);
	         return list;  
	     }  
	     public int getTotal(){
	    	 Session session = hsf.getSession(); 
	    	 Query query = session.createQuery("from PtsRank");  
	    	  return query.list().size();
	    	 }

	     public List<PtsRank> getPtsRanks() {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         Query query = session.createQuery("from PtsRank");  
	         List<PtsRank> list = query.list();  
	         tx.commit();
	         hsf.closeSession(session);
	         return list;  
	     }  
	  

	     public void deletePtsRank(PtsRankId id) {  
	    	 PtsRank u = getPtsRank(id);  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         session.delete(u);  
	         tx.commit(); 
	         hsf.closeSession(session);
	     }  

}

