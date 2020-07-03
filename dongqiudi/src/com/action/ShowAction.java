package com.action;

import java.util.ArrayList;
import java.util.List;

import com.dao.PlayerDao;
import com.dao.ScheduleDao;
import com.dao.TeamDao;
import com.dao.UserDao;
import com.hibernate.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAction extends ActionSupport {

	private String name;
	private String teamname;
	private String teamnameS; 
	private int getCurrentPage() {
		return currentPage;
	}
	private void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	private int getTotalPage() {
		return totalPage;
	}
	private void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	private int getTotalSize() {
		return totalSize;
	}
	private void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}
	private int getPageSize() {
		return pageSize;
	}
	private void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	private int currentPage;
	 private int totalPage;
	 private int totalSize;
	 private int pageSize = 10;

	public String getName() {
		return name;
	}
	public void setName(String username) {
		this.name = username;
	}

	public String list(){
		/* if(currentPage==0){
			   currentPage = 1;
			  }
		
		 totalSize=ud.getTotal();
		 int mod = totalSize%pageSize;
		   if(mod==0){
		    totalPage = totalSize/pageSize;
		   }else 
		    totalPage = totalSize/pageSize+1;*/
		PlayerDao ud = new PlayerDao();
		List list = ud.queryInfo(this.getName());
		Player player = null;
		PlayerId id;
		player = (Player) list.get(0);
		id=player.getId();
		ActionContext actionContext = ActionContext.getContext();   
		actionContext.put("player", player);
		actionContext.put("id",id);
		return "list";
	}
	public String listT(){
		TeamDao ud = new TeamDao();
		Team team=new Team();
		team=ud.getTeam(this.getTeamname());
		ActionContext actionContext = ActionContext.getContext();   
		actionContext.put("team", team);
		return "listT";
	}
	public String listS(){
		ScheduleDao ud = new ScheduleDao();
		List list = ud.queryInfo(this.getTeamnameS());
		List <Schedule> schedule = new ArrayList<Schedule>();
		for(int i=0;i<list.size();i++)
		{
			schedule.add((Schedule)list.get(i));
		}
		ActionContext actionContext = ActionContext.getContext();
		actionContext.put("schedule", schedule);
		return "listS";
	}
	public String execute() throws Exception {
		
		return "success";
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getTeamnameS() {
		return teamnameS;
	}
	public void setTeamnameS(String teamnameS) {
		this.teamnameS = teamnameS;
	}

}
