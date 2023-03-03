<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function checkKey(evt) {
    evt = evt || window.event;
    var charCode = evt.keyCode || evt.which;
    if (charCode < 48 || charCode > 57) {
        alert("숫자만 입력 가능합니다.");
        if (evt.preventDefault) {
            evt.preventDefault();
        } else {
            evt.returnValue = false;
        }
    }
}
</script>
<body>
    <form name="loginForm" action="#" method="post">
        <p>나이: <input type="text" name="age" onkeypress="checkKey(event);">
        <input type="submit" value="전송">
    </form>
</body>
</html>