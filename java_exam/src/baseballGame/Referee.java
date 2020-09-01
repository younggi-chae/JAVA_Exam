package baseballGame;

public class Referee {
	int Strike = 0;
	int ball = 0;
	
	public Referee() {}

	public int getStrike() {
		return Strike;
	}

	public void setStrike(int strike) {
		Strike = strike;
	}

	public int getBall() {
		return ball;
	}

	public void setBall(int ball) {
		this.ball = ball;
	}
}
