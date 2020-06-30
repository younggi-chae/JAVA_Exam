package ex.enum1;


enum DirectionEx {
	EAST(1, ">"), SOUTH(2, "v"), WEST(3, ">"), NORTH(4, "^");
	
	private static final DirectionEx[] DIR_ARR = DirectionEx.values();
	private final int value;
	private final String symbol;
	
	DirectionEx(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}
	
	public int getValue()       { return value;  }
	public String getSymbol()   { return symbol; }
	
	public static DirectionEx of(int dir) {
		if(dir < 1 || dir > 4) {  // 범위에 벗어난 값 exception 발생시킴
			throw new IllegalArgumentException("Invalid value : " + dir);
		}
		return DIR_ARR[dir -1];
	}
	
	public DirectionEx rotate(int num) {
		num = num % 4;
		
		if(num < 0) num += 4;
		
		return DIR_ARR[(value-1+num) % 4];
	}
	public String toString() {
		return name() + getSymbol();
	}
}

public class EnumEx2 {

	public static void main(String[] args) {
		for(DirectionEx d : DirectionEx.values())
			System.out.println(d.name() + " = " + d.getValue());
		
		DirectionEx d1 = DirectionEx.EAST;
		DirectionEx d2 = DirectionEx.of(1);
		
		
		System.out.println(d1.name() + " = " + d1.getValue());
		System.out.println(d2.name() + " = " + d2.getValue());
		System.out.println(DirectionEx.EAST.rotate(1));
		System.out.println(DirectionEx.EAST.rotate(2));
		System.out.println(DirectionEx.EAST.rotate(-1));
		System.out.println(DirectionEx.EAST.rotate(-2));
		

	}

}
