<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scripting tag</title>
</head>
	<%! int count = 0; %>  <!-- 선언문 태그 (변수, 메서드],, 전역 변수로 동작 -->

<body>
	page count is
	<%-- 스크립틀릿 태그 --%>
	<% 
		out.println(++count);
		%>

	<!-- 바디안에도 사용 가능 -->
	<%! int data = 50; %>
	
	<% 
		out.println("Value of the variable is : " + data); // 자바 처럼 실행 가능
	%>
	
	<!-- 메서드 작성 -->
	<%! int sum(int a, int b){
		return a + b;
	}	
	%>
	<%
	out.println(sum(2,3));
	%>

</body>
</html>