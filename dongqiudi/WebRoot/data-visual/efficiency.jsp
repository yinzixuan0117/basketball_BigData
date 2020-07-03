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
    <title>效率值</title>
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
		
	 var dataGN =[]; //表格有300行
        for(var i = 0;i < 350; i++){
           dataGN[i] = new Array(8); //每行有8列   
            }                         
        <% for (int i=0;i<list.size()-10;i++){ m=list.get(i);
           int de_ef=m.getId().get防守效率();
           int at_ef=m.getId().get进攻效率();
           String ef_nu=m.getId().get效率值();
           String afault_scale=m.getId().get助攻失误比();
           String win_con=m.getId().get获胜贡献值();
           String use_ratio=m.getId().get使用率();
           String plus_minus=m.getId().get正负值();
           String name=m.getId().get球员();%>   
        var i=<%=i%>         
        dataGN[i][0]=<%=de_ef%>; dataGN[i][1]=<%=at_ef%>; dataGN[i][2]=<%=ef_nu%>; dataGN[i][3]=<%=afault_scale%>;
        dataGN[i][4]=<%=win_con%>; dataGN[i][5]="<%=use_ratio%>"; dataGN[i][6]=<%=plus_minus%>; dataGN[i][7]="<%=name%>";
        <%}%>
var dataWY =[]; //表格有300行
        for(var i = 0;i < 350; i++){
           dataWY[i] = new Array(8); //每行有8列   
            }                         
        <% for (int i=0;i<listF.size();i++){ n=listF.get(i);
           int at_ef=n.getId().get进攻效率();
           int de_ef=n.getId().get防守效率();
           String ef_nu=n.getId().get效率值();
           String afault_scale=n.getId().get助攻失误比();
           String win_con=n.getId().get获胜贡献值();
           String use_ratio=n.getId().get使用率();
           String plus_minus=n.getId().get正负值();
           String name=n.getId().get球员();%>   
        var i=<%=i%>         
        dataWY[i][0]=<%=de_ef%>; dataWY[i][1]=<%=at_ef%>; dataWY[i][2]=<%=ef_nu%>; dataWY[i][3]=<%=afault_scale%>;
        dataWY[i][4]=<%=win_con%>; dataWY[i][5]="<%=use_ratio%>"; dataWY[i][6]=<%=plus_minus%>; dataWY[i][7]="<%=name%>";
        <%}%>

var schema = [
    {name: 'per', index: 0, text: '防守效率'},
    {name: 'AQIindex', index: 1, text: '进攻效率'},
    {name: 'PM25', index: 2, text: '效率值'},
    {name: 'PM10', index: 3, text: '助攻失误比'},
    {name: 'CO', index: 4, text: '获胜贡献值'},
    {name: 'NO2', index: 5, text: '使用率'},
    {name: 'SO2', index: 6, text: '正负值'}
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
                + value[7]
                + '</div>'
			    + schema[0].text + '：' + value[0] + '<br>'
                + schema[1].text + '：' + value[1] + '<br>'
                + schema[2].text + '：' + value[2] + '<br>'
                + schema[3].text + '：' + value[3] + '<br>'
                + schema[4].text + '：' + value[4] + '<br>'
                + schema[5].text + '：' + value[5] + '<br>'
                + schema[6].text + '：' + value[6] + '<br>';
        }
    },
    xAxis: {
        type: 'value',
        name: '防守效率',
        nameGap: 16,
        nameTextStyle: {
            color: '#fff',
            fontSize: 14
        },
        max: 150,
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
        name: '进攻效率',
        nameLocation: 'end',
        nameGap: 20,
        nameTextStyle: {
            color: '#fff',
            fontSize: 16
        },
		max: 150,
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
    <div class="main1">比较国内球员和外援效率值的散点图，我们可以看到国内球员表现更好，但是根据相应的高阶数据的，包括“使用率”等等，国内球员的球权是明显少于外援。这张表也表明了大部分本土球员投一些高效的easy ball，而外援则需要攻坚，于是效率低于国内球员也非常好理解了。</div>
</body>
</html>