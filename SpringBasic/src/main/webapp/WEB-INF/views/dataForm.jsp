<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="/getData" method="post">
       data1 : <input type="text" name="data1" placeholder="문자"><br/>
       data2 : <input type="number" name="data2" placeholder="정수"><br/>
       <input type="submit" value="전송">
    </form>
</body>
</html>