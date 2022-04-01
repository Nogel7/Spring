<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>회원정보</h1>
    이름 : ${userVO.userName}<br/>
    아이디 : ${userVO.userId }<br/>
    비밀번호 : ${userVO.userPw }<br/>
    회원번호 : ${userVO.userNum }<br/>
    나이 : ${userVO.userAge }<br/>
</body>
</html>