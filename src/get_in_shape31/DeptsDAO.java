package get_in_shape31;


public class DeptsDAO { // Database Access Object

	// 멤버변수
	private String url = DBProperties.URL;
	private String uid = DBProperties.UID;
	private String upw = DBProperties.UPW;

	// 생성자
	public DeptsDAO() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("CLASS FOR NAME ERR");
		}		

	}

	// Return Data from table 메소드


	// Insert Data to table  메소드	

	
	// Update Data 메소드
	
	
	
}
