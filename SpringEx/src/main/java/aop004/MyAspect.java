package aop004;

import org.aspectj.lang.JoinPoint;

// POJO와 XML 기반 
public class MyAspect {
		public void before(JoinPoint joinPoint) {
			System.out.println("얼굴 인식 확인 : 문을 개방하라");
		}
		
		public void lockDoor(JoinPoint joinPoint) {
			System.out.println("주인님 나갔다: 어이  문 잠가!");
		}
}
