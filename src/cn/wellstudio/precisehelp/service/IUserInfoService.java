package cn.wellstudio.precisehelp.service;

import cn.wellstudio.precisehelp.entity.Usersinfo;

/**
 * 用户信息业务接口设计
 * @author huhong
 *
 */
public interface IUserInfoService {
	
	/**
	 * 更新用户信息
	 * @param userId
	 * @return
	 */
	boolean updateUserInfo(Usersinfo usersinfo);
	
	/**
	 * 根据id查询userinfo
	 * @param userId
	 * @return
	 */
	Usersinfo findUserInfo(String userId);
	
}
