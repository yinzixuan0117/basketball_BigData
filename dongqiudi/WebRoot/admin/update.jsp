<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" import="com.dao.*" import="com.hibernate.*" import="java.util.List"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<link href="./static/css/update.css" rel="stylesheet" type="text/css">
  <head>
    
    
    
    
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>修改页面</title>
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

 <%
  Player u = (Player)request.getAttribute("player");
  out.print(u.getName());
  %>

  <form action="delete" method="post" name="form">
		<div class="form-group">
			<input type="text" name="name" class="form-control">
			<label>姓名</label>
	    </div>
		<div class="form-group">
			<input type="text" name="team_name" class="form-control">
			<label>所在球队</label>
		</div>
		<div class="form-group">
			<input type="text" name="number" class="form-control">
			<label>号码</label>
		<div class="form-group">
			<input type="text" name="minutes" class="form-control">
			<label>场均分钟</label>
		</div>
		<div class="form-group">
			<input type="text" name="pts" class="form-control">
			<label>场均得分</label>
		</div>
				<div class="form-group">
			<input type="text" name="assist" class="form-control">
			<label>场均助攻</label>
	    </div>
		<div class="form-group">
			<input type="text" name="rebound" class="form-control">
			<label>场均篮板</label>
		</div>
		<div class="form-group">
			<input type="text" name="steal" class="form-control">
			<label>场均抢断</label>
		</div>
				<div class="form-group">
			<input type="text" name="block_shot" class="form-control">
			<label>场均盖帽</label>
	    </div>
		<div class="form-group">
			<input type="text" name="turnover" class="form-control">
			<label>场均失误</label>
		</div>
		<div class="form-group">
			<input type="text" name="foul" class="form-control">
			<label>场均犯规</label>
		</div>
				<div class="form-group">
			<input type="text" name="fg" class="form-control">
			<label>场均投篮命中率</label>
	    </div>
				<div class="form-group">
			<input type="text" name="season" class="form-control">
			<label>赛季</label>
		</div>
		<div class="submit">
        <input type="submit" name="" value="提交修改" class="btn-primary">
        </div>
	 </form>
	 </div>
  </body>
</html>
 
  