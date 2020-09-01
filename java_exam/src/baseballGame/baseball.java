package baseballGame;

public class baseball {
	
	int hidden[];
	Referee referee;
	
	public baseball() {
		init();
	}
	
	public void init() {
		hidden = new int[3];
		referee = new Referee();
		
		hidden[0] = (int)(Math.random()*9)+1;
		do {
			hidden[1] = (int)(Math.random()*9)+1;
		} while(hidden[0] == hidden[1]);
		do {
			hidden[2] = (int)(Math.random()*9)+1;
		} while(hidden[1] == hidden[2] || hidden[1] == hidden[2]);
		
		for(int n : hidden) {
			System.out.println(n + " ");
		}
	}
	
	public int countStrike(int input[]) {
			int strike = 0;
		for(int i = 0; i < 3; i++) {
			if(hidden[i] == input[i]) {
				strike++;
			}			
		}
		return strike;
	}
	
	public int countBall(int input[]) {
		int ball = 0;
		for(int i = 0; i < hidden.length; i++) {
			if(hidden[i] == input[i+1]%3) {
				referee.ball++;
			} else if(hidden[i] == input[i+1]%3) {
				ball++;
			}
		}
		return ball++;
	}
	
	public Referee judge(int input[]) {
		referee.setStrike(countStrike(input));
		referee.setBall(countBall(input));
		return referee;
	}
}
