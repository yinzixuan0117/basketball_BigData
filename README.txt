###########简介
大数据作业是在上学期j2ee的网站框架的基础上完成的，可视化部分的数据填充用的是ssh框架。
###########目录结构描述
├── Readme.txt                   // help
├── dongqiu.sql       //数据库文件
├── src                      // 后端代码
│   ├── com.dao   
│   ├── com.action                
│   ├── com.hibernate         
│   ├── com.other    //过滤器代码               
│   ├── hibernate.cfg.xml
│   ├──struts.xml
├── 
├── webroot                     // 页面部分
│   ├── admin                 //包含了管理员的相关页面，没有使用
│   ├──bootstrap           
│   ├── data-visual        //数据可视化的页面 
│   ├── static                 静态资源        
│   ├──  comment.jsp  //评论页面              
│   ├──  EFRank.jsp   //球员效率值排行榜页面
│   ├──  PtsRank.jsp //球员得分排行榜页面
│   ├──  ReRank.jsp //球员篮板排行榜页面
│   ├──  TeamRank_pts.jsp //球队得分排行榜页面
│   ├──  TeamRank_Re.jsp //球队篮板排行榜页面
│   ├──  TeamRank.jsp //球队积分排行榜页面
│   ├──  index.jsp
│   ├──  login.jsp
│   ├──  regist.jsp
│   ├──  match_result.jsp//查询结果页面
│   ├──  match_table.jsp
│   ├──  player_result.jsp
│   ├──  player_table.jsp
│   ├──  team_result.jsp
│   ├──  team_table.jsp
├── 