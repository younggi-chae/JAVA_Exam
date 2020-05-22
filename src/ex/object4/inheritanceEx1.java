package ex.object4;

class Tv {
	boolean power;  //전원 on/off
	int channel;    //채널
	
	void power()       { power = !power; } // power의 값이 true면 false로, false면 true로 변경하는 역할
	void channelUp()   {   ++channel;    }
	void channelDown() {   --channel;    }
}

class CaptionTv extends Tv {
	boolean caption;    //캡션상태 on/off
	void displayCaption(String text) {
		if(caption) {   //캡션 상태가 on(true)일 때만 text를 보여줌
			System.out.println(text);
		}
	}
}

public class inheritanceEx1 {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello world");
		ctv.caption = true; //캡션 기능 작동
		ctv.displayCaption("Hello world");

	}

}
