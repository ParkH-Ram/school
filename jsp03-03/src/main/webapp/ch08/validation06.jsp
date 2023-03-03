<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type ="text/javascript">
	function checkMember(){
		// 표현식 정의
		var regExpId = /^[a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/; 	// id가 영문자 또는 한글 입력으로 시작
 		var regExpName = /^[가-힣]*$/; 						// ^<< 한글로 시작 * 반복   $<< 끝나는 문자.. 도 한글   이름은 한글만 입력되게
		var regExpPass = /^[0-9]*$/;						// 비밀번호는 숫자만 입력
 		var regExpPhone = /^\d{3}-\d{3,4}-\d{4}$/;      		// 전화번호 패턴으로 입력  ^ << 시작첫 3자리 가운 3~4자리, $<< 끝 자리 마지막 4자리		
		var regExpEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/;
					 
		var form = document.Member;
		
		var id = form.id.value;
		var name = form.name.value;
		var pass = form.pass.value;
 		var phone = form.phone1.value + "-" + form.phone2.value + "-" + form.phone3.value;
		var email = form.email.value;
	 	
		if (!regExpId.test(id)){
			alert("아이디는 문자로 시작!!!!");
			form.id.select();
			return;
		}
		if(!regExpName.test(name)){
			alert("이름은 한글만");
			return;
		}
		if(!regExpPass.test(pass)){
			alert("비밀번호는 숫자만");
			return;
		}
		if(!regExpPhone.test(phone)){
			alert("연락처 확인");
			form.id.select();
			return;
		}
		if (!regExpEmail.test(email)){
			alert ("이메일 입력 확인");
			return;
		}
		
		
	}

</script>
<body>
	<body>
	<!-- 이 화면에서 실행을 해서 비밀번호랑 아이디를 제대로 입력 하면 process_login으로 넘어감 -->
	<form action ="validation06_process.jsp" name ="Member" method="post">
	<p>아 이 디 : <input type="text" name ="id"></p>
	<p>비밀번호 : <input type ="password" name ="pass"></p>
	<p>이    름 : <input type ="text" name ="name"></p>
	<p>휴 대 폰 : <select name ="phone1">
	    <option value="010">010</option>
	    <option value="011">011</option>
	    <option value="016">016</option>
	    <option value="017">017</option>
	    <option value="019">019</option>
	</select>
	- <input type="text" maxlength="4" size ="4" name="phone2">
	- <input type="text" maxlength="4" size ="4" name="phone3"></p>
	<p>이 메 일 : <input type="text" name ="email"></p>
	<p> <input type="button" value ="가입하기" onclick="checkMember()">	
		
				
		
	

</body>
</html>