package cn.wellstudio.precisehelp.action;

import cn.wellstudio.precisehelp.service.IAdminService;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 管理员控制器
 * @author huhong
 *
 */
public class AdminAction extends ActionSupport{
	
	
	IAdminService adminService;
	public void setAdminService(IAdminService adminService) {
		this.adminService = adminService;
	}
	
	/**
	 * 管理员登录
	 * @return
	 */
	public String login() {
		
		
		return null;
	}
	
	
	/**
	 * 添加待处理订单进入管理员的订单处理列表
	 * @return
	 */
	public String addOrderTolist() {
		
		return null;
	}
	
	/**
	 * 管理员处理完一个订单
	 * @return
	 */
	public String handleOrder() {
		
		return null;
	}
	
	/**
	 * 更新管理员信息
	 * @return
	 */
	public String updateAdmInfo() {
		
		return null;
	}
	
	/**
	 * 根据管理员查询任务处理清单
	 * @return
	 */
	public String findTodoListByAdm() {
		
		return null;
	}
}