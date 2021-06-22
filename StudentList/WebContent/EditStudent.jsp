<!-- page 15-- it will take the student details from update student class add display in the page -->
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
      <c:forEach var="student" items="${studlist}"> <!-- it will display the student data and we can update the details -->
           id:<input type="number" name="id" value="${student.getId()}"><br>
           First Name: <input type="text" name="fname" value="${student.getFname()}"><br>
           Last Name : <input type="text" name="lname" value="${student.getLname()}"><br>
           Email : <input type="text" name="email" value="${student.getEmail()} "><br>
           <input type="submit" value="Save">  <!-- once we update the data submit, once we submit the data it will transfer to the update servlet class -->                         
      </c:forEach>
      </form>
      <form action="StudentServlet">
      <input type="submit" value="return to student details"> <!-- after editing the student record if we press this button it will take us back to the student details page -->
      </form>
</body>
</html>