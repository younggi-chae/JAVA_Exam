package lambda;

import java.util.Arrays;

//스트림에서 제공하는 메서드
public class Lambda012 {
	public static void main(String[] args) {
		Integer[] ages = {20, 25, 18, 27, 30, 21, 17, 19, 34, 29};
		
		System.out.println(Arrays.stream(ages).count());
		
		System.out.println(Arrays.stream(ages).mapToInt(age -> age).sum());
		System.out.println(Arrays.stream(ages).mapToInt(age -> age).average());
		System.out.println(Arrays.stream(ages).mapToInt(age -> age).min());
		System.out.println(Arrays.stream(ages).mapToInt(age -> age).max());
		
		System.out.println(Arrays.stream(ages).allMatch(age -> age > 20));
		System.out.println(Arrays.stream(ages).anyMatch(age -> age > 30));
		
		System.out.println(Arrays.stream(ages).findFirst());
		System.out.println(Arrays.stream(ages).findAny());
		
		Arrays.stream(ages).sorted().forEach(System.out::println);
	}
}
