<%@ page language="java" contentType="text/html; charset=UTF-8" 
		 pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!doctype html>
<html>
<head>

	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<meta charset="utf-8">
<title>Login</title>
<link href="./static/css/login.css" rel="stylesheet" type="text/css">
</head>

<body>
	<video id="v1" autoplay loop muted>
  	<source src="./static/img/sky.mp4" type="video/mp4"  />
	</video>
	<div class="box">
	<h2>Login</h2>
		<form action="login.action" method="post">
		<div class="inputbox">
			<input type="text" name="username"><span style="color:#FF0000;"><s:fielderror fieldName="username"/></span>  
			                                   <span style="color:#FF0000;"><s:fielderror fieldName="password"/></span>
			<label>Username</label>
			</div>
		<div class="inputbox">
			<input type="password" name="password">
			<label>password</label>
			</div>
        <input type="submit" name="" value="Submit">
        <%
         String errorInfo = (String)request.getAttribute("error");         // 获取错误属性
         if(errorInfo!= null) {
        %>
       <script type="text/javascript" language="javascript">
         alert("<%=errorInfo%>");                                         
         window.location='login.jsp' ;                            // 跳转到登录界面
       </script>
<%
}
%>
        <a href="regist.jsp"><input type="button" name="" value="Register"></a>
		</form>
	    </div>
</body>
</html>
