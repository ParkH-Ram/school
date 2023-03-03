<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type = "text/javascript">
	function CheckKey(){
		if(!(event.keyCode >= 48 && event.keyCode <= 57)) {
			alert ("숫자만 입력 가능");
			event.returnValue=false;)
		}
	}


</script>
<body>
	<form name ="loginForm" action="#" method="post">
		<p> 나 이 : <input type =text name ="age" onkeypress="CheckKey()">
		<input type ="submit" value="전송">
	
	</form>

</body>
</html>

