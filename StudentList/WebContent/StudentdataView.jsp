<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
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
<form action="NewStudent.html">
      <input type="submit" value="add new Student">
</form>
<br>
<form action="DeleteStudent.html">
      <input type="submit" value="Delete Student">
</form>
<br>
<form action="UpdateStudent.html">
      <input type="submit" value="update Student">
</form>
<br>
<form action="SearchStudent.html">
      <input type="submit" value="Search Student">
</form>
<br>
<table border="1">
       <tr>
          <th>Id</th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Email</th>
       </tr>
       <c:forEach var="student" items="${studentlist}">
        <tr>
            <td>${student.getId() }</td>
            <td>${student.getFname() }</td>
            <td>${student.getLname() }</td>
            <td>${student.getEmail() }</td>
        </tr>            
       </c:forEach>


</table>
</body>
</html>