<html>
<%@ page language="java" contentType="text/html; charset=UTF-8" 
		 pageEncoding="UTF-8" import="com.dao.*" import="com.hibernate.*" import="java.util.List" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<head>
    <meta charset="utf-8">
    <title>姚明易建联数据</title>
    <!-- 引入 echarts.js -->
    <!-- 这里是加载刚下好的echarts.min.js，注意路径 -->
    <script src="echarts.min.js"></script>
<link href="css/姚明易建联数据.css" rel="stylesheet" type="text/css">
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
		</div>
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
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" class="main"></div>
	
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
		
        var myChart = echarts.init(document.getElementById('main'));
 
        var option = {
    tooltip: {
        trigger: 'axis',
        axisPointer: {
            type: 'cross',
            crossStyle: {
                color: '#999'
            }
        }
    },
    toolbox: {
        feature: {
            dataView: {show: true, readOnly: false},
            magicType: {show: true, type: ['line', 'bar']},
            restore: {show: true},
            saveAsImage: {show: true}
        }
    },
    legend: {
        data: ['得分', '篮板', '得分曲线' ,'篮板曲线']
    },
    xAxis: [
        {
            type: 'category',
            data: ['05-06', '06-07', '11-12', '12-13', '13-14', '14-15', '15-16', '16-17', '17-18', '18-19', '19-20'],
            axisPointer: {
                type: 'shadow'
            }
        }
    ],
    yAxis: [
        {
            type: 'value',
            name: '得分',
            min: 0,
            max: 45,
            interval: 5,
            axisLabel: {
                formatter: '{value} 分'
            }
        },
        {
            type: 'value',
            name: '篮板',
            min: 0,
            max: 45,
            interval: 5,
            axisLabel: {
                formatter: '{value} 个'
            }
        }
    ],
    series: [
        {
            name: '得分',
            type: 'bar',
            data: [20.3, 24.9, 16.7, 24.6, 23.5, 27.5, 26.4, 21.8, 23.9, 22.1, 20.3]
        },
        {
            name: '篮板',
            type: 'bar',
            data: [9.5, 11.5, 10.3, 10.5, 12.8, 10.8, 9.1, 10.0, 12.4, 9.8, 11.0]
        },
        {
            name: '得分曲线',
            type: 'line',
            yAxisIndex: 1,
            data: [20.3, 24.9, 16.7, 24.6, 23.5, 27.5, 26.4, 21.8, 23.9, 22.1, 20.3]
        }
    ]
};


 
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
 
    </script>
	
	<div id="main2" class="main2"></div>
	
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
		
        var myChart = echarts.init(document.getElementById('main2'));
 
        var option = {
    tooltip: {
        trigger: 'axis',
        axisPointer: {
            type: 'cross',
            crossStyle: {
                color: '#999'
            }
        }
    },
    toolbox: {
        feature: {
            dataView: {show: true, readOnly: false},
            magicType: {show: true, type: ['line', 'bar']},
            restore: {show: true},
            saveAsImage: {show: true}
        }
    },
    legend: {
        data: ['得分', '篮板', '得分曲线' ,'篮板曲线']
    },
    xAxis: [
        {
            type: 'category',
            data: ['97-98', '98-99', '99-00', '00-01', '01-02'],
            axisPointer: {
                type: 'shadow'
            }
        }
    ],
    yAxis: [
        {
            type: 'value',
            name: '得分',
            min: 0,
            max: 45,
            interval: 5,
            axisLabel: {
                formatter: '{value} 分'
            }
        },
        {
            type: 'value',
            name: '篮板',
            min: 0,
            max: 45,
            interval: 5,
            axisLabel: {
                formatter: '{value} 个'
            }
        }
    ],
    series: [
        {
            name: '得分',
            type: 'bar',
            data: [10, 20.9, 21.2, 27.1, 32.4]
        },
        {
            name: '篮板',
            type: 'bar',
            data: [8.3, 12.9, 14.6, 19.4, 19]
        },
        {
            name: '得分曲线',
            type: 'line',
            yAxisIndex: 1,
            data: [10, 20.9, 21.2, 27.1, 32.4]
        }
    ]
};


 
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
 
    </script>
    <div class="main3">易建联生涯至今的基础数据展示，从刚进联盟易建联就展现了不输给外援的实力，因此在CBA两年磨练后就前往了NBA；回归CBA后依然稳定高效，始终保持联盟前列。<br>
</div>
    <div class="main4"> 姚明的生涯数据，初出茅庐还显得稚嫩，但是第二年开始就进步飞速，到CBA生涯末期已经打出了恐怖的数据，体现出远超整个联盟的实力，自然也前往了NBA。<br></div>
</body>
</html>