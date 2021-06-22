<!-- page 20--it will take the student details from search servlet class add display in the page -->
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
<h4>Searched Student Details</h4>
<c:forEach var="student" items="${studlist}"><!-- it will display the student data -->
      id: ${student.getId()}<br>
      First Name: ${student.getFname()}<br>
      Last Name : ${student.getLname()}<br>
      email: ${student.getEmail()}
</c:forEach>
<br>
<form action="StudentServlet">
      <input type="submit" value="return to student details"> <!-- it will take back us to the student list -->
</form>
</body>
</html>