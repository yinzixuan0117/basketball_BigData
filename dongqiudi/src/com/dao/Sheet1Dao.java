package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Comment;
import com.hibernate.CommentId;
import com.hibernate.HibernateSessionFactory;
import com.hibernate.Sheet1;
import com.hibernate.Sheet1Id;

public class Sheet1Dao {
	 String message="error";

	    HibernateSessionFactory hsf = new HibernateSessionFactory();
	
	    public void addSheet1(Sheet1 u) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         session.save(u);  
	         tx.commit();
	         hsf.closeSession(session);
	     }  
	   
	     public Sheet1 getSheet1(Sheet1Id id) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         Sheet1 u = (Sheet1) session.get(Sheet1.class, id);  
	         tx.commit();
	         hsf.closeSession(session);
	         return u;  
	     }  



	     public List<Sheet1> getSheet1s() {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         Query query = session.createQuery("from Sheet1");  
	         List<Sheet1> list = query.list();  
	         tx.commit();
	         hsf.closeSession(session);
	         return list;  
	     }  
	  

	     public void deleteSheet1(Sheet1Id id) {  
	    	 Sheet1 u = getSheet1(id);  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         session.delete(u);  
	         tx.commit(); 
	         hsf.closeSession(session);
	     }  

}


