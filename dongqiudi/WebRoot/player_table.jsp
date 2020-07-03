<%@ page language="java" contentType="text/html; charset=UTF-8" 
		 pageEncoding="UTF-8" import="com.dao.*" import="com.hibernate.*" import="java.util.List"%>
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
   List<Player> list=a.getUsersByPage(currentPage,10); 
   Player m;
 %>
 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html>
<head>


<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>球员表格</title>
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
<div class="search-box">
         <form action="show_list" method="post">
			<input class="search-txt" type="text" placeholder="Type to search" name="name" />
			<a class="search-btn" href="#">
				<i class="fas fa-search"></i>
			</a>
		</form>
</div>
</div>
<!--div class="row">
<  <a href="BigData.jsp">
<button>本年度荣誉预测</button>
</a>
</div>-->
<div class="row">
<h2 align="center">球员</h2>
</div>
<div class="row">
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
          
          <%for (int i=0;i<list.size();i++){m=list.get(i); %>
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
        </tr>
          <%}%>
    </thead>
</table>
</div>

 <p class="text-primary">当前是第<%=currentPage%>页,共有${totalPage}页</p>
  <a href="player_table.jsp?currentPage=1" >首页</a>
  <% if(currentPage>1) {%>
  <a href="player_table.jsp?currentPage=<%=currentPage-1%>" >上一页</a>
  <a href="player_table.jsp?currentPage=<%=currentPage-1%>"><%=currentPage-1%></a>
  <%}%>
   <% if(totalPage>currentPage) {%>
  <a href="player_table.jsp?currentPage=<%=currentPage+1%>"><%=currentPage+1%></a>
  <a href="player_table.jsp?currentPage=<%=currentPage+1%>">下一页</a>
  <%}%>
  <a href="player_table.jsp?currentPage=${totalPage}" >尾页</a>
 </div>
</body>

</html>
