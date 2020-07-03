<%@ page language="java" contentType="text/html; charset=UTF-8" 
		 pageEncoding="UTF-8" import="com.dao.*" import="com.hibernate.*" import="java.util.List" %>
		 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% PtsRankDao a=new PtsRankDao();
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
   List<PtsRank> list=a.getPtsRanksByPage(currentPage, 10);
   PtsRank m;
 %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html>
<head>


<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>得分排行表格</title>
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
<!--<div class="row">
<a href="得分排名表.html">
<button>得分排名表</button>
</a>
</div>
  -->
<div class="row">
<h2 align="center">球员得分排行</h2>
</div>
<div class="row">
<table class="table table-striped">
    <thead>
    	<tr>
        	<th scope="col">排名</th>
            <th scope="col">球员</th>
            <th scope="col">号码</th>
			<th scope="col">球队</th>
			<th scope="col">场次</th>
			<th scope="col">首发</th>
			<th scope="col">得分</th>
			<th scope="col">位置</th>
			<th scope="col">两分出手-命中</th>
			<th scope="col">两分命中率</th>
			<th scope="col">三分出手-命中</th>
			<th scope="col">三分命中率</th>
			<th scope="col">罚球出手-命中</th>
			<th scope="col">罚球命中率</th>
			<th scope="col">出场时间</th>
        </tr>
         <%for (int i=0;i<list.size();i++){m=list.get(i); %>
        <tr>
            <th scope="col"><% out.println(m.getId().get排名()); %></th>
            <th scope="col"><% out.println(m.getId().get球员()); %></th>
            <th scope="col"><% out.println(m.getId().get号码()); %></th>
            <th scope="col"><% out.println(m.getId().get球队()); %></th>
            <th scope="col"><% out.println(m.getId().get场次()); %></th>
			<th scope="col"><% out.println(m.getId().get首发()); %></th>
			<th scope="col"><% out.println(m.getId().get得分()); %></th>
			<th scope="col"><% out.println(m.getId().get位置()); %></th>
			<th scope="col"><% out.println(m.getId().get两分出手命中()); %></th>
			<th scope="col"><% out.println(m.getId().get两分命中率()); %></th>
			<th scope="col"><% out.println(m.getId().get三分出手命中()); %></th>
			<th scope="col"><% out.println(m.getId().get三分命中率()); %></th>
			<th scope="col"><% out.println(m.getId().get罚球出手命中()); %></th>
			<th scope="col"><% out.println(m.getId().get罚球命中率()); %></th>
			<th scope="col"><% out.println(m.getId().get出场时间()); %></th>
			
        </tr>
        <%}%>
    </thead>
    </table>
</div>
    <div>
    <p class="text-primary">当前是第<%=currentPage%>页,共有${totalPage}页</p>
  <a href="PtsRank.jsp?currentPage=1" >首页</a>
  <% if(currentPage>1) {%>
  <a href="PtsRank.jsp?currentPage=<%=currentPage-1%>" >上一页</a>
  <a href="PtsRank.jsp?currentPage=<%=currentPage-1%>"><%=currentPage-1%></a>
  <%}%>
   <% if(totalPage>currentPage) {%>
  <a href="PtsRank.jsp?currentPage=<%=currentPage+1%>"><%=currentPage+1%></a>
  <a href="PtsRank.jsp?currentPage=<%=currentPage+1%>">下一页</a>
  <%}%>
  <a href="PtsRank.jsp?currentPage=${totalPage}" >尾页</a>
</div>

 
</div>
</body>
</html>
