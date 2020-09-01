package object2;

class Tv {
	boolean power;
	int channel;
	
	void power()      { power = !power; }
	void channelUp()  { ++channel;      }
	void chaennlDown() { --channel;     }
	
}

class CaptionTv extends Tv {
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

public class TvTest {

	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = false;
		ctv.displayCaption("Hello, World");

	}

}
