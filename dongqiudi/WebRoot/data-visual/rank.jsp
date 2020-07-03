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
    <title>排行榜数据</title>
    <!-- 引入 echarts.js -->
    <!-- 这里是加载刚下好的echarts.min.js，注意路径 -->
    <script src="echarts.min.js"></script>
<link href="css/排行榜.css" rel="stylesheet" type="text/css">
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
        axisPointer: {            // 坐标轴指示器，坐标轴触发有效
            type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
        }
    },
    legend: {
        data: ['场均得分', '场均篮板', '投篮命中率', '三分命中率','罚球命中率']
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    xAxis: [
        {
            type: 'category',
			
            data: ['琼斯', '布莱克尼', '约瑟夫杨', '亚当斯', '汉斯布鲁', '哈里斯', '吉布森','威尔斯','富兰克林','哈德森']
        }
    ],
    yAxis: [
        {
            type: 'value'
        }
    ],
    series: [
        {
            name: '场均得分',
            type: 'bar',
            data: [37.8, 36.3, 35.9, 34.8, 32.3, 32, 31.2, 31.1, 30.1, 29.2]
        },
        {
            name: '场均篮板',
            type: 'bar',
          
            data: [8.3, 6.5, 4.2, 8.2, 13.4, 10, 5.3, 7.6, 9.6, 7.8]
        },
        {
            name: '投篮命中率',
            type: 'bar',
            stack: '180俱乐部',
            data: [46.70, 51.50, 51.60, 46.30, 54.50, 55.60, 44, 48.60, 46.50, 46.50]
        },
        {
            name: '三分命中率',
            type: 'bar',
            stack: '180俱乐部',
            data: [28.30, 46.40, 38.40, 35.30, 14.30, 28.60, 40.70, 41.20, 34.10, 39.50]
        },
		{
            name: '罚球命中率',
            type: 'bar',
            stack: '180俱乐部',
            data: [80.60, 71.80, 90, 87.60, 88.30, 0, 86.90, 83.50, 83.50, 89.40,]
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
        axisPointer: {            // 坐标轴指示器，坐标轴触发有效
            type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
        }
    },
    legend: {
        data: ['场均得分', '场均篮板', '投篮命中率', '三分命中率','罚球命中率']
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    xAxis: [
        {
            type: 'category',
			
            data: ['王哲林','周琦', '易建联', '郭艾伦', '陈林坚', '付豪', '时德帅', '胡金秋', '阿不都', '孙铭徽']
        }
    ],
    yAxis: [
        {
            type: 'value'
        }
    ],
    series: [
        {
            name: '场均得分',
            type: 'bar',
            data: [25.7, 20.7, 20.3, 19.3, 19.1, 18.4, 17.6, 17.2, 16.8, 16.2]
        },
        {
            name: '场均篮板',
            type: 'bar',
          
            data: [10.6, 11.9, 11, 3.4, 3.8, 9.6, 6.8, 9, 5, 3.6]
        },
        {
            name: '投篮命中率',
            type: 'bar',
            stack: '180俱乐部',
            data: [57, 53, 52, 49, 48, 48, 50, 61, 49, 51]
        },
        {
            name: '三分命中率',
            type: 'bar',
            stack: '180俱乐部',
            data: [23, 31, 37, 31, 44, 0, 38, 41, 33, 33]
        },
		{
            name: '罚球命中率',
            type: 'bar',
            stack: '180俱乐部',
            data: [63, 63, 81, 75, 81, 75, 81, 79, 75, 68]
        }
    ]
};


 
 
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
 
    </script>
	<div class="main6">
投篮+3分+罚球命中率达到180是判断一名球员投射是否优秀的一项重要指标，该表反应了得分排行榜前十的球员的投射能力。<br>
	</div>
	<div class="main7">
国内球员得分榜前十的命中率之和，此图表反应了国内球员在高得分的情况下能否保持效率。<br>
	</div>
	<div id="main3" class="main3"></div>
	
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
		
        var myChart = echarts.init(document.getElementById('main3'));
		
		var dataAxis = ['富兰克林', '杰克逊', '琼斯', '杰特', '费尔德', '哈德森', '劳森', '福特森', '杨', '威姆斯'];
var data = [10.1, 10.1, 8.9, 8.6, 8.4, 7.9, 7.4, 7.3, 7.1, 6.5];
var yMax = 13;
var dataShadow = [];

for (var i = 0; i < data.length; i++) {
    dataShadow.push(yMax);
}
 
        var option = {
    title: {
        text: '外援助攻排行榜前十'
    },
    xAxis: {
        data: dataAxis,
        axisLabel: {
            inside: true,
            textStyle: {
                color: '#fff'
            }
        },
        axisTick: {
            show: false
        },
        axisLine: {
            show: false
        },
        z: 10
    },
    yAxis: {
        axisLine: {
            show: false
        },
        axisTick: {
            show: false
        },
        axisLabel: {
            textStyle: {
                color: '#999'
            }
        }
    },
    dataZoom: [
        {
            type: 'inside'
        }
    ],
    series: [
        { // For shadow
            type: 'bar',
            itemStyle: {
                color: 'rgba(0,0,0,0.05)'
            },
            barGap: '-100%',
            barCategoryGap: '40%',
            data: dataShadow,
            animation: false
        },
        {
            type: 'bar',
            itemStyle: {
                color: new echarts.graphic.LinearGradient(
                    0, 0, 0, 1,
                    [
                        {offset: 0, color: '#83bff6'},
                        {offset: 0.5, color: '#188df0'},
                        {offset: 1, color: '#188df0'}
                    ]
                )
            },
            emphasis: {
                itemStyle: {
                    color: new echarts.graphic.LinearGradient(
                        0, 0, 0, 1,
                        [
                            {offset: 0, color: '#2378f7'},
                            {offset: 0.7, color: '#2378f7'},
                            {offset: 1, color: '#83bff6'}
                        ]
                    )
                }
            },
            data: data
        }
    ]
};

// Enable data zoom when user click bar.
var zoomSize = 6;
myChart.on('click', function (params) {
    console.log(dataAxis[Math.max(params.dataIndex - zoomSize / 2, 0)]);
    myChart.dispatchAction({
        type: 'dataZoom',
        startValue: dataAxis[Math.max(params.dataIndex - zoomSize / 2, 0)],
        endValue: dataAxis[Math.min(params.dataIndex + zoomSize / 2, data.length - 1)]
    });
});
 
 
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
 
    </script>
	
	 <div id="main4" class="main4"></div>
	
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
		
        var myChart = echarts.init(document.getElementById('main4'));
		
		var dataAxis = ['孙铭徽', '郭艾伦', '方硕', '孙悦', '曾令旭', '陈盈骏', '赵睿', '西热力江', '史鸿飞', '吴前'];
var data = [5.3, 5, 4.7, 4.6, 4.6, 4.3, 4.2, 4.1, 4.1, 3.8];
var yMax = 8;
var dataShadow = [];

for (var i = 0; i < data.length; i++) {
    dataShadow.push(yMax);
}
 
        var option = {
    title: {
        text: '本土球员助攻排行榜前十'
    },
    xAxis: {
        data: dataAxis,
        axisLabel: {
            inside: true,
            textStyle: {
                color: '#fff'
            }
        },
        axisTick: {
            show: false
        },
        axisLine: {
            show: false
        },
        z: 10
    },
    yAxis: {
        axisLine: {
            show: false
        },
        axisTick: {
            show: false
        },
        axisLabel: {
            textStyle: {
                color: '#999'
            }
        }
    },
    dataZoom: [
        {
            type: 'inside'
        }
    ],
    series: [
        { // For shadow
            type: 'bar',
            itemStyle: {
                color: 'rgba(0,0,0,0.05)'
            },
            barGap: '-100%',
            barCategoryGap: '40%',
            data: dataShadow,
            animation: false
        },
        {
            type: 'bar',
            itemStyle: {
                color: new echarts.graphic.LinearGradient(
                    0, 0, 0, 1,
                    [
                        {offset: 0, color: '#83bff6'},
                        {offset: 0.5, color: '#188df0'},
                        {offset: 1, color: '#188df0'}
                    ]
                )
            },
            emphasis: {
                itemStyle: {
                    color: new echarts.graphic.LinearGradient(
                        0, 0, 0, 1,
                        [
                            {offset: 0, color: '#2378f7'},
                            {offset: 0.7, color: '#2378f7'},
                            {offset: 1, color: '#83bff6'}
                        ]
                    )
                }
            },
            data: data
        }
    ]
};

// Enable data zoom when user click bar.
var zoomSize = 6;
myChart.on('click', function (params) {
    console.log(dataAxis[Math.max(params.dataIndex - zoomSize / 2, 0)]);
    myChart.dispatchAction({
        type: 'dataZoom',
        startValue: dataAxis[Math.max(params.dataIndex - zoomSize / 2, 0)],
        endValue: dataAxis[Math.min(params.dataIndex + zoomSize / 2, data.length - 1)]
    });
});
 
 
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
 
    </script>
	<div class="main8">
作为篮球三项基础数据之一的助攻，我们看到外援在助攻排行榜上的具体数值，与国内球员进行比对。<br>
	</div>
	<div class="main9">
 国内球员在助攻方面与外援有略微差距，且助攻排行榜前列球员无法兼顾高得分。
	</div>
		 <div id="main5" class="main5"></div>
	
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
		
        var myChart = echarts.init(document.getElementById('main5'));
 
        var option = {
    tooltip: {
        trigger: 'axis',
        axisPointer: {            // 坐标轴指示器，坐标轴触发有效
            type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
        }
    },
    legend: {
        data: ['本土球员', '外援']
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
            data: ['时间', '时间', '时间', '时间', '时间', '时间', '时间', '时间', '时间', '时间']
        }
    ],
    series: [
        {
            name: '本土球员',
            type: 'bar',
            label: {
                show: true,
                position: 'inside'
            },
            data: [40.7, 38.4, 37.8, 37.6, 36.9, 36.7, 36.5, 35.2, 34.7, 34.3]
        },
        {
            name: '外援',
            type: 'bar',
            //stack: '总量',
            label: {
                show: true,
				position: 'left'
            },
            data: [41.2, 40.4, 39.4, 38.8, 37.9, 37.7, 37.5, 37.5, 37.1, 36.4]
        }
    ]
};

 
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
 
    </script>
    <div class="main10">
出场时间对比，外援在有规则限制下，承担着更大的任务，也有着更长的出场时间。
    </div>
</body>
</html>