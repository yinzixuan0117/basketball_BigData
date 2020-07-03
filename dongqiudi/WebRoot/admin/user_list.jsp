<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

    <head>
 
    
 
       <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>用户列表</title>
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
		<li class="active"><a href="player_table.jsp">球员数据</a>
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
<div class="row">
       <h2 align="center">用户列表</h1>
</div>
<div class="row">
       <table class="table table-striped" >
            <tr>
              <td width="100">用户ID</td>
              <td width="100">用户名</td>
              <td width="100">密码</td>
              <td width="100">邮箱</td>
              <td width="100">手机号</td>
            </tr>
            <s:iterator  value="users">
            <tr>
              <td width="100"><s:property value="id"/></td>
              <td width="100"><s:property value="name"/></td>
              <td width="100"><s:property value="password"/></td>
              <td width="100"><s:property value="email"/></td>
              <td width="100"><s:property value="phonenum"/></td>
              </tr>
            </s:iterator>
        </table>
       </div>
       </div>
     </body>
</html>

 