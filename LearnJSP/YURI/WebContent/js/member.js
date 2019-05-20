function check() {		//사용자 함수 생성, 유효성검사를 할거임
	if(document.my.id.value == ""){		//조건문 > 도큐먼트아래의 my라는 테이블의 id라는 저장소의 값이 공백이면
		alter("아이디입력하세요");			//alter : 새창을 띄우라는 뜻 ㅎ
		my.id.focus();					//focus: 경고창 떠서 확인을 눌렀어 그럼 커서의 위치를 id에 올려놓는것
		return false; 		//
	}
}