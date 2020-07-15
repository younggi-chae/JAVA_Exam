package kosta.oop3;

//추상클래스 연습
public class DaoMain {
	
	public static void main(String[] args) {
		
		MySQLDao m = new MySQLDao();
		OracleDao o = new OracleDao();
		
		Service s = new Service(m);
		s.setDao(o);
		s.insert();
	}
}
