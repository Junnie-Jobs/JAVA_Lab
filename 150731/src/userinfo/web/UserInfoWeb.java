package userinfo.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import userinfo.UserInfo;
import userinfo.dao.oracle.UserInfoDaoOracle;
import userinfo.dao.IUserInfoDao;
import userinfo.dao.mysql.UserInfoDaoMySql;

public class UserInfoWeb {

	public static void main(String[] args) throws IOException {
		
		UserInfo user = new UserInfo("141414", "1q2w3e4r", "Lee");
		
		UserInfoDaoOracle daoOracle = new UserInfoDaoOracle();
		UserInfoDaoMySql daoSql = new UserInfoDaoMySql();
		
		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE");
		
		IUserInfoDao dao = new UserInfoDaoOracle();
		
		if(dbType.equals("MYSQL")) {
			
			dao = new UserInfoDaoMySql();
			
			dao.insertUserInfo(user);
			dao.deleteUserInfo(user);
			dao.updateUserInfo(user);
		}		
	}

}
