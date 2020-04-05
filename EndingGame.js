//HTML태그를 자바스크립트로 번역해주는 통역사같은 역할 , DOM객체

var 바디 = document.body; //바디태그 선택
var 단어 = document.createElement('div'); //div 태그 생성
단어.textContent = '김밥'; //텍스트 내용을 설정하거나 반환한다.
document.body.append(단어); //div태그안에 '김밥' 문자열 값 위치
var 폼 = document.createElement('form'); // form 태그 생성
document.body.append(폼); //바디태그 안에 폼태그 위치
var 입력창 = document.createElement('input'); //input 태그 생성
폼.append(입력창); //폼태그 안에 인풋태그 생성
var 버튼 = document.createElement('button');
버튼.textContent = '입력!';
폼.append(버튼); //폼태그 안에 버튼태그 생성 '입력'이라는 문자열 반환
var 결과창 = document.createElement('div');
document.body.append(결과창); //결과창.textContent = '딩동댕!';

폼.addEventListener('submit', function 콜백함수 (e) {
    e.preventDefault(); //submit태그의 페이지 이동 및 고유동작을 중단시킴
    if(단어.textContent[단어.textContent.length -1] === 입력창.value[0]){
        결과창.textContent = '딩동댕!';
        단어.textContent = 입력창.value; //true
        입력창.value = ''; //정답일 경우 입력창 공백만들기
        입력창.focus(); //입력창으로 포커스 이동
    } else {
        결과창.textContent = '땡!';
        입력창.value = ''; //오답일 경우 입력창 공백만들기
        입력창.focus(); //입력창으로 포커스 이동        
    }
});

// var word = '김밥'; //첫 단어 선언. 초기화
//   while(true){
    // var answer = prompt(word); //반복문 조건
    // if(word[word.length -1] === answer[0]){ //length-1로 마지막글자 index번호 추출
    // alert('딩동댕!!');
    //  word=answer; //word=answer로 answer이 새로운 word가 된다.
    // }
    //  else{
        // alert('땡!!')
    // }
// }