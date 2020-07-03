<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" 
		 pageEncoding="UTF-8" import="com.dao.*" import="com.hibernate.*" import="java.util.List" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% EF_ChinaDao a=new EF_ChinaDao();
   List<EfOfChina> list=a.getEfOfChinas();
   EfOfChina m;
   EF_ForeignDao b=new EF_ForeignDao();
   List<EfOfForeign> listF=b.getEfOfForeigns();
   EfOfForeign n;
   OridataDao c=new   OridataDao();
   List<Oridata> listO=c.getOridatas_China();
   List<Oridata> listO2=c.getOridatas_Foreign();
   Oridata o;

 %>
<html>
<head>
    <meta charset="utf-8">
    <title>命中率</title>
    <!-- 引入 echarts.js -->
    <!-- 这里是加载刚下好的echarts.min.js，注意路径 -->
    <script src="echarts.min.js"></script>
<link href="css/散点图.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="../bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="../bootstrap/css/bootstrap-theme.css">
<script src="./jquery.js"></script>
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
		<li class="active"><a href="../index.jsp" >主页</a></li>
		<li><a href="../match_table.jsp">赛程</a></li>	
		<li><a href="../team_table.jsp">球队数据</a>
		<ul>
		<li><a href="../TeamRank.jsp">积分榜</a></li>
		<li><a href="../TeamRank_pts.jsp">得分</a></li>
		<li><a href="../TeamRank_Re.jsp">篮板</a></li>		
		</ul>
		</li>	
		<li><a href="../player_table.jsp">球员数据</a>
		<ul>
		<li><a href="../PtsRank.jsp">得分</a></li>
		<li><a href="../ReRank.jsp">篮板</a></li>
		<li><a href="../EfRank.jsp">效率</a></li>
		</ul>
		</li>
		<li><a href="../index.jsp">散点图数据展示</a>	
		<ul>
		<li><a href="ori_data.jsp">基础数据</a></li>
		<li><a href="accuracy.jsp">命中率</a></li>
		<li><a href="efficiency.jsp">效率值</a></li>
		</ul>
		</li>
				<li><a href="rank.jsp">排行榜</a></li>	
		<li><a href="excellent_player.jsp">优秀球员生涯</a></li>
		<li><a href="data_compare.jsp">数据比较</a>
		<li><a href="../comment.jsp">今日评论</a></li>	    
		<li><a href="../login.jsp">登录</a></li>
		<li>|</li>
		<li><a href="../regist.jsp">注册</a></li>
		</ul>
		</div></div>
	</nav>
	</div>
	</div>
		<br>
	<br>
	<br>
	<br>
	<br>
	<br>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" class="main"></div>
	
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
		
        var myChart = echarts.init(document.getElementById('main'));
		
		var dataWY =[]; //表格有300行
             for(var i = 0;i < 300; i++){
             dataWY[i] = new Array(8);       //每行有8列   
                  }                         
        <% for (int i=0;i<listO2.size();i++){ o=listO2.get(i); 
            float pts2rt=o.getId().get两分命中率();
           float pts3rt=o.getId().get三分命中率();
           String pts2=o.getId().get命中();
           String pts3=o.getId().get三分();
           float  fault_kick=o.getId().get罚球命中率();
           String name=o.getId().get姓名();  %>
         var i=<%=i%>         
        dataWY[i][0]=<%=pts2rt%>; dataWY[i][1]=<%=pts3rt%>; dataWY[i][3]="<%=pts2%>"; dataWY[i][4]="<%=pts3%>";
        dataWY[i][2]=<%=fault_kick%>; dataWY[i][5]="<%=name%>"; 
        <%}%>      



 var dataGN =[]; //表格有300行
        for(var i = 0;i < 300; i++){
           dataGN[i] = new Array(8); //每行有8列   
            }                         
        <% for (int i=0;i<listO.size();i++){ o=listO.get(i);
           float pts2rt=o.getId().get两分命中率();
           float pts3rt=o.getId().get三分命中率();
           String pts2=o.getId().get命中();
           String pts3=o.getId().get三分();
           float  fault_kick=o.getId().get罚球命中率();
           String name=o.getId().get姓名();  %>
         var i=<%=i%>         
        dataGN[i][0]=<%=pts2rt%>; dataGN[i][1]=<%=pts3rt%>; dataGN[i][3]="<%=pts2%>"; dataGN[i][4]="<%=pts3%>";
        dataGN[i][2]=<%=fault_kick%>; dataGN[i][5]="<%=name%>"; 
        <%}%>

var schema = [
    {name: 'per', index: 0, text: '两分命中率'},
    {name: 'AQIindex', index: 1, text: '三分命中率'},
    {name: 'PM25', index: 2, text: '罚球命中率'},
	{name: '2pts', index: 3, text: '两分出手-命中'},
	{name: '3pts', index: 4, text: '三分出手-命中'}
];


var itemStyle = {
    opacity: 0.8,
    shadowBlur: 10,
    shadowOffsetX: 0,
    shadowOffsetY: 0,
    shadowColor: 'rgba(0, 0, 0, 0.5)'
};
		
		var option = {
    backgroundColor: '#404a59',
    color: [
        '#dd4444', '#fec42c', '#80F1BE'
    ],
    legend: {
        top: 10,
        data: ['外援', '国内球员'],
        textStyle: {
            color: '#fff',
            fontSize: 16
        }
    },
    grid: {
        left: '10%',
        right: 150,
        top: '18%',
        bottom: '10%'
    },
    tooltip: {
        padding: 10,
        backgroundColor: '#222',
        borderColor: '#777',
        borderWidth: 1,
        formatter: function (obj) {
            var value = obj.value;
            return '<div style="border-bottom: 1px solid rgba(255,255,255,.3); font-size: 18px;padding-bottom: 7px;margin-bottom: 7px">'
                + obj.seriesName + ' ' 
                + value[5]
                + '</div>'
			    + schema[0].text + '：' + value[0] + '<br>'
                + schema[1].text + '：' + value[1] + '<br>'
                + schema[2].text + '：' + value[2] + '<br>'
		        + schema[3].text + '：' + value[3] + '<br>'	
                + schema[4].text + '：' + value[4] + '<br>';
        }
    },
    xAxis: {
        type: 'value',
        name: '两分命中率',
        nameGap: 0.16,
        nameTextStyle: {
            color: '#fff',
            fontSize: 14
        },
        max: 1,
        splitLine: {
            show: false
        },
        axisLine: {
            lineStyle: {
                color: '#eee'
            }
        }
    },
    yAxis: {
        type: 'value',
        name: '三分命中率',
        nameLocation: 'end',
        nameGap: 0.2,
        nameTextStyle: {
            color: '#fff',
            fontSize: 16
        },
		max: 1,
        axisLine: {
            lineStyle: {
                color: '#eee'
            }
        },
        splitLine: {
            show: false
        }
    },
    
    series: [
        {
            name: '外援',
            type: 'scatter',
            itemStyle: itemStyle,
            data: dataWY
        },
        {
            name: '国内球员',
            type: 'scatter',
            itemStyle: itemStyle,
            data: dataGN
        }
    ]
};
 
 
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
 
    </script>
    <div class="main1">
通过两分球命中率和三分球命中率构成了命中率散点图，清晰表现了国内球员和外援在命中率方面的“偏科”与“擅长”。每个点详细罗列命中率的其他基础数据，避免小样本下的误差。<br>
</div>
</body>
</html>
