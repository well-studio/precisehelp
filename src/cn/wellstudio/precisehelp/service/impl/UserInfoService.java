package cn.wellstudio.precisehelp.service.impl;

import cn.wellstudio.precisehelp.dao.IUsersinfoDAO;
import cn.wellstudio.precisehelp.entity.Usersinfo;
import cn.wellstudio.precisehelp.service.IUserInfoService;

/**
 * 用户信息业务实现
 * @author huhong
 *
 */
public class UserInfoService implements IUserInfoService {
	
	
	private IUsersinfoDAO userInfoDao;
	public void setUserInfoDao(IUsersinfoDAO userInfoDao) {
		this.userInfoDao = userInfoDao;
	}
	
	@Override
	public boolean updateUserInfo(Usersinfo usersinfo) {
		
		boolean res = userInfoDao.updateUserInfo(usersinfo);
		
		return res;
	}

	@Override
	public Usersinfo findUserInfo(String userId) {
		
		Usersinfo usersinfo = userInfoDao.findUserInfo(userId);
		
		return usersinfo;
	}

}
