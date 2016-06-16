package cn.wellstudio.precisehelp.action;

import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 用户控制器
 * @author huhong
 *
 */
public class UserAction extends ActionSupport implements ModelDriven<Users>{
	
	
	IUserService usersService;
	public void setUsersService(IUserService usersService) {
		this.usersService = usersService;
	}
	
	// User
	private Users user;
	public void setUser(Users user) {
		this.user = user;
	}
	public Users getUser() {
		return user;
	}
	
	
	/**
	 * 注册
	 * @return
	 */
	public String register() {
		
		
		return null;
	}
	
	
	/**
	 * 登录
	 * @return
	 */
	public String login() {
		
		return null;
	}
	
	
	/**
	 * 更新信息
	 * @return
	 */
	public String updateInfo() {
	
		return null;
	}
	@Override
	public Users getModel() {
		return user;
	}
	
	
	
	
}
