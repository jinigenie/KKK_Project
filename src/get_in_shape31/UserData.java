package get_in_shape31;

public class UserData {
	
	// 멤버변수 정의 
	private String userName;
	private String userId;
	private String userRank;
	private int userBirth;
	private String userPw;
	
	
	// 생성자 정의
	public UserData(String userName, String userId, String userRank, int userBirth, String userPw) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.userRank = userRank;
		this.userBirth = userBirth;
		this.userPw = userPw;
	}

	
	// getter, setter 
	public int getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(int userBirth) {
		this.userBirth = userBirth;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserRank() {
		return userRank;
	}

	public void setUserRank(String userRank) {
		this.userRank = userRank;
	}

}

