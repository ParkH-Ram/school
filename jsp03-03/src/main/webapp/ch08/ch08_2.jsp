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
			if (form.id.value==""){    // id 값 체크
			alert("아이디 입력");
			form.id.focus();     // 경고창 확인 버튼을 누르면 id 입력 필드로 이동
			return false;
			
		}else if (form.pass.value==""){
			alert("비밀번호 입력");
			form.pass.focus();   // pass 입력 필드로 이동
			return false;
			
		}
		form.submit();    // 입력 데이터 전송

		alert ("아이디 : " + document.loginForm.id.value + "\n" + 
				"비밀번호 :" + document.loginForm.pass.value);
	}
</script>

<body>
	<form name ="loginForm">
		<p>아 이 디 : <input type ="text" name ="id">
		<p>비밀번호 : <input type ="password" name ="pass">
		
		<!-- 버튼을 클릭했을 때 checkLogin 함수 실행 -->
		<p><input type="button" value = "전송" onclick ="checkLogin()">
	
	</form>

</body>
</html>