package ex.object;


public class objectEx2 {

	public static void main(String[] args) {
		
		Tv[] tvArr = new Tv[3]; //길이가 3인 객체배열 생성
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10; //tvArr[i]의 channel에 i+10을 저장
		}
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp(); // tvArr[i]의 메서드를 호출
			System.out.println(tvArr[i].channel);
		}
	}

}

