<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  <head>

    <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>查询页面</title>
		<link rel="stylesheet" href="./bootstrap/css/bootstrap.css">
		<link rel="stylesheet" href="./bootstrap/css/bootstrap-theme.css">
		<script src="/jquery.js"></script>
		<script src="../bootstrap/js/bootstrap.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	--><%@ taglib uri="/struts-tags" prefix="s"%> 
  </head>
  <script type="text/javascript" src="scripts/ajax1.js"></script>
  <script src="scripts/jquery-3.4.1.min.js"></script>
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
		<li><a href="player_table.jsp">球员数据</a>
		<ul>
		<li><a href="PtsRank.jsp">得分</a></li>
		<li><a href="ReRank.jsp">篮板</a></li>
		<li><a href="EfRank.jsp">效率</a></li>
		</ul>
		</li>
		<li><a href="admin.jsp">管理员页面</a></li>
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
     <s:form action="show_list" method="post">
     <s:textfield name="name" label="球员姓名"></s:textfield>
     <s:submit value="查询"></s:submit>
      </s:form>
      </div>
  </body>

</html>