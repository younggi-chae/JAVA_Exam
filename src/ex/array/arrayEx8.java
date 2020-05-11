package ex.array;

public class arrayEx8 {

	public static void main(String[] args) {
		String names[] = {"kim", "park", "choi"};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("names["+i+"] = "+names[i]);
		}
            String tmp = names[2];
            System.out.println(tmp);
            names[0] = "chae";
            
            for(String str : names)
            	System.out.println(str);
	}

}
