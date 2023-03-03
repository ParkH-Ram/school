<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type ="text/javascript">
function checForm(){
	var regExp = /Java/i;			//정규 표현식 문자 비교 Java i 
	var str = document.frm.title.value	// 입력된 값
	var result = regExp.exec(str);		// exec : 문자 비교 매칭 된 값을 반환
	alert(result[0]);					// 반환된 값 출력
}
	// 변수 생성
	
</script>

<body>
	<!-- 이 화면에서 실행을 해서 비밀번호랑 아이디를 제대로 입력 하면 process_login으로 넘어감 -->
	<form name ="frm">
		<p>제  목 : <input type ="text" name ="title">
		<p>비밀번호 : <input type ="submit" value ="전송" onclick = " checkForm()">
		
	</form>
	

</body>
</html>