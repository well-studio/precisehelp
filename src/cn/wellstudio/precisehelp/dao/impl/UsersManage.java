package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IUsersDAO;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.entity.Usersinfo;
import cn.wellstudio.precisehelp.util.Operation;

/** 
 * 用户账号管理
 * @author xxmodd 
 */
public class UsersManage extends ObjectManage implements IUsersDAO{

	//管理员获取全部用户账号,不包含关联信息
	@SuppressWarnings("unchecked")
	public List<Users> getAllUsersMeg(){
		List<Users> userList= null;
		String hql = "from Users";
		userList = Operation.hqlQuery(hql);
		return  userList;
	}

	@Override
	public boolean userLogin(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean userPay(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usersinfo queryUsersinfo(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateInfo(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addUser(Users users) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
