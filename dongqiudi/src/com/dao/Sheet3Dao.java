package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.HibernateSessionFactory;
import com.hibernate.Sheet1;
import com.hibernate.Sheet1Id;
import com.hibernate.Sheet3;
import com.hibernate.Sheet3Id;

public class Sheet3Dao {
	String message="error";

    HibernateSessionFactory hsf = new HibernateSessionFactory();

    public void addSheet3(Sheet3 u) {  
         Session session = hsf.getSession();  
         Transaction tx = session.beginTransaction();  
         session.save(u);  
         tx.commit();
         hsf.closeSession(session);
     }  
   
     public Sheet3 getSheet3(Sheet3Id id) {  
         Session session = hsf.getSession();  
         Transaction tx = session.beginTransaction();  
         Sheet3 u = (Sheet3) session.get(Sheet3.class, id);  
         tx.commit();
         hsf.closeSession(session);
         return u;  
     }  



     public List<Sheet3> getSheet3s() {  
         Session session = hsf.getSession();  
         Transaction tx = session.beginTransaction();  
         Query query = session.createQuery("from Sheet3");  
         List<Sheet3> list = query.list();  
         tx.commit();
         hsf.closeSession(session);
         return list;  
     }  
  

     public void deleteSheet3(Sheet3Id id) {  
    	 Sheet3 u = getSheet3(id);  
         Session session = hsf.getSession();  
         Transaction tx = session.beginTransaction();  
         session.delete(u);  
         tx.commit(); 
         hsf.closeSession(session);
     }  

}