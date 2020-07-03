<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" import="com.dao.*" import="com.hibernate.*" import="java.util.List"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% PlayerDao a=new PlayerDao();
   String s=request.getParameter("currentPage"); 
   int currentPage;
   if(s==null)
   {
   currentPage=1;
   }
   else
   {
   currentPage=Integer.valueOf(s);
   }
   int totalPage=a.getTotal()/10+1;
   session.setAttribute("totalPage",totalPage);
   System.out.print(currentPage);
   List<Player> list=a.getUsersByPage(currentPage, 10);
   Player m;
 %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 
   
    
	<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
 <title>管理员页面</title>
		<link rel="stylesheet" href="./bootstrap/css/bootstrap.css">
		<link rel="stylesheet" href="./bootstrap/css/bootstrap-theme.css">
		<script src="/jquery.js"></script>
		<script src="../bootstrap/js/bootstrap.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
<div class="container">
<div class="row">
<div class="col-md-12">
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="navbar-header">
	<a href="#" class="navbar-brand">DongQiuDi</a>
	</div>
	<div id="navbar" class="collapse navbar-collapse">
	<ul class="nav navbar-nav">
		<li><a href="index.jsp" >主页</a></li>
		<li ><a href="match_table.jsp">赛程</a></li>	
	
		<li><a href="team_table.jsp">球队数据</a>
		<ul>
		<li><a href="TeamRank.jsp">积分榜</a></li>
		<li><a href="TeamRank_pts.jsp">得分</a></li>
		<li><a href="TeamRank_Re.jsp">篮板</a></li>
		
		</ul>
		</li>	
		<li ><a href="player_table.jsp">球员数据</a>
		<ul>
		<li><a href="PtsRank.jsp">得分</a></li>
		<li><a href="ReRank.jsp">篮板</a></li>
		<li><a href="EfRank.jsp">效率</a></li>
		</ul>
		</li>
		<li class="active"><a href="admin.jsp">管理员页面</a></li>
		<li><a href="comment.jsp">今日评论</a></li>
		
	    
		<li><a href="login.jsp">登录</a></li>
		<li>|</li>
		<li><a href="regist.jsp">注册</a></li>
		</ul>
	    </div>
</nav>
</div>	
</div>
	<br>
	<br>
		<br>
	<br>
		<br>
		<div class="row">
    <h2 align="center">球员 </h2>
    </div>
    <div class="row">
     <form action="insert_IP" method="post">
<table class="table table-striped">
    <thead>
    	<tr>
                	<th scope="col">姓名</th>
            <th scope="col">所在球队</th>
            <th scope="col">号码</th>
			<th scope="col">场均分钟</th>
			<th scope="col">场均得分</th>
			<th scope="col">场均助攻</th>
			<th scope="col">场均篮板</th>
			<th scope="col">场均抢断</th>
			<th scope="col">场均盖帽</th>
			<th scope="col">场均失误</th>
			<th scope="col">场均犯规</th>
			<th scope="col">场均投篮命中率</th>
			<th scope="col">赛季</th>
        </tr>

        
          <%for (int i=0;i<list.size();i++){m=list.get(i);PlayerId b=m.getId();%>
       <tr>
     <th scope="col"><% out.println(m.getName()); %></th>
            <th scope="col"><% out.println(m.getId().getTeamName()); %></th>
            <th scope="col"><% out.println(m.getId().getNumber()); %></th>
            <th scope="col"><% out.println(m.getMinutes()); %></th>
			<th scope="col"><% out.println(m.getPts()); %></th>
			<th scope="col"><% out.println(m.getAssist()); %></th>
			<th scope="col"><% out.println(m.getRebound()); %></th>
            <th scope="col"><% out.println(m.getSteal()); %></th>
            <th scope="col"><% out.println(m.getBlockShot()); %></th>
            <th scope="col"><% out.println(m.getTurnover()); %></th>
            <th scope="col"><% out.println(m.getFoul()); %></th>
            <th scope="col"><% out.println(m.getFg()); %></th>
			 <th scope="col"><% out.println(m.getId().getSeason()); %></th>
			<th scope="col"><a href="update?teamname=<%out.print(m.getId().getTeamName()); %>
			&season=<%out.print(m.getId().getSeason()); %>
			&number=<%out.print(m.getId().getNumber()); %>
			">修改</a></th>
        </tr>
          <%}%>
    </thead>

   
<tr>
<td><input type="text" name="name"></td>
			<!--<label>姓名</label>-->
			<td><input type="text" name="team_name"></td>
			<!--<label>所在球队</label>-->

			<td><input type="text" name="number"></td>
			<!--<label>号码</label>-->
			<td><input type="text" name="position"></td>
			<!--<label>场上位置</label>-->
			<td><input type="text" name="minutes"></td>
			<!--<label>场均分钟</label>-->
			<td><input type="text" name="pts"></td>
			<!--<label>场均得分</label>-->
			<td><input type="text" name="assist"></td>
			<!--<label>场均助攻</label>-->
			<td><input type="text" name="rebound"></td>
			<!--<label>场均篮板</label>-->
			<td><input type="text" name="steal"></td>
			<!--<label>场均抢断</label>-->
			<td><input type="text" name="block_shot"></td>
			<!--<label>场均盖帽</label>-->
			<td><input type="text" name="turnover"></td>
			<!--<label>场均失误</label>-->
			<td><input type="text" name="foul"></td>
			<!--<label>场均犯规</label>-->
			<td><input type="text" name="fg"></td>
			<!--<label>场均投篮命中率</label>-->
			<td><input type="text" name="season"></td>
			<!--<label>赛季</label>-->
		</tr>
		</table>
        <input type="submit" name="" value="添加" class="btn-primary">
	 </form>

     <form action="delete_DP" method="post" >
     <table class="table table-striped">
		<!--  <div class="inputbox">-->
			<td><input type="text" name="season"></td>
			<td><label>赛季</label></td>
	    <!--  </div>-->
			<td><input type="text" name="number"></td>
			<td><label>号码</label></td>
			<td><input type="text" name="teamName"></td>
			<td><label>球队名称</label></td>
        <td><input type="submit" name="" value="删除" class="btn-primary"></td>
   </table>
	 </form>
	 </div>
	 </div> 
   </body>
</html>
