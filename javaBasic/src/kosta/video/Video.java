package kosta.video;


public class Video {
	// 1, 2, 4번 출력
	
	private String num;
	private String name;
	private String act;
		
	public Video() {}		
	
	public Video(String num, String name, String act) {
		super();
		this.num = num;
		this.name = name;
		this.act = act;		
	}				

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAct() {
		return act;
	}

	public void setAct(String act) {
		this.act = act;
	}
	
}
