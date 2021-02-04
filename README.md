# Vivek_Social_Media_Status_System_Introtuce

API details:

1. endPoint="/status" method="POST"
  request = {
    userName: "SOME USER NAME",
    text: " SOME STATUS TEXT",
    path: " SOME PATH FOR IMAGE / VIDEO"
  }
  
  2. endPoint="/status" method="GET"
  request = {
    userName: "SOME USER NAME",
    pageNumber: "0",
    pageSize: "10"
  }
  
  3. endPoint="/status/comment" method = "POST"
  
  request = {
    userName: "SOME USER NAME",
    statusId: "SOME STATUS ID",
    text: " SOME COMMENT TEXT"
  }
  
  Database details: 
  
  MongoDB - created a collection "status" in db
