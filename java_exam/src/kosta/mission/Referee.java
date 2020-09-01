package kosta.mission;

public class Referee {
	
	private int strike;
	private int ball;
	
	public Referee() {}

	public Referee(int strike, int ball) {
		super();
		this.strike = strike;
		this.ball = ball;
	}

	public int getStrike() {
		return strike;
	}

	public void setStrike(int strike) {
		this.strike = strike;
	}

	public int getBall() {
		return ball;
	}

	public void setBall(int ball) {
		this.ball = ball;
	}
	
	
		
}
