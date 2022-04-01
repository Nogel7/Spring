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
    <form action="/userInfo" method="post">
       나이 : <input type="number" name="userAge"><br/>
       아이디 : <input type="text" name="userId"><br/>
       패스워드 : <input type="text" name="userPw"><br/>
       이름 : <input type="text" name="userName"><br/>
       회원번호 : <input type="number" name="userNum"><br/>
       <input type="submit" value="제출">
    </form>
</body>
</html>