<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <!-- /boardInsert로 보내는 post방식 폼을 생성해주세요.
      폼에서 보내는 요소와 name속성값은 쿼리문을 참조해서 만들어주세요.
      insert로직을 실행하는 컨트롤러도생성해주시고 return값은 ""; 로 우선 두겠습니다. -->
      <form action="/boardInsert" method="post">
            제목 : <input type="text" name="title">
            글쓴이 : <input type="text" name="writer" ><br/>  
            본문 : <textarea name="content" row="20" cols="100"></textarea><br/>    
            <input type="submit" value="제출"><input type="reset" value="초기화">
      </form>
</body>
</html>