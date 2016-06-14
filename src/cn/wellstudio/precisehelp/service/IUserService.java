package cn.wellstudio.precisehelp.service;

import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.entity.Usersinfo;

/**
 * 用户业务接口设计
 * @author huhong
 *
 */
public interface IUserService {
	
	/**
	 * 用户登录
	 * @param userAccount
	 * @param userPsw
	 * @param userPaypsw
	 * @return
	 */
	public boolean userLogin(Users user);
	
	/**
	 * 用户支付
	 * @param user
	 * @return
	 */
	public boolean userPay(Users user);
	
	/**
	 * 根据用户id查询用户信息
	 * @param users
	 * @return
	 */
	public Usersinfo queryUsersinfo(String id);
	
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 */
	public boolean updateInfo(Users user);
	
	/**
	 * 添加用户
	 * @param users
	 * @return
	 */
	public boolean addUser(Users users);
}
