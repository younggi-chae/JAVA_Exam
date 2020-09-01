package ex.collection2;
import java.util.*;

//최근 입력한 기록 목록 만들기
public class QueueEx1 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;  //Queue를 최대 5까지 저장
    
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.print(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) { // 대소문자 관계없이 비교
					System.exit(0);               // 시스템을 빠져나온다.
				} else if(input.equalsIgnoreCase("help")) {  
				      System.out.println("help - 도움말을 보여줍니다.");
				      System.out.println("q 또는 Q - 프로그램을 종료합니다.");
				      System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE + "개를 보여줍니다.");
				} else if(input.equalsIgnoreCase("history")) {
					  int i = 0;
					  save(input);  //입력되는 값을 저장
					  
					  LinkedList tmp = (LinkedList)q; //링크드리스트의 내용을 보여준다.
					  ListIterator it = tmp.listIterator(); //저장된 요소를 읽어오는 방법
					  
					  while(it.hasNext()) {  //hasNext() 메서드를 통해 요소를 가지고 있으면 true반환 , 없으면 false반환
						  System.out.println(++i + "." + it.next()); //next()메서드는 통해 리스트의 다음 요소를 반환
					  }
				} else {
					save(input);
					System.out.println(input);
				}
			} catch(Exception e) {
				System.out.println("입력오류입니다.");
			}
		}

	}
	public static void save(String input) {
		if(!"".equals(input))
			q.offer(input);   // Queue에 입력값을 저장
		if(q.size() > MAX_SIZE)
			q.remove();  //리스트에 최대 5개까지만 들어갈 수 있도록
	}

}
