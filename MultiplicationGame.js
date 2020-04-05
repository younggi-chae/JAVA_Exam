  //documnet object model로 구구단게임 브라우저로 이용하기
  var number1 = Math.ceil(Math.random()*9); //1~9까지의 숫자 출력
  var number2 = Math.ceil(Math.random()*9); //1~9까지의 숫자 출력
  var result = number1 * number2;
    
  var 바디 = document.body; //바디태그 선택
  var 단어 = document.createElement('div'); //div 태그 생성
  단어.textContent = String(number1) + '곱하기' + String(number2) + '는?'; //텍스트 내용을 설정하거나 반환한다.
  document.body.append(단어); //div태그안에 문자열 값 위치
  var 폼 = document.createElement('form'); // form 태그 생성
  document.body.append(폼); //바디태그 안에 폼태그 위치
  var 입력창 = document.createElement('input'); //input 태그 생성
  폼.append(입력창); //폼태그 안에 인풋태그 생성
  var 버튼 = document.createElement('button'); //button태그 생성
  버튼.textContent = '입력!';// 텍스트 내용 설정 및 반환
  폼.append(버튼); //폼태그 안에 버튼태그 생성 '입력'이라는 문자열 위치시킴
  var 결과창 = document.createElement('div');
  document.body.append(결과창); //결과창.textContent = '딩동댕!';
  
  폼.addEventListener('submit', function 콜백함수 (e) {
      e.preventDefault(); //submit태그의 페이지 이동 및 고유동작을 중단시킴
      if(result === Number(입력창.value)){
          결과창.textContent = '딩동댕!';
          number1 = Math.ceil(Math.random()*9);  //새로운 문제 반복적으로 출제
          number2 = Math.ceil(Math.random()*9);
          result = number1 * number2;
          단어.textContent = String(number1) + '곱하기' + String(number2) + '는?'
          입력창.value = ''; //정답일 경우 입력창 공백만들기
          입력창.focus(); //입력창으로 포커스 이동
      } else {
          결과창.textContent = '땡!';
          입력창.value = ''; //오답일 경우 입력창 공백만들기
          입력창.focus(); //입력창으로 포커스 이동        
      }
  });
  
  // while(true){   // 답이 맞을 경우, 문제를 반복적으로 출제
    // var number1 = Math.ceil(Math.random()*9); //1~9까지의 숫자 출력
    // var number2 = Math.ceil(Math.random()*9); //1~9까지의 숫자 출력
    // var result = number1 * number2;
    // var condition = true; 
    // while(condition){ //답이 틀릴 경우 무한반복
    //  var answer = prompt(String(number1) + '곱하기' + String(number2) + '는?') //화면출력 내용, 문자열 결합
      // if(result === Number(answer)){
          // alert('딩동댕!');
          // condition = false; //아래 반복문을 빠져나와 위 반복문으로 이동
      // } else {
          // alert('땡!');
      // }
    // }    //1.컴퓨터가 랜덤한 문제를 낸다 -> 2.내가 답은 입력한다 -> 3.답이 맞는가? 
  // }      // no면 2번 단계로, yes면 1번 단계로 이동. 계속해서 반복
