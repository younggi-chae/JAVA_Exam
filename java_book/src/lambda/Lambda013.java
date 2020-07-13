package lambda;

import java.util.Arrays;
import java.util.function.BiFunction;

//스트림에서 제공하는 메서드
public class Lambda013 {
	public static void main(String[] args) {
		Double[] nums = {1.0, 4.0, 9.0, 16.0, 25.0};
		
		System.out.println("====Lambda====");
		Arrays.stream(nums).map(num -> Math.sqrt(num)).forEach(sqrtNum -> System.out.println(sqrtNum));
		
		System.out.println();
		
		System.out.println("====Method Reference====");
		Arrays.stream(nums).map(Math::sqrt).forEach(System.out::println);  //클래스::정적 메서드 , 인스턴스::인스턴스메서드
		
		System.out.println();
		
		BiFunction<Integer, Integer, Integer> bip_lambda = (a, b) -> a.compareTo(b);
		BiFunction<Integer, Integer, Integer> bip_method_reference = Integer::compareTo;  //클래스::인스턴스메서드
		
		System.out.println(bip_lambda.apply(10, 12));
		System.out.println(bip_lambda.apply(10, 10));
		System.out.println(bip_lambda.apply(10, 2));
		System.out.println(bip_method_reference.apply(10, 12));
		System.out.println(bip_method_reference.apply(10, 10));
		System.out.println(bip_method_reference.apply(10, 2));
		
	}
}
