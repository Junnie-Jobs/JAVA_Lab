package userinfo.dao;

import userinfo.UserInfo;

public interface IUserInfoDao {

	void insertUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
}
