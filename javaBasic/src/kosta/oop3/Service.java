package kosta.oop3;

//추상클래스 연습
public class Service {
	
	Dao dao;
	
	Service() {}	
	
	public Service(Dao dao) {
		super();
		this.dao = dao;
	}
	
	public void insert() {
		dao.insert();
	}

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	
}
