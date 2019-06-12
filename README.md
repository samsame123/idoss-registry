# idoss-registry
服务注册中心

# 环境配置
+ hosts配置：增加 -> 127.0.0.1     eureka.local.master eureka.local.slave

# 工程启动
+ 打包：mvn clean install
+ 取到jar包： idoss-registry-0.0.1-SNAPSHOT.jar
+ 启动master节点：nohup java -jar -Xmx512m idoss-registry-0.0.1-SNAPSHOT.jar --spring.profiles.active=master > registry-master.log &
+ 启动slave节点：nohup java -jar -Xmx512m idoss-registry-0.0.1-SNAPSHOT.jar --spring.profiles.active=slave > registry-slave.log &

