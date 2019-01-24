# bootStudy
> 仅供学习测试使用

pom文件需要导入maven-plugin插件，构建后jar包可以直接运行

* java -jar
* mvn spring-boot:run
* CL

## 整合mybatis
> 需要有驱动包、连接池、mybatis包

* 配置账号、密码、url和驱动类
* 配置映射文件位置、别名包、是否开启驼峰映射
* 编写映射文件，名称空间对应映射器，id对应方法名
* 映射器上添加@Mapper注解
* 映射器和映射文件名称可以不一致，注解方式和xml方式可以同时存在



## 事务
> 需要有驱动包

只需要添加 @Transactional 注解即可

## 整合redis
> 导入redis的启动包即可