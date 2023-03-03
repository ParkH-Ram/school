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
		
		
		if (form.id.value.length < 4 || form.id.value.length >12){    // id 값 체크
			alert("아이디는 4~12자 이내로 입력 가능");
			form.id.focus();     // 경고창 확인 버튼을 누르면 id 입력 필드로 이동
			return;
		}
		if (form.pass.value.length <4){
			alert("비밀번호는 4자 이상 입력");
			form.pass.select();   // pass 입력 필드로 이동
			return false;
			
		}
		form.submit();    // 입력 데이터 전송

		alert ("아이디 : " + document.loginForm.id.value + "\n" + 
				"비밀번호 :" + document.loginForm.pass.value);
	}
</script>

<body>
	<!-- 이 화면에서 실행을 해서 비밀번호랑 아이디를 제대로 입력 하면 process_login으로 넘어감 -->
	<form name ="loginForm" action ="process_login.jsp" method="post">
		<p>아 이 디 : <input type ="text" name ="id">
		<p>비밀번호 : <input type ="password" name ="pass">
		<p><input type="button" value = "전송" onclick ="checkLogin()">
	
	</form>
	

</body>
</html>