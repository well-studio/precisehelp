package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import cn.wellstudio.precisehelp.dao.IAdminDAO;
import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.Adminsinfo;
import cn.wellstudio.precisehelp.entity.Todolist;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.entity.Usersinfo;
import cn.wellstudio.precisehelp.util.Operation;

/**
 * 管理员管理类，增删改查
 * @author xxmodd
 */
public class AdminManage extends ObjectManage implements IAdminDAO{
	
	/*
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	*/
	
	
	// 根据管理员账号修改基本信息，（有些信息不能随意更改，待补充）  test true
	public boolean adminsinfoUpdate(Adminsinfo adminsinfo) {
		return Operation.update(adminsinfo);
	}

	// 根据管理员编号查询管理员基本信息，一个管理员对应一个基本信息表 test true
	public Adminsinfo adminInfoQuery(Admins adm) {
		String hql = "from Adminsinfo as adm where adm.admins.admId = ?";
		@SuppressWarnings("unchecked")
		List<Adminsinfo> admList = Operation.hqlQuery(hql,adm.getAdmId());
		if (admList.size() == 0) {
			return null;
		}
		return admList.get(0);
	}

	// 查询所有管理员账号信息,不包括密码 test true
	@SuppressWarnings("unchecked")
	public List<Admins> adminsQuery() {
		String hql = "from Admins";
		List<Admins> admList = Operation.hqlQuery(hql);
		if (admList.size() == 0) {
			return null;
		}
		return admList;
	}

	@Override
	public boolean adminLogin(Admins admin) {
		// TODO Auto-generated method stub
		return false;
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
