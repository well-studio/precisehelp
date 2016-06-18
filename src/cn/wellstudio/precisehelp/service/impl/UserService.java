package cn.wellstudio.precisehelp.service.impl;

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
				user.setUserPsw(MD5Util.MD5("Yb6CwCWP2rh1veRyn5SgCC4vHTE5Awlp"+user.getUserPsw()+account));
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
	public Usersinfo queryUsersinfo(String account) {
		
		Usersinfo info =  usersDao.queryUsersinfo(account);
		
		return info;
	}

	@Override
	public boolean updateInfo(Users users) {
		String account = users.getUserAccount();
		String userPsw = users.getUserPsw();
		String userPsw2 = users.getUserPsw2();
		String userPayPsw = users.getUserPayPsw();
		
		if(ValidateUtil.isRegUserPsw(userPsw) && userPsw.equals(userPsw2) ) {
			String md5Psw = MD5Util.MD5("Yb6CwCWP2rh1veRyn5SgCC4vHTE5Awlp"+userPsw + account);
			users.setUserPsw(md5Psw);
		}
		if(ValidateUtil.isRegUserPsw(userPayPsw) ) {
			String md5PayPsw = MD5Util.MD5("Yb6CwCWP2rh1veRyn5SgCC4vHTE5Awlp"+userPayPsw + account);
			users.setUserPayPsw(md5PayPsw);
		}
		return usersDao.updateInfo(users);
	}


	@Override
	public boolean addUser(Users users) {
		String account = users.getUserAccount();
		String userPsw = users.getUserPsw();
		String userPsw2 = users.getUserPsw2();
		String userPayPsw = users.getUserPayPsw();
//		System.out.println(account+","+userPsw);
		if(  ValidateUtil.isValidMobileNo(account) 
				&& ValidateUtil.isRegUserPsw(userPsw)
				&& ValidateUtil.isRegUserPsw(userPayPsw)
				&& userPsw.equals(userPsw2)) {
			
			users.setUserId(UUID.randomUUID().toString());
			// MD5 +盐
			String md5Psw = MD5Util.MD5("Yb6CwCWP2rh1veRyn5SgCC4vHTE5Awlp"+userPsw + account);
			String md5PayPsw = MD5Util.MD5("Yb6CwCWP2rh1veRyn5SgCC4vHTE5Awlp"+userPayPsw+account);
			users.setUserPsw(md5Psw);
			users.setUserPayPsw(md5PayPsw);
//			System.out.println("验证成功");
			return usersDao.addUser(users);
		} else {
//			System.out.println("验证失败");
			return false;
		}
	}
}
