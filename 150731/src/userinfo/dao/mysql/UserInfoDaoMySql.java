package userinfo.dao.mysql;

import userinfo.UserInfo;
import userinfo.dao.IUserInfoDao;

public class UserInfoDaoMySql implements IUserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert UserInfo into MYSQL" + userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete UserInfo into MYSQL" + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update UserInfo into MYSQL" + userInfo.getUserId());
	}	
}
