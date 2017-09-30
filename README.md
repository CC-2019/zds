# zds

Zookeeper, Dubbo, SpringMVC整合demo


### Zookeeper

Zookeeper是一个分布式的，开放源码的分布式应用程序协调服务，是Google的Chubby一个开源的实现，是Hadoop和Hbase的重要组件。

它是一个为分布式应用提供一致性服务的软件，提供的功能包括：配置维护、名字服务、分布式同步、组服务等。可作为Dubbo服务的注册中心。

**安装**

直接下载zip包，解压，复制conf/zoo_sample.cfg 为zoo.cfg

配置信息：

tickTime：与客户端之间的心跳信息。

dataDir：数据目录，默认日志文件也保存在这个目录里。

clientPort：Zookeeper监听端口。

**启动**

运行bin/zkServer.cmd 或bin/zkServer.sh

#### dubbo-admin

打包dubbo-admin war
```
cd dubbo-admin
mvn package -Dmaven.skip.test=true
```

将dubbo-admin-2.5.5.war 放到tomcat webapps目录下，重启tomcat

登陆用户名和密码在 dubbo-admin-2.5.5/WEB-INF/dubbo.properties 中

这样就能访问`http://localhost:8082/dubbo-admin-2.5.5/` 管理服务了

[参考blog](http://www.cnblogs.com/muliu/p/6931753.html)


#### SpringMVC 添加 Dubbo


#### service

pom.xml的zkclient要配置版本号

不要配置zookeeper 

