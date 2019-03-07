<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="css/style.css" rel = "stylesheet">
<title>폼연습</title>
</head>
<body>
	<form method="post" action = "notice.jsp">		<!-- 메소드: 전송방식, post다량의 데이터 전송,은닉화/get:쿼리 스트리밍방식,소량,전송되는 값이 눈에 보인다  action:임시기억장소, ""안의 내용은 처리 프로그램 -->
		<table class = "tbw">			<!-- 표를 만드는 태그, 표에 직접 스타일시트 적용가능 -->
			<tr>	<!-- 표안에 한 행 삽입하는 태그ㄴ -->
				<td class ="tbb">제목</td>
				<td class ="tbb"><input type = "text" name = "title" class="inb"></td>		<!-- input에만 클래스 적용하고 싶을때 <>안에 같이 써주자 -->
			</tr>
			<tr>
				<td class ="tbb">글쓴이</td>
				<td class ="tbb"><input type ="text" name "writer" class="inb"></td>
			</tr>
			<tr>
				<td class ="tbb">글내용</td>
				<td class ="tbb"><textarea name = "cont" class="inb h200" ></textarea></td>
			</tr>
			<tr>	
				<td class ="tbb">첨부파일</td>
				<td class ="tbb"><input type="file" name = "app" class="inb"></td>
			</tr>
		</table>
	</form>
</body>
</html>