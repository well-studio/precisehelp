package cn.wellstudio.precisehelp.service.impl;

import java.util.Set;
import java.util.UUID;

import cn.wellstudio.precisehelp.dao.IUsersDAO;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.entity.Usersinfo;
import cn.wellstudio.precisehelp.service.IUserService;
import cn.wellstudio.precisehelp.util.MD5Util;
import cn.wellstudio.precisehelp.util.ValidateUtil;

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
		
		String account = user.getUserAccount();
		String userPsw = user.getUserPsw();
		
		if( account != null && account.trim() != "" && userPsw != null && userPsw.trim() != null) {
			if( ValidateUtil.isValidMobileNo(account) && ValidateUtil.isRegUserPsw(userPsw) ) {
				return usersDao.userLogin(user);
			} else {
				return false;
			}
		} else {
			return false;
		}
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
		
		String account = users.getUserAccount();
		String userPsw = users.getUserPsw();
//		String userPsw2 = users.getUserPsw2();
		
		if(  ValidateUtil.isValidMobileNo(account) && ValidateUtil.isRegUserPsw(userPsw) && userPsw.equals(userPsw)) {
			users.setUserId(UUID.randomUUID().toString());
			// MD5
			String md5Psw = MD5Util.MD5(userPsw);
			users.setUserPsw(md5Psw);
			return usersDao.addUser(users);
		} else {
			return false;
		}
		
	}



	
}
