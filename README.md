# SpringAuthorizationServerOauth

Welcome to the **SpringAuthorizationServerOauth** project! This repository showcases a robust implementation of an OAuth2 Authorization Server using Spring Boot, designed to streamline user authentication and authorization in modern applications.

## 🚀 Features

- **OAuth2 Authorization Server**:Leverage Spring Boot to set up a secure and efficient OAuth2 authorization server
- **Token Management**:Issue and manage access tokens seamlessly for authenticated clients
- **Client Registration**:Easily register and configure clients with customizable settings
- **Security Configurations**:Implement best practices in securing RESTful APIs with flexible security configurations

## 🛠️ Getting Started

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/ArsacMohammed/Arsac-SpringAuthorizationServerOauth.git
   cd Arsac-SpringAuthorizationServerOauth
   ```

2. **Build the Project**:
   ```bash
   ./mvnw clean install
   ```

3. **Run the Application**:
   ```bash
   ./mvnw spring-boot:run
   ```

## 📚 Documentation

For detailed guidance on configuring and extending the authorization server, please refer to the [Spring Security OAuth2 documentation](https://docs.spring.io/spring-security-oauth2-boot/docs/current/reference/html5/).

## 🤝 Contributing

We welcome contributions! Please fork the repository and submit a pull request with your enhancements or bug fixes.

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

Elevate your application's security with a robust OAuth2 Authorization Server powered by Spring Boot. 

Notes:
Make sure if localhost is used for both client and auth server then add these in /etc/hosts 
-auth.localhost 127.0.0.1
-client.localhost 127.0.0.1
Because using localhost for both servive can cause overwritten of the browser cookie which cause authourization request not found due to passing of anonymous user to the client server 


