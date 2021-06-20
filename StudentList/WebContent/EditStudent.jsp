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
      <form action="UpdateServlet">
      <c:forEach var="student" items="${studlist}">
           id:<input type="number" name="id" value="${student.getId()}"><br>
           First Name: <input type="text" name="fname" value="${student.getFname()}"><br>
           Last Name : <input type="text" name="lname" value="${student.getLname()}"><br>
           Email : <input type="text" name="email" value="${student.getEmail()} "><br>
           <input type="submit" value="Save">                           
      </c:forEach>
      </form>
      <form action="StudentServlet">
      <input type="submit" value="return to student details">
      </form>
</body>
</html>