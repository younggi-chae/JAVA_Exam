package lambda;

import java.util.function.*;

//자바8 API에서 제공하는 대표적인 함수형 인터페이스
public class Lambda009 {

	public static void main(String[] args) {
		Runnable run = () -> System.out.println("hello");   //실행할 수 있는 인터페이스  (추상 메서드 void run())
		Supplier<Integer> sup = () -> 3*3;     // 제공할 수 있는 인터페이스   (추상메서드 T get())
		Consumer<Integer> con = num -> System.out.println(num); //소비할 수 있는 인터페이스  (추상메서드 void accept(T t))
		Function<Integer, String> fun = num -> "input : " + num; //입력을 받아서 출력할 수 있는 인터페이스 (추상메서드 R apply(T t))
		Predicate<Integer> pre = num -> num > 10;  //입력을 받아 참/거짓을 단정할 수 있는 인터페이스  (추상메서드 Boolean test(T t))
		UnaryOperator<Integer> uOp = num -> num * num; //단항(Unary) 연산할 수 있는 인터페이스  (추상메서드 T apply(T t))
		
		BiConsumer<String, Integer> bCon = (str, num) -> System.out.println(str+num); //이항 소비자 인터페이스 (추상메서드 void accept(T t, U u))
		BiFunction<Integer, Integer, String> bFun = (num1, num2) -> "add result : " + (num1 + num2); //이항 함수 인터페이스 (추상메서드 R apply(T t, U u))
		BiPredicate<Integer, Integer> bPre = (num1, num2) -> num1 > num2; //이항 단정 인터페이스 (추상메서드 Boolean test(T t, U u)
		BinaryOperator<Integer> bOp = (num1, num2) -> num1 - num2; //이항 연산 인터페이스 (추상메서드 T apply(T t, T t))
 	}

}
