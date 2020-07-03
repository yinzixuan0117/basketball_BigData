<%@ page language="java" contentType="text/html; charset=UTF-8" 
		 pageEncoding="UTF-8" import="com.dao.*" import="com.hibernate.*" import="java.util.List" %>
		 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% Sheet1Dao a=new Sheet1Dao();
   List<Sheet1> list=a.getSheet1s();
   Sheet1 m;
 %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html>
<head>


<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>积分榜表格</title>
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
<a href="teamRank.html">
<button class="btn-info">球队图表数据</button>
</a>
</div>
<div class="row">
<h2 align="center">球队积分榜</h2>
</div>
<div class="row">
<table  class="table table-striped" >
    <thead>
    	<tr>
        	<th scope="col">排名</th>
            <th scope="col">球队</th>
            <th scope="col">总场次</th>
			<th scope="col">胜场</th>
			<th scope="col">负场</th>
			<th scope="col">主场战绩</th>
			<th scope="col">客场战绩</th>
			<th scope="col">场均得分</th>
			<th scope="col">场均失分</th>
        </tr>
         <%for (int i=0;i<list.size();i++){m=list.get(i); %>
        <tr>
            <th scope="col"><% out.println(m.getId().get排名()); %></th>
            <th scope="col"><% out.println(m.getId().get球队()); %></th>
            <th scope="col"><% out.println(m.getId().get总场次()); %></th>
            <th scope="col"><% out.println(m.getId().get胜场()); %></th>
            <th scope="col"><% out.println(m.getId().get负场()); %></th>
			<th scope="col"><% out.println(m.getId().get主场战绩()); %></th>
			<th scope="col"><% out.println(m.getId().get客场战绩()); %></th>
			<th scope="col"><% out.println(m.getId().get场均得分()); %></th>
			<th scope="col"><% out.println(m.getId().get场均失分()); %></th>
			
        </tr>
        <%}%>
    </thead>
    
</table>
</div>
 
</div>
</body>
</html>

