package ex.object5;

class Time {
	private int hour;        
	private int minute;
	private int second;

	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {
		return hour;        //단순히 값을 반환
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23)
			return;          //시간 범위 지정 및 맞는 값 반환
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59)
			return;
		this.minute = minute;
	}

	public int getSecond() {  
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59)
			return;
		this.second = second;
	}
}

public class modifierEx1 {

	public static void main(String[] args) {
           
		Time t = new Time(12,35,30);
		System.out.println(t);
		//t.hour = 13;   //제어자가 private이기 때문에 접근 불가
		t.setHour(t.getHour()+1); //메서드를 통해 접근
		System.out.println(t);
	}

}
