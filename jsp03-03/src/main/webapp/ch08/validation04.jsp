<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type ="text/javascript">
function checkLogin(){
	// 변수 생성
	var form = document.loginForm;
	
	for (i=0; i<form.id.value.length; i++){
		var ch = form.id.value.charAt(i);
		
		if (ch < 'a' || ch > 'z'){
			alert("아이디는 영문 소문자만 입력 가능합니다.");
			form.id.focus();
			return;
		}
	}
	
	if (form.pass.value.length === 0) {
		alert("비밀번호를 입력하세요.");
		form.pass.focus();
		return;
	}
	
	if (isNaN(parseInt(form.pass.value))) {
		alert("비밀번호는 숫자로만 입력 가능합니다.");
		form.pass.select();
		return;
	}
	
	form.submit();
}
</script>

<body>
	<!-- 이 화면에서 실행을 해서 비밀번호랑 아이디를 제대로 입력 하면 process_login으로 넘어감 -->
	<form name ="loginForm" action ="validation04_process.jsp" method="post">
		<p>아 이 디 : <input type ="text" name ="id">
		<p>비밀번호 : <input type ="password" name ="pass">
		<p><input type="button" value = "전송" onclick ="checkLogin()">
	
	</form>
	

</body>
</html>