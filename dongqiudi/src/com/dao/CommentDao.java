package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Comment;
import com.hibernate.CommentId;
import com.hibernate.HibernateSessionFactory;
import com.hibernate.Player;
import com.hibernate.PlayerId;

public class CommentDao {
	 String message="error";

	    HibernateSessionFactory hsf = new HibernateSessionFactory();
	
	    public void addComment(Comment u) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         session.save(u);  
	         tx.commit();
	         hsf.closeSession(session);
	     }  
	   
	     public Comment getComment(CommentId id) {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         Comment u = (Comment) session.get(Comment.class, id);  
	         tx.commit();
	         hsf.closeSession(session);
	         return u;  
	     }  



	     public List<Comment> getComments() {  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         Query query = session.createQuery("from Comment");  
	         List<Comment> list = query.list();  
	         tx.commit();
	         hsf.closeSession(session);
	         return list;  
	     }  
	  

	     public void deleteComment(CommentId id) {  
	    	 Comment u = getComment(id);  
	         Session session = hsf.getSession();  
	         Transaction tx = session.beginTransaction();  
	         session.delete(u);  
	         tx.commit(); 
	         hsf.closeSession(session);
	     }  

}
