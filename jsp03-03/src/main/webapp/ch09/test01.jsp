<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Locale"%>
<% 

	Locale locale = request.getLocale();
	String displayLanguage = locale.getDisplayLanguage();
	String Language = locale.getLanguage();
	String displayCountry = locale.getDisplayCountry();
	String country = locale.getCountry();

 %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		out.println("로케일 언어 : " + displayLanguage + "<br / >");
		out.println("로케일 언어 코드 : " + Language + "<br / >");
		out.println("로케일 국가 : " + displayCountry + "<br / >");
		out.println("로케일 국가코드 : " + country + "<br / >");
	
	%>

</body>
</html>