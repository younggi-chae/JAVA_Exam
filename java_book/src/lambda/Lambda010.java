package lambda;


//컬렉션 스트림에서 람다 사용 - 미성년자 출입 제한 소스
public class Lambda010 {

	public static void main(String[] args) {
		Integer[] ages = {20, 25, 18, 27, 30, 21, 17, 19, 34, 29};
		
		
		for(int age : ages) {
			if(age < 20) {
				System.out.format("Age %d!!! Can't enter\n", age);
			}
		}
		
//		for(int i = 0; i < ages.length; i++)
//			if(ages[i] < 20) 
//				System.out.format("Age %d!!! Can't enter\n", ages[i]);
			}
		}

	


