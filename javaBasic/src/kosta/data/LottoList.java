import java.util.ArrayList;

public class LottoList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int num;
		
		for(int i = 0; i < 6; i++) {
		num = (int)(Math.random()*45)+1;
			list.add(num);
			if(!list.contains(num)) {
				list.add(num);
			}
		
		}
		for(int i : list) {
			System.out.print(i + ", ");
		}
	}

}
