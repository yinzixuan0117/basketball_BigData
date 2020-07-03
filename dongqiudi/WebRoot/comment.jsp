<%@ page language="java" contentType="text/html; charset=UTF-8" 
		 pageEncoding="UTF-8" import="com.dao.*" import="com.hibernate.*" import="java.util.List" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% CommentDao a=new CommentDao();
   List<Comment> list=a.getComments();
   Comment m;
 %>
 <%@ taglib uri="/struts-tags" prefix="s"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>今日评论</title>
		<link rel="stylesheet" href="./bootstrap/css/bootstrap.css">
		<link rel="stylesheet" href="./bootstrap/css/bootstrap-theme.css">
		<script src="/jquery.js"></script>
		<script src="./bootstrap/js/bootstrap.js"></script>
	

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
<br>
    <img src="./static/img/3.png" style="margin-left:28%"/>
     <p class="text-primary">虎扑5月12日讯 据知名篮球解说员苏群消息，体育总局已向国务院提交CBA重启申请，最快明日批复。

苏群在微博上写道：“终于快要有好消息啦，静等明天CBA重启计划获批：CBA在五一后向体育总局提交了6月15日重启计划，目前正在完善防疫措施中。本周总局向国务院提交了重启申请，如果顺利的话，最快明天会有批复。我个人判断，东莞和青岛两地的空场比赛计划，极有希望获得批准。 ​​​​”

本赛季CBA常规赛至今只完成前30轮比赛，由于疫情影响，原本定于2月份的赛事被迫停止，如今已经停赛多月。</p>
           <%for (int i=0;i<list.size();i++){m=list.get(i); %>
        <table class="table table-striped">
        <tr>
        <th scope="col">用户ID:<% out.println(m.getId().getUserId()); %></th>
         <br/>
            <th scope="col"><% out.println(m.getId().getContent()); %></th>
            <th scope="col"><% out.println(m.getId().getCreatetime()); %></th>
        </tr>
        </table>
        <br/>
        <%}%>
     <div class="row">
     <s:form action="comment" method="post">
     <s:textfield name="content" label="内容"></s:textfield>
     <s:submit value="评论"></s:submit>
     </s:form>
     </div>
    </div>
  </body>
  </html>
