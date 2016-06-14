package cn.wellstudio.precisehelp.service.impl;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.Adminsinfo;
import cn.wellstudio.precisehelp.entity.Todolist;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.entity.Usersinfo;
import cn.wellstudio.precisehelp.service.IAdminService;
/**
 * 
 * @author Administrator
 *	这是管理员的业务具体实现类
 */
public class AdminService implements IAdminService {

	@Override
	public boolean adminLogin(String admAccount, int admPower, String admPsw) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Admins> adminsQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateAdmInfo(Adminsinfo admin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Todolist> findTodoListByAdm(Admins admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Todolist> findTodoListByAdmNum(Admins admins) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usersinfo> findAllUsersinfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addOrderTolist(Todolist list) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOrderInlist(int ordersId) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
