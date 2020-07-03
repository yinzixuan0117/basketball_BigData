package com.action;



import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dao.CommentDao;
import com.dao.PlayerDao;
import com.hibernate.Comment;
import com.hibernate.CommentId;
import com.hibernate.PlayerId;
import com.opensymphony.xwork2.ActionSupport;

public class CommentAction extends ActionSupport{
	private String getUserId() {
		return userId;
	}
	private void setUserId(String userId) {
		this.userId = userId;
	}
	private String getContent() {
		return content;
	}
	private void setContent(String content) {
		this.content = content;
	}
	private String getCreatetime() {
		return createtime;
	}
	private void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	private String userId;
	private String content;
	private String createtime;
	private String message="fail";

	public String execute() throws Exception {
		CommentDao ud = new CommentDao();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession(); 
		userId = (String)session.getAttribute("userId");
		if(userId==null)
		{
			userId="сн©м";
		}
		String content = request.getParameter("content");
		Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String createtime = dateFormat.format(date.getTime());
		CommentId m=new CommentId(userId,content,createtime);
		Comment n=new Comment(m);
        ud.addComment(n);
        message="success";
		return message;
	}
}
