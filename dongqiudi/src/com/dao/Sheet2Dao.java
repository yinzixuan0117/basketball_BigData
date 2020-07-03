package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.HibernateSessionFactory;
import com.hibernate.Sheet1;
import com.hibernate.Sheet1Id;
import com.hibernate.Sheet2;
import com.hibernate.Sheet2Id;

public class Sheet2Dao {
	String message="error";

    HibernateSessionFactory hsf = new HibernateSessionFactory();

    public void addSheet2(Sheet2 u) {  
         Session session = hsf.getSession();  
         Transaction tx = session.beginTransaction();  
         session.save(u);  
         tx.commit();
         hsf.closeSession(session);
     }  
   
     public Sheet2 getSheet2(Sheet2Id id) {  
         Session session = hsf.getSession();  
         Transaction tx = session.beginTransaction();  
         Sheet2 u = (Sheet2) session.get(Sheet2.class, id);  
         tx.commit();
         hsf.closeSession(session);
         return u;  
     }  



     public List<Sheet2> getSheet2s() {  
         Session session = hsf.getSession();  
         Transaction tx = session.beginTransaction();  
         Query query = session.createQuery("from Sheet2");  
         List<Sheet2> list = query.list();  
         tx.commit();
         hsf.closeSession(session);
         return list;  
     }  
  

     public void deleteSheet2(Sheet2Id id) {  
    	 Sheet2 u = getSheet2(id);  
         Session session = hsf.getSession();  
         Transaction tx = session.beginTransaction();  
         session.delete(u);  
         tx.commit(); 
         hsf.closeSession(session);
     }  

}

