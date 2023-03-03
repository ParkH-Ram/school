<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.NumberFormat"%>
<%@ page import="java.text.DateFormat"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>현재 로케일의 국가, 날짜, 통화</h3>
	<%
		Locale locale = request.getLocale();
		Date currentDate = new Date();
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
		NumberFormat number = NumberFormat.getNumberInstance(locale);
	%>
	
	<!-- 표현식 -->
	<p> 국가 : <%=locale.getDisplayCountry()%>
	<p> 날짜 : <%=dateFormat.format(currentDate)%>
	<p> 숫자(12345.67) : <%=number.format(12345.67)%>

</body>
</html>