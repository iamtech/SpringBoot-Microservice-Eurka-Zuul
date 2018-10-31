# SpringBoot-Microservice with JWT and Role Based Access
A Spring Boot Microservice Example that includes *Eureka Server, Zuul Gatway (JWT and RBA), Spring Cloud Config Server, Hystrix (Circuit Breaker) and three custom services for data.*

**_A Front End Module for accessing these Microservices in written in Angular 6. Below is the link:  
[EmployeeApp Angular](https://github.com/iamtech/EmployeeApp)_**

## EurekaServerProj
Hosts eureka server.  
PORT: 8761  
[EurekaServerProj Repo Link](https://github.com/iamtech/EurekaServerProj)

## GatewayServerZuul  
Gateway for microservies. It includes JWT and Rolebased Access.    
PORT: 8093  
[GatewayServerZuul Repo Link](https://github.com/iamtech/GatewayServerZuul)

## ConfigurationService
Providing common configurations and constants to all microservices.  
PORT: 8094  
[ConfigurationService Repo Link](https://github.com/iamtech/ConfigurationService)

## HystrixDashboard
Provide alternate methods in case of cuircuit break.  
PORT: 8092  
[HystrixDashboard Repo Link](https://github.com/iamtech/HystrixDashboardServer)

## EmployeeProducerService
Custom Service that provides Employee Data.  
PORT: 8097  
[EmployeeProducerService Repo Link](https://github.com/iamtech/EmployeeProducerService)

## EmployeeAccessService
Custom Service that calls EmployeeProducerService (testing purpose).  
PORT: 8099  
[EmployeeAccessService Repo Link](https://github.com/iamtech/EmployeeAccessService)

## TicketSystemService
Custom Service that provides data on tickets/tasks.  
PORT: 8098  
[TicketSystemService Repo Link](https://github.com/iamtech/TicketSystemService)
