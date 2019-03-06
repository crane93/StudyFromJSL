<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>		<!-- 이 문서는 html 5버젼으로 만들어진 겁니다 -->
<html>				<!-- 명령어 == 태그, 사용할땐 <태크>로 쓴다, <html>은 웹문서 하지마루요! -->
	<head>
		<title>폼태그 연습</title>		<!-- 글머리입력 -->
		<meta charset = "utf-8">	<!-- 글머리가 한글로 입력하면 깨질수도 있어 이때 이 라인을 써주면 문제없당 -->
	</head>
	<body>
		<form>
			아이디: <input type = "text" name = "id" placeholder="아이디 써라"><br>		<!-- 타입은 문자로 네임은 입력된 값을 임시로 저장하는 속성 -->
			비밀번호: <input type = "password" name = "pw" placeholder = "비밀번호 써라"><br>		<!-- placeholder는 박스 안에 글자를 쓰는것 -->
			성별: <input type = "radio" name = "m">남			<!-- 라디오는 기억장소 이름이 같아야한다 그래야 값 하나만 클릭가능 -->
			<input type = "radio" name = "m">여<br>		<!-- br: 줄변경태그 -->
			취미: <input type = "checkbox" name="chk1">게임		<!-- 체크박스 저장소는 같아도 됨 --> 
			<input type = "checkbox" name = "chk1">요리
			<input type = "checkbox" name = "chk1">등산<br>
			자기소개: <textarea name="intro" rows="10" cols="60"></textarea>
		</form>
	</body>
</html>				<!-- 마감태그 -->
