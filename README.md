# Annual_attendance_management_sb
一、系统流实现：
1.需要前端页面
2.后台需要处理数据
3.需要连接数据库
4.前端显示统计结果
5.部署到服务器

二、前端页面
1.有登录页面
2.主页（可切换部门）
3.可以显示部门所有人当天的考勤
4.有搜索框（可按人名检测、工号）
5.有年度统计记录（月度、季度）页面
或根据指定几个月统计结果的页面

 三、数据库设计
1.员工表


2.月份统计表


四、业务处理
可以换成
Spring Boot + MybatisPlus 框架开发
1.dao:数据层，与数据库交换数据
2.controller：控制层，与service交互，将统计结果展示
3.service：业务层，取数据、放数据
（1）将按名字和日期分组，统计上午的和下午的记录不为空之和/2、统计加班记录不为空的；
（2）连接月份统计表，写入该表
（3）将月份表的数据提取展示
4.domain:实体层，定义员工表的属性字段，年月统计表属性字段
五、框架
Spring Boot + MybatisPlus 
+ mySQL