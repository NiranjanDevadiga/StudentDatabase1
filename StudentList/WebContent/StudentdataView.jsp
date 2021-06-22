<!-- page 5 - to show the student list -->
<!-- this is the first page when we run the project -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  <!-- we should import core file to use the jstl tag -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Vemana Institue of Technology</h3>
<hr>
<br>
<form action="NewStudent.html"> <!-- this button is for adding the new student -->
      <input type="submit" value="add new Student">  <!-- when we press the new student button it will take us to the new student html page --> 
</form>
<br>
<form action="DeleteStudent.html"> <!-- this button is for deleting the student -->
      <input type="submit" value="Delete Student"> <!-- when we press the  button it will take us to the delete student html page --> 
</form>
<br>
<form action="UpdateStudent.html"> <!-- this button is for updating the student -->
      <input type="submit" value="update Student"><!-- when we press the button it will take us to the update student html page --> 
</form>
<br>
<form action="SearchStudent.html"> <!-- this button is for searching the student -->
      <input type="submit" value="Search Student"><!-- when we press the  button it will take us to the search student html page --> 
</form>
<br>
<table border="1">
       <tr>
          <th>Id</th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Email</th>
       </tr>
       <c:forEach var="student" items="${studentlist}"> <!-- it will take the request from studentservlet class which contains student data "studentlist" should be match when we set the request object in studentservlet class -->
        <tr>
            <td>${student.getId() }</td> <!-- it will show the student id -->
            <td>${student.getFname() }</td> <!-- it will show the student fname -->
            <td>${student.getLname() }</td> <!-- it will show the student lname -->
            <td>${student.getEmail() }</td> <!-- it will show the student emailid -->
        </tr>            
       </c:forEach>


</table>
</body>
</html>