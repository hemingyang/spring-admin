# springboot-admin


一个实例应用
多个节点挂载实例对象
###应用对象注解 @EnableAdminServer
![avatar](a1.png)
###实例挂载点

```
server.port=8082
spring.application.name=Spring Boot Client
spring.boot.admin.client.url=http://localhost:8080          ##应用端口
management.endpoints.web.exposure.include=*
```
![avatar](a2.png)

admin面板

![avatar](a.png)

实例对象使用详细参数

![avatar](a3.png)
[![Readme Card](https://github-readme-stats.vercel.app/api/pin/?username=hemingyang&repo=springboot-admin)](https://github.com/hemingyang/springboot-admin)
