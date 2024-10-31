iDouShu项目概述
这是一个基于 Spring Boot 的仿小红书项目。该项目使用了多种现代开发技术，实现一个支持实时通信的社交应用。

技术栈
后端: Spring Boot
数据库: MySQL
前端: Vue
WebSocket: 实时通信
ORM: MyBatis-Plus
模板引擎: Apache Velocity
云存储: 阿里云 OSS（可选）

运行环境
Java: 17
Spring Boot: 3.3.3
数据库: MySQL 8.0+
构建工具: Maven 3.6.0+
后端工具IDE: IntelliJ IDEA 
前端工具：HBuilder X


克隆项目：

	在idea和HBuilder X分别导入前后端代码

后端：
	安装后端依赖。

	（如果使用阿里云oss储存图片）后端修改Uploadimage.java代码，将oss的阿里云ID和Secret修改为自己的放入common/下。

	配置数据库：
	在 MySQL 中创建一个数据库（根据后端接口文档）。
	修改 src/main/resources/application.properties，配置数据库连接。
	修改properties：
	spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
	spring.datasource.username=your_username
	spring.datasource.password=your_password

运行项目：
	在HBuilder X运行到web或内置浏览器

