# Vivek_Social_Media_Status_System_Introtuce

Technologies: Java,Springboot,Mongo DB for database
Softwares used: I used  IntelliJ IDEA for IDE and Postman for API testing.


API details:

1. API TO CREATE STATUS
endPoint="/status" method="POST"
  request = {
    userName: "SOME USER NAME",
    text: " SOME STATUS TEXT",
    path: " SOME PATH FOR IMAGE / VIDEO"
  }
  
   2. API TO COMMENT ON STATUS 
endPoint="/status/comment" method = "POST"
  
  request = {
    userName: "SOME USER NAME",
    statusId: "SOME STATUS ID",
    text: " SOME COMMENT TEXT"
  }
  
  
  3.LIST ALL STATUS BY USER 
 endPoint="/status" method="GET"
  request = {
    userName: "SOME USER NAME",
    pageNumber: "0",
    pageSize: "10"
  }
  
 
  
  Database details: 
  
  MongoDB - created a collection "status" in db
  (Mongo db should be installed on system if we want to run this application on local)
  
  Steps for Project installation:
  
  1. Install Mongo DB
  2. Open terminal and create a collection "status"
  3. Run project after doing mvn clean install on project location and running it
  4. Hit api's using postman
