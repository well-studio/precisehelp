package cn.wellstudio.precisehelp.service.impl;

import cn.wellstudio.precisehelp.dao.IUsersinfoDAO;
import cn.wellstudio.precisehelp.entity.Usersinfo;
import cn.wellstudio.precisehelp.service.IUserInfoService;
import cn.wellstudio.precisehelp.util.ValidateUtil;

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
		boolean res = false;
		Integer usersinfoId = usersinfo.getUsersinfoId();
		String userIdnum = usersinfo.getUserIdnum();
		String userImg = usersinfo.getUserImg();
		String userNickname = usersinfo.getUserNickname();
		String userPhone = usersinfo.getUserPhone();
		String userRname = usersinfo.getUserRname();
		String userSex = usersinfo.getUserSex();
		String userSign = usersinfo.getUserSign();
		String userId = usersinfo.getUserId();
		Usersinfo usersInfo2 = userInfoDao.findUserInfo(userId);
		
		if( usersinfoId == null)
			usersinfo.setUsersinfoId(usersInfo2.getUsersinfoId());
		if( userIdnum == null)
			usersinfo.setUserIdnum(usersInfo2.getUserIdnum());
		if( userImg == null)
			usersinfo.setUserImg(usersInfo2.getUserImg());
		if( userNickname == null)
			usersinfo.setUserNickname(usersInfo2.getUserNickname());
		if( userPhone == null)
			usersinfo.setUserPhone(usersInfo2.getUserPhone());
		if( userRname == null )
			usersinfo.setUserRname(usersInfo2.getUserRname());
		if( userSex == null)
			usersinfo.setUserSex(usersInfo2.getUserSex());
		if( userSign == null)
			usersinfo.setUserSign(usersInfo2.getUserSign());
		
		// 校验
		if(ValidateUtil.IsSignLength(userSign)
				&& ValidateUtil.isValidNickName(userRname)
				&& ValidateUtil.isValidName(userRname)
				&& ValidateUtil.isValidIdCard(userIdnum )) {
			
			res = userInfoDao.updateUserInfo(usersinfo);
			
		}
		return res;
	}

	@Override
	public Usersinfo findUserInfo(String userId) {
		
		Usersinfo usersinfo = userInfoDao.findUserInfo(userId);
		
		return usersinfo;
	}

}
