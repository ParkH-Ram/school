<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix ="c"  uri = "http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var ="k" begin ="1" end ="10" step= "1">
		<c:out value ="${k}" />
	</c:forEach>
	
	<dependency>
<groupId>org.glassfish.web</groupId>
<artifactId>jakarta.servlet.jsp.jstl</artifactId>
<version>2.0.0</version>
<scope>runtime</scope>
</dependency>

</body>
</html>	