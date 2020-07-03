<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" 
		 pageEncoding="UTF-8" import="com.dao.*" import="com.hibernate.*" import="java.util.List" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta charset="utf-8">
    <title>cba、nba数据比较</title>
    <!-- 引入 echarts.js -->
    <!-- 这里是加载刚下好的echarts.min.js，注意路径 -->
    <script src="echarts.min.js"></script>
<link href="css/数据比较.css" rel="stylesheet" type="text/css">
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
    
    <div id="main" class="main"> </div>
	 <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
		
        var myChart = echarts.init(document.getElementById('main'));
 
        var option = {
    title: {
        text: '个人数据对比'
    },
    tooltip: {},
    legend: {
        data: ['CBA', 'NBA']
    },
    radar: {
        // shape: 'circle',
        name: {
            textStyle: {
                color: '#fff',
                backgroundColor: '#999',
                borderRadius: 3,
                padding: [3, 5]
            }
        },
        indicator: [
            { name: '得分', max: 50},
            { name: '助攻', max: 25},
            { name: '篮板', max: 25},
            { name: '出场时间', max: 50},
            { name: '失误', max: 15},
            { name: '抢断', max: 5}
        ]
    },
    series: [{
        name: 'CBA vs NBA',
        type: 'radar',
        // areaStyle: {normal: {}},
        data: [
            {
                value: [37.8, 8.9, 8.3, 40.4, 3.8, 2],
                name: 'CBA'
            },
            {
                value: [28.7, 7.4, 6.4, 36.7, 4.5, 1.7],
                name: 'NBA'
            }
        ]
    }] 
 
};
 
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
 
    </script>
	<div id="main2" class="main1"></div>
	<script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
		
        var myChart = echarts.init(document.getElementById('main2'));
 
        var option = {
     title: {
        text: '条形图的展示'
    },
    tooltip: {
        trigger: 'axis',
        axisPointer: {            // 坐标轴指示器，坐标轴触发有效
            type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
        }
    },
    legend: {
        data: ['CBA', 'NBA']
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    xAxis: [
        {
            type: 'value'
        }
    ],
    yAxis: [
        {
            type: 'category',
            axisTick: {
                show: false
            },
            data: ['得分', '篮板', '助攻', '出场时间', '失误', '抢断']
        }
    ],
    series: [
        {
            name: 'CBA',
            type: 'bar',
            label: {
                show: true,
                position: 'inside'
            },
            data: [37.8, 8.9, 8.3, 40.4, 3.8, 2]
        },
        {
            name: 'NBA',
            type: 'bar',
            stack: '总量',
            label: {
                show: true,
				position: 'left'
            },
            data: [28.7, 7.4, 6.4, 36.7, 4.5, 1.7]
        }
    ]
};

 
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
          </script>	
    <div class="main4">CBA、NBA顶尖球员基础数据的雷达图对比，仅作参考，侧面反映出CBA外援在相应的环境中更加全能，需要承担更多的责任。<br></div>
	<div id="main3" class="main2"></div>
     <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
		
        var myChart = echarts.init(document.getElementById('main3'));
 
        var option = {
        title: {
        text: '基于CBA政策下的外援与出场的本土球员占比图'
    },   
    tooltip: {
        trigger: 'item',
        formatter: '{a} <br/>{b}: {c} ({d}%)'
    },
    legend: {
        
        data: ['本土球员', '外援']
    },
    series: [
        {
            name: '球员占比',
            type: 'pie',
            radius: ['50%', '70%'],
            avoidLabelOverlap: false,
            label: {
                show: false,
                position: 'center'
            },
            emphasis: {
                label: {
                    show: true,
                    fontSize: '30',
                    fontWeight: 'bold'
                }
            },
            labelLine: {
                show: false
            },
            data: [
                {value: 278, name: '本土球员'},
                {value: 60, name: '外援'}
            ]
        }
    ]
};


 
 
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
 
    </script>	

</body>

	   
</html>
