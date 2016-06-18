package cn.wellstudio.precisehelp.action;



import cn.wellstudio.precisehelp.entity.Usersinfo;
import cn.wellstudio.precisehelp.service.IUserInfoService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 用户信息控制器
 * @author huhong&xxmodd
 *
 */
@SuppressWarnings("serial")
public class UserInfoAction extends ActionSupport implements ModelDriven<Usersinfo>{
	private Usersinfo usersinfo = new Usersinfo();//返回用户信息数据
	private String Msg;//返回操作信息
	
	private IUserInfoService usersInfoService;
	public void setUsersInfoService(IUserInfoService usersInfoService) {
		this.usersInfoService = usersInfoService;
	}
	public Usersinfo getUsersinfo() {
		
		return usersinfo;
	}
	public void setUsersinfo(Usersinfo usersinfo) {
		this.usersinfo = usersinfo;
	}
	
	public String getMsg() {
		return Msg;
	}
	public void setMsg(String msg) {
		Msg = msg;
	}
	
	/**
	 * 更新用户信息
	 * @param userId
	 * @return
	 */
	public String updateUserInfo(){
		if(usersInfoService.updateUserInfo(usersinfo)){
			return "updateSuceess";
		}
		Msg = "error";
		return "operationFail";
		
	}
	
	/**
	 * 根据id查询userinfo
	 * @param userId
	 * @return
	 */
	public String findUserInfo(){
		this.usersinfo = usersInfoService.findUserInfo(usersinfo.getUserId());
		if(usersinfo!=null){
			return "findSuceess";
		}
		Msg = "error";
		return "operationFail";
	}
	
	
	
	@Override
	public Usersinfo getModel() {
		return usersinfo;
	}
	
	
	
}
