package cn.wellstudio.precisehelp.service.impl;

import cn.wellstudio.precisehelp.dao.factory.DaoFactory;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.entity.Usersinfo;
import cn.wellstudio.precisehelp.service.IUserService;

public class UserService implements IUserService{

	public boolean addUser(Users users) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * 通过用户id查询某个用户的资料
	 */
	public Usersinfo queryUsersinfo(Users users) {
		Usersinfo usersinfo = DaoFactory.getUsersinfo().userinfoQuery(users);
		return usersinfo;
	}

	public boolean updateInfo(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean userLogin(String userAccount, String userPsw,
			String userPaypsw) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean userLogin(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean userPay(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usersinfo queryUsersinfo(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
