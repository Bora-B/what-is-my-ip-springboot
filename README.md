# 🌐 What is My IP - Spring Boot

A simple demo REST API application built with Spring Boot that returns the public IP address of the client making the request.

Access the API: `http://localhost:8080/api/client/info`

#### ✅ Sample Response
```json
{
  "ephemeralPort": 53494,
  "localPort": 8080,
  "localIp": "192.168.1.106",
  "remoteIp": "192.168.1.106",
  "requestTime": "2025-06-30T19:58:10.7920674"
}
```

🛠️ Technologies Used
- Java 17
- Spring Boot 3.5.3
- Maven
- RESTful API