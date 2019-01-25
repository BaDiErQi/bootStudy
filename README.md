# bootStudy
> 仅供学习测试使用

pom文件需要导入maven-plugin插件，构建后jar包可以直接运行

* java -jar
* mvn spring-boot:run
* CL


## 事务
> 需要有驱动包

只需要添加 @Transactional 注解即可

## 整合mybatis
> 需要有驱动包、连接池、mybatis包

* 配置账号、密码、url和驱动类
* 配置映射文件位置、别名包、是否开启驼峰映射
* 编写映射文件，名称空间对应映射器，id对应方法名
* 映射器上添加@Mapper注解
* 映射器和映射文件名称可以不一致，注解方式和xml方式可以同时存在




## 整合redis
> 导入redis的启动包

* 配置主机、端口、密码、数据库
* 注入模板类操作

## 返回xml数据
> 导入jackson-dataformat-xml包

* 实体类上添加@XmlRootElement和@XmlElement注解
* 指定@RequestMapping的produces属性，利用常量类MediaType

参考：http://blog.sina.com.cn/s/blog_6472d0800102xjpm.html

## lombok
> 导入lombok包

* IDEA下载lombok插件
* 实体类上加 @Data @AllArgsConstructor @NoArgsConstructor 等注解  

@Data : 自动生成set/get方法，toString方法，equals方法，hashCode方法，不带参数的构造方法 

@NoArgsConstructor/@RequiredArgsConstructor/@AllArgsConstructor 
自动生成构造方法

参考：https://www.jianshu.com/p/df3705c54188

## 开启定时任务
> springboot中已集成

* 创建一个定时任务类，方法上加入@Scheduled注解，类上加@Component
* 在启动类application上加入@EnableScheduling注解

参考：https://blog.csdn.net/qq_26525215/article/details/66974880

cron表达式生成：http://cron.qqe2.com/