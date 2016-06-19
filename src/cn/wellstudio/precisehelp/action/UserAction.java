package cn.wellstudio.precisehelp.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.entity.Usersinfo;
import cn.wellstudio.precisehelp.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 用户控制器
 * @author huhong&xxmodd
 *
 */
@SuppressWarnings("serial")
public class UserAction extends ActionSupport implements SessionAware,ModelDriven<Users>{
	//session
	private Map<String, Object> session;
	//接收的数据
	private Users user = new Users();// User
//	private Usersinfo usersinfo = new Usersinfo();//用户信息
	private Map<String, Object> valueMap = new HashMap<String, Object>();
	//返回的数据
	private String Msg;//返回请求信息
	public void setMsg(String msg) {
		Msg = msg;
	}
	public String getMsg() {
		return Msg;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Users getUser() {
		return user;
	}
	


	public Map<String, Object> getValueMap() {
		return valueMap;
	}
	public void setValueMap(Map<String, Object> valueMap) {
		this.valueMap = valueMap;
	}



	IUserService usersService;
	
	
	public void setUsersService(IUserService usersService) {
		this.usersService = usersService;
	}
	
	/**
	 * 注册 
	 * @return
	 */
	public String register() {
		System.out.println("test");
		if(usersService.addUser(user)){
			return "registerSuceess";
		}
		Msg = "Fail";
		return "operationFail";
	}
	
	
	/**
	 * 登录 ok
	 * @return
	 */
	public String login() {
		if(usersService.userLogin(user)){
			//登入成功，保存登入信息
			session.put("loginInfo", user);
			valueMap.put("user", user);
			valueMap.put("userinfo", usersService.queryUsersinfo(user.getUserAccount()));
			return "valueMap";
		}
		Msg = "用户名或密码错误！";
		return "operationFail";
	}
	
	/**
	 * 更新信息
	 * @return
	 */
//	public String updateInfo() {
//		if(usersService.updateInfo(user)){
//			return "updateSuceess";
//		}
//		Msg = "Fail";
//		return "operationFail";
//	}
	

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	@Override
	public Users getModel() {
		return user;
	}
	
	
}
