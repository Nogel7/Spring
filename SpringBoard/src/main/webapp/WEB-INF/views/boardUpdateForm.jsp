<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <h1>${board.bno }번 글 수정 페이지입니다.</h1>
      <form action="/boardUpdate" method="post">
      <input type="hidden" name="bno" value="${board.bno }"/>
		제목 : <input type="text" name="title" value="${board.title}" /><br/>
		본문 : <textarea rows="10" cols="100" name="content">${board.content}</textarea><br/>
		글쓴이 : <input type="text" name="writer" value="${board.writer }" readonly /><br/>
		<input type="submit" value="제출" />
	</form>
</body>
</html>