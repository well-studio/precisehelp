package cn.wellstudio.precisehelp.service;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.Adminsinfo;
import cn.wellstudio.precisehelp.entity.Todolist;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.entity.Usersinfo;
/**
 * 管理员业务接口
 * @author huhong
 *
 */
public interface IAdminService {	
	/**
	 * 登录
	 * @param admAccount
	 * @param admPower
	 * @param admPsw
	 * @return
	 */
	public boolean adminLogin(String admAccount,int admPower,String admPsw);
	
	/**
	 * 查询全部管理员
	 * @return
	 */
	public List<Admins> adminsQuery();
	
	/**
	 * 更新管理员信息
	 * @param admin
	 * @return
	 */
	public boolean updateAdmInfo(Adminsinfo admin);
	
	
	/**
	 * 根据管理员
	 * @param admName
	 * @return
	 */
	public List<Todolist> findTodoListByAdm(Admins admin);
		
	/**
	 * 通过管理员编号查询该管理员的需要处理的订单任务列表
	 * @param admins
	 * @return
	 */
	public List<Todolist> findTodoListByAdmNum(Admins admins);
	
	/**
	 * 管理员可以查询所有用户资料
	 * @return
	 */
	public List<Usersinfo> findAllUsersinfo();
	
	/**
	 * 管理员可以查询所有用户信息
	 * @return
	 */
	public List<Users> findAllUsers();
	
	/**
	 * 添加待处理订单进入管理员的订单处理列表(接单)
	 * @param list
	 * @return
	 */
	public boolean addOrderTolist(Todolist list);
	
	/**
	 * 管理员处理完一个订单(即在管理员列表中更具订单编号删除该订单,以及正在处理中订单表中的订单)
	 * @param ordersId
	 * @return
	 */
	public boolean deleteOrderInlist(int ordersId);
}
