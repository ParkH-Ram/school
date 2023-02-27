<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% // 뭔가 자바문 쓸 때   <-- 이라는거 같제?--->
		for(int i=0; i<=10; i++){
			
			 // i를 2로 나눈 나머지가 0이면 출력
			if (i % 2 == 0) 
				out.println(i + "<br>");
		}
		
	
	%>
	<%= new java.util.Date() %> 
</body>
</html>