package cn.wellstudio.precisehelp.service.impl;

import cn.wellstudio.precisehelp.dao.IUsersDAO;
import cn.wellstudio.precisehelp.dao.factory.DaoFactory;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.entity.Usersinfo;
import cn.wellstudio.precisehelp.service.IUserService;

/**
 * 用户业务实现
 * @author huhong
 *
 */
public class UserService implements IUserService{
	
	IUsersDAO usersDao;
	public void setUsersDao(IUsersDAO usersDao) {
		this.usersDao = usersDao;
	}

	@Override
	public boolean userLogin(Users user) {
		
		boolean res = usersDao.userLogin(user);
		
		return res;
	}

	@Override
	public boolean userPay(Users user) {
		
		boolean res = usersDao.userPay(user);
		return res;
	}

	@Override
	public Usersinfo queryUsersinfo(String id) {
		
		Usersinfo info =  usersDao.queryUsersinfo(id);
		
		return info;
	}

	@Override
	public boolean updateInfo(Users user) {
		
		boolean res = usersDao.updateInfo(user);
		
		return res;
	}

	@Override
	public boolean addUser(Users users) {
		
		boolean res = usersDao.addUser(users);
		
		return false;
	}



	
}
