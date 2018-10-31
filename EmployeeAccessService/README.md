# Employee Access Service : Gets data from Employee Producer Service

# To Refresh Config Data at runtime:

   Following Tag added to bootstrap.yml to refresh the Config Server Properties

  management:
    endpoints:
      web:
        exposure:
          include: refresh 


   Use postman and make a post request to:

  http://localhost:8099/actuator/refresh
