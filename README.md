# bootStudy
> 仅供学习测试使用

pom文件需要导入maven-plugin插件，构建后jar包可以直接运行

* 进入target文件夹，java -jar xxx.jar
* 进入pom文件所在目录，运行 mvn spring-boot:run


## 事务
> 需要有驱动包

只需要添加 @Transactional 注解即可  
@Transactional 注解需要配置 rollbackFor属性

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


## 整合Swagger
> 导包 springfox-swagger2 、springfox-swagger-ui
>
> API可以分拆为单独模块，注解写在interface上。    
> 业务模块引入API模块，controller层实现interface，实现业务数据和API的解耦合
> 配置类和启动注解可以写在API模块，上线时注释启动注解，对c端屏蔽swagger-ui页面
>
> 可以实现实体类DO、VO的拆分，避免一个类上Lombok/swagger/validate/jpa等注解过多

* 编写配置类，apiInfo信息，注册Docket实例
* 配置类上添加@EnableSwagger2启动注解
* 在实体类上配置@ApiModel/@ApiModelProperty注解
*
* 访问路径：http://localhost:8080/boot/swagger-ui.html 

参考：https://blog.csdn.net/forezp/article/details/71023536

https://www.jianshu.com/p/85df3247660d