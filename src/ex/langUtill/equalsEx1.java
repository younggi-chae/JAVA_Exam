package ex.langUtill;

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
}

public class equalsEx1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다.");
		}
		//equals메서드는 주소값으로 비교하기 때문에 false
		
        v2 = v1;  //v2는 v1이 참조하고 있는 인스턴스 주소값이 저장, 같은 주소값
        
        if(v1.equals(v2)) {
        	System.out.println("v1과 v2는 같습니다.");
        } else {
        	System.out.println("v1과 v2는 다릅니다.");
        }
	}

}
