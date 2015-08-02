package userinfo.dao.oracle;

import userinfo.UserInfo;
import userinfo.dao.IUserInfoDao;

public class UserInfoDaoOracle implements IUserInfoDao{

	public void insertUserInfo(UserInfo userInfo){
		System.out.println("insert UserInfo into ORACLE" + userInfo.getUserId());
	}
	
	public void deleteUserInfo(UserInfo userInfo){
		System.out.println("delete UserInfo into ORACLE" + userInfo.getUserId());
	}
	
	public void updateUserInfo(UserInfo userInfo){
		System.out.println("update UserInfo into ORACLE" + userInfo.getUserId());
	}
}
