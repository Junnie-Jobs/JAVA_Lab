package userinfo;

public class UserInfo {

	private String userId;
	private String userPasswd;
	private String userName;
	
	public UserInfo(String userId, String userPasswd, String userName){
		this.userId = userId;
		this.userPasswd = userPasswd;
		this.userName = userName;
	}
	
	public UserInfo( UserInfo userInfo ){
		this.userId = userInfo.userId;
		this.userPasswd = userInfo.userPasswd;
		this.userName = userInfo.userName;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPasswd() {
		return userPasswd;
	}
	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
