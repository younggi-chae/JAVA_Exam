//1.컴퓨터가 임의의 숫자 4자리 만듦 -> 2.답을 입력한다 -> 3.답이 맞는가?
//yes면 1단계로 이동, no면 스트라이크와 볼을 알려주고 2단계로 이동

var 바디 = document.body; //바디태그 선택

var 숫자후보;
var 숫자배열;

function 숫자뽑기(){
    숫자후보 = [1,2,3,4,5,6,7,8,9]; //사용할 숫자들의 배열
    숫자배열 = []; //배열에서 뽑은 숫자들
    for(var i = 0; i < 4; i += 1){
        var 뽑은것 = 숫자후보.splice(Math.floor(Math.random()*(9-i)), 1)[0];  //splice(위치, 갯수)
        숫자배열.push(뽑은것); //splice를 통해 얻은 값을 input     //undefined해결 9-i
    }
 }
 숫자뽑기();

 //화면설정
var 결과 = document.createElement('h1'); //h1태그 생성
바디.append(결과); //바디태그로 삽입
var 폼 = document.createElement('form'); //form태그 생성
document.body.append(폼); //바디태그로 삽입
var 입력창 = document.createElement('input'); //input태그 생성
폼.append(입력창); //폼태그로 삽입
입력창.type = 'text';
입력창.maxLength = 4; //최대 4개숫자까지 입력가능
var 버튼 = document.createElement('button'); //button태그 생성
버튼.textContent = '입력!'; // 브라우저에 보이는 값 설정
폼.append(버튼); //폼태그로 삽입

var 틀린횟수 = 0;
//답 입력
폼.addEventListener('submit', function 비동기(e){
   e.preventDefault(); //submit의 고유작동을 멈춤
   var 답 = 입력창.value; 
   if(답 === 숫자배열.join('')){ //join을 통해 배열값을 문자열로 변환
       결과.textContent = '홈런!!';
       입력창.value = ''; //답이 맞을 경우 입력창 공백
       입력창.focus(); //입력창으로 포커스 이동
       숫자뽑기();

     틀린횟수 = 0;
   } else {
       var 답배열 = 답.split(''); //split를 통해 문자열을 배열값으로 변환
       var 스트라이크 = 0;
       var 볼 = 0;
       틀린횟수 += 1;//틀린횟수 1씩 +
       if(틀린횟수 > 4){
           결과.textContent = '4번 넘게 틀려서 실패! 답은 ' + 숫자배열.join(',')+'였습니다!';
           입력창.value = '';
           입력창.focus();
           숫자뽑기();  

           틀린횟수 = 0;
        } else {
       for(var i = 0; i < 3; i += 1){
           if(Number(답배열[i]) === 숫자배열[i]){ //같은 자리인지 확인
               스트라이크 += 1;
           } else if(숫자배열.indexOf(Number(답배열[i])) > -1){ //같은 자리는 아니지만, 숫자가 겹치는지 확인
                볼 += 1;
            }
       }
       결과.textContent = 스트라이크 + '스트라이크' + 볼 + '볼';
       입력창.value = '';
       입력창.focus();
   }
}
});