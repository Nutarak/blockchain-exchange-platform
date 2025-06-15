# 区块链交易平台开发（Java + Spring Boot）

本项目是一个用于学习和实践后端开发技能的区块链交易平台后端，采用 Java 17 + Spring Boot 3.5 + PostgreSQL 构建，支持用户管理、订单撮合、钱包系统等模块。

---

## ✅ 项目结构

blockchain-exchange-platform/
├── src/
│ ├── main/java/com/example/demo/
│ │ ├── entity/ # 实体类
│ │ ├── repository/ # JPA仓库接口
│ │ └── controller/ # REST API 控制器
│ └── resources/
│ └── application.properties
├── pom.xml
└── README.md

---

## ✅ 当前进度（阶段一）

- [x] Spring Boot 项目搭建
- [x] PostgreSQL 数据库连接
- [x] 权限修复与数据库建表
- [x] 实现用户创建与查询接口
- [x] Curl 测试通过 ✅

---

## 🔧 技术栈

- Java 17
- Spring Boot 3.5
- Spring Data JPA
- PostgreSQL
- Maven
- HikariCP
- cURL（API 测试）

---

## 🧪 测试接口

创建用户：

```bash
curl -X POST http://localhost:8080/api/users \
  -H "Content-Type: application/json" \
  -d '{"username":"alice","email":"alice@example.com"}'

获取所有用户：

curl http://localhost:8080/api/users


