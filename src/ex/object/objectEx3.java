package ex.object;

class Card{
	String kind ;              // 카드무늬 - 인스턴스변수
	int number;                // 카드번호 - 인스턴스변수
	static int width = 100;    // 카드 폭 -  클래스변수
	static int height = 250;   // 카드높이 - 클래스변수
}

public class objectEx3 {

	public static void main(String[] args) {
		System.out.println("Card.width = "+ Card.width);
        System.out.println("Card.height = "+ Card.height);
        
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 4;
        
        Card c2 = new Card();
        c2.kind = "Space";
        c2.number = 7;
        
        System.out.println("c1의 모양과 숫자는 " + c1.kind + c1.number+ ", " + "크기는 " + c1.height+", "+ c1.width);
        System.out.println("c2의 모양과 숫자는 " + c2.kind + c2.number+ ", " + "크기는 " + c2.height+", "+ c2.width);
	
        System.out.println("c1의 width와 height를 각각 50, 150으로 변경");
        
        Card.width = 50;     //클래스변수 변경        // c1.width = 50;
        Card.height = 150;                  // c1.height = 150;
        
        //클래스변수는 모든 인스턴스가 공통된 저장공간을 공유, 한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야할 경우 클래스변수 사용
        System.out.println("c1의 모양과 숫자는 " + c1.kind + c1.number+ ", " + "크기는 " + c1.height+", "+ c1.width);
        System.out.println("c2의 모양과 숫자는 " + c2.kind + c2.number+ ", " + "크기는 " + c2.height+", "+ c2.width);
        //c2의 width, height값도 자동으로 변경되었다.
	}

}
