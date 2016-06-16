package cn.wellstudio.precisehelp.service.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IAdminDAO;
import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.Adminsinfo;
import cn.wellstudio.precisehelp.entity.Todolist;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.entity.Usersinfo;
import cn.wellstudio.precisehelp.service.IAdminService;

/**
 * 管理员业务实现类
 * @author huhong
 *
 */
public class AdminService implements IAdminService {

	IAdminDAO adminDao;
	public void setAdminDao(IAdminDAO adminDao) {
		this.adminDao = adminDao;
	}
	
	@Override
	public boolean adminLogin(Admins admin) {
		
		String acount = admin.getAdmAccount();
		String psw = admin.getAdmPsw();
		
		boolean res = adminDao.adminLogin(admin);
		
		return res;
	}

	@Override
	public List<Admins> adminsQuery() {
		
		// 判断权限？
		List<Admins> admList = adminDao.adminsQuery();
		
		return admList;
	}

	@Override
	public boolean updateAdmInfo(Adminsinfo admin) {
		
		boolean res = adminDao.updateAdmInfo(admin);
		
		return res;
	}

	@Override
	public List<Todolist> findTodoListByAdm(Admins admin) {
		
		List<Todolist> todoList = adminDao.findTodoListByAdm(admin);
		
		return todoList;
	}

	@Override
	public List<Todolist> findTodoListByAdmNum(Admins admins) {
		
		List<Todolist> todoList = adminDao.findTodoListByAdmNum(admins);
		
		return todoList;
	}

	@Override
	public List<Usersinfo> findAllUsersinfo() {
		
		List<Usersinfo> usersInfoList = adminDao.findAllUsersinfo();
		
		return usersInfoList;
	}

	@Override
	public List<Users> findAllUsers() {
		
		List<Users> userList = adminDao.findAllUsers();
		
		return null;
	}

	@Override
	public boolean addOrderTolist(Todolist list) {
		
		boolean res = adminDao.addOrderTolist(list);
		
		return false;
	}

	@Override
	public boolean deleteOrderInlist(int ordersId) {
		
		boolean res = adminDao.deleteOrderInlist(ordersId);
		
		return false;
	}
	
	
}
