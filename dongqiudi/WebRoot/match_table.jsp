<%@ page language="java" contentType="text/html; charset=UTF-8" 
		 pageEncoding="UTF-8" import="com.dao.*" import="com.hibernate.*" import="java.util.List"  %>
		 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% ScheduleDao a=new ScheduleDao();
   List<Schedule> list=a.getSchedules();
   Schedule m;
 %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html>

<head>


<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>赛程表格</title>
		<link rel="stylesheet" href="./bootstrap/css/bootstrap.css">
		<link rel="stylesheet" href="./bootstrap/css/bootstrap-theme.css">
		<script src="/jquery.js"></script>
		<script src="../bootstrap/js/bootstrap.js"></script>
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
		<li class="active"><a href="index.jsp" >主页</a></li>
		<li><a href="match_table.jsp">赛程</a></li>	
		<li><a href="team_table.jsp">球队数据</a>
		<ul>
		<li><a href="TeamRank.jsp">积分榜</a></li>
		<li><a href="TeamRank_pts.jsp">得分</a></li>
		<li><a href="TeamRank_Re.jsp">篮板</a></li>		
		</ul>
		</li>	
		<li><a href="player_table.jsp">球员数据</a>
		<ul>
		<li><a href="PtsRank.jsp">得分</a></li>
		<li><a href="ReRank.jsp">篮板</a></li>
		<li><a href="EfRank.jsp">效率</a></li>
		</ul>
		</li>
		<li><a href="index.jsp">散点图数据展示</a>	
		<ul>
		<li><a href="./data-visual/ori_data.jsp">基础数据</a></li>
		<li><a href="./data-visual/accuracy.jsp">命中率</a></li>
		<li><a href="./data-visual/efficiency.jsp">效率值</a></li>
		</ul>
		</li>
				<li><a href="./data-visual/rank.jsp">排行榜</a></li>	
		<li><a href="./data-visual/excellent_player.jsp">优秀球员生涯</a></li>
		<li><a href="./data-visual/data_compare.jsp">数据比较</a>
		<li><a href="comment.jsp">今日评论</a></li>	    
		<li><a href="login.jsp">登录</a></li>
		<li>|</li>
		<li><a href="regist.jsp">注册</a></li>
		</ul>
		</div>
		</div>
	</nav>
	</div>
	</div>
<br>
<br>
<br>
<br>
<br>
<br>
<div class="row">
<div class="search-box" style="margin-left:50px">
         <form action="show_listS" method="post">
			<input class="search-txt" type="text" placeholder="Type to search" name="teamnameS" />
			<a class="search-btn" href="#">
				<i class="fas fa-search"></i>
			</a>
		</form>
</div>

<form action="select" method="post" class="form" style="margin-left:50px">
	<select name="time" id="department">
		<option value="2019-11-18">2019-11-18</option>
		<option value="2019-11-19">2019-11-19</option>
		<option value="2019-11-20">2019-11-20</option>
		<option value="2019-11-21">2019-11-21</option>
		<option value="2019-11-22">2019-11-22</option>
		<option value="2019-11-23">2019-11-23</option>
		<option value="2019-11-24">2019-11-24</option>
	</select>	
	<input type="submit" value="提交"/>
</form>
</div>	



<div class="row">
<h2 align="center" color="red">赛程</h2>
</div>
<div class="row">
<table class="table table-striped" style="margin-left:50px">
    <thead>
    	<tr>
        	<th scope="col">球队</th>
            <th scope="col">对手</th>
            <th scope="col">结果</th>
			<th scope="col">地点</th>
			<th scope="col">日期</th>
        </tr>
         <%for (int i=0;i<list.size();i++){m=list.get(i); %>
        <tr>
            <th scope="col"><% out.println(m.getId().getTeamName()); %></th>
            <th scope="col"><% out.println(m.getOpponent()); %></th>
            <th scope="col"><% out.println(m.getResult()); %></th>
            <th scope="col"><% out.println(m.getSite()); %></th>
			<th scope="col"><% out.println(m.getId().getDateTime()); %></th>
        </tr>
        <%}%>
    </thead>
    
</table>
</div>
 </div>

</body>
</html>
